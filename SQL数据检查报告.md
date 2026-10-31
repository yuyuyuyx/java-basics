# SQL 数据检查报告

> **检查时间**：2026-10-31 22:10
> **实例**：MySQL 8.0.46（WSL 内 Docker 容器 `mysql-db`，宿主端口 `3307`）
> **连接方式**：`mysql -h127.0.0.1 -P3307 -uroot` 直连（与 IDEA Database 控制台连的是同一个实例）
> **范围**：`practice_db`、`shop_practice`、`ycx_study` 三个库，共 14 张表
> **状态**：三个库已于 2026-10-31 22:27 删除，删除前已备份到 `~/sql-backup-2026-10-31.sql`（20 KB）；本报告为删除前的快照。

---

## 0. 结论速览

| 项 | 数值 |
|---|---|
| 库 | 3 个 |
| 表 | 14 张（全部 InnoDB） |
| 数据行 | 114 行 |
| 外键 | 7 条，全部集中在 `shop_practice` |
| 字符集 | `utf8mb4`；排序规则两种混用（见 §6） |
| 明显的数据错误 | 1 条孤儿记录（`ycx_study.Address.personId=3`） |
| 空表 | 2 张（`ycx_study.one`、`ycx_study.student`） |

**一句话**：`shop_practice` 是一个结构完整、数据自洽的电商练习库（6 表 / 98 行 / 7 条外键，22 张订单的金额与明细一分不差）；`practice_db` 是语法练习库（3 表 / 11 行 / 无外键）；`ycx_study` 是零散测试库（5 表 / 5 行 / 几乎没有约束）。

| 库 | 表数 | 行数 | 排序规则 | 定位 |
|---|---:|---:|---|---|
| `shop_practice` | 6 | 98 | `utf8mb4_general_ci` | 电商业务综合练习（由 `DQL练习.sql` 生成） |
| `practice_db` | 3 | 11 | `utf8mb4_0900_ai_ci` | 单表增删改查、DCL 语法练习 |
| `ycx_study` | 5 | 5 | `utf8mb4_0900_ai_ci` | 建表/改表、LeetCode 数据库题的零散表 |

服务器模式：`ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION`

---

## 1. `shop_practice` —— 电商练习库（重点）

### 1.1 结构总览

```
                    ┌──────────────┐
                    │  categories  │ 8 行，自引用 parent_id（两级树）
                    └──────┬───────┘
                           │ 1:N
                    ┌──────▼───────┐
                    │   products   │ 16 行
                    └──────┬───────┘
                           │ 1:N
┌───────────┐       ┌──────▼───────┐        ┌────────────┐
│ customers │ 1:N   │  order_items │  N:1   │   orders   │
│   10 行   ├──────►│    37 行     │◄───────┤   22 行    │
└───────────┘       └──────────────┘        └─────┬──────┘
                                                  │ N:1
                                            ┌─────▼──────┐
                                            │  employees │ 5 行，自引用 manager_id
                                            └────────────┘
```

- `customers` → `orders`：一个客户多张订单
- `orders` → `order_items`：一张订单多条明细（`ON DELETE CASCADE`）
- `products` → `order_items`：一个商品可出现在多条明细
- `categories.parent_id`、`employees.manager_id`：自引用形成分类树 / 汇报线

### 1.2 表清单

| 表 | 行数 | 主键 | 外键 | 说明 |
|---|---:|---|---|---|
| `categories` | 8 | `category_id` | `parent_id` → 自身 | 商品分类，两级树 |
| `customers` | 10 | `customer_id` | — | 客户档案，手机号唯一 |
| `employees` | 5 | `employee_id` | `manager_id` → 自身 | 业务员，销售部 4 人 + 客服部 1 人 |
| `products` | 16 | `product_id` | `category_id` → `categories` | 商品，含上下架状态 |
| `orders` | 22 | `order_id` | `customer_id`、`employee_id` | 订单头，订单号唯一 |
| `order_items` | 37 | `item_id` | `order_id`（级联删）、`product_id` | 订单明细，成交单价快照 |

共 6 张表、7 条外键，外键列全部有索引支撑。

### 1.3 字段字典（核心四表）

**orders（订单头，22 行）**

| 字段 | 类型 | 约束 | 含义 |
|---|---|---|---|
| `order_id` | int | PK, AUTO_INCREMENT | 订单 ID |
| `order_no` | varchar(30) | NOT NULL, UNIQUE | 订单号，统一格式 `SO2024…`（13 位） |
| `customer_id` | int | NOT NULL, FK → customers, idx | 客户 |
| `employee_id` | int | NULL, FK → employees, idx | 负责业务员 |
| `order_date` | date | NOT NULL, idx | 下单日期 |
| `status` | varchar(10) | NOT NULL, 默认 `待付款` | 待付款/待发货/已发货/已完成/已取消 |
| `total_amount` | decimal(12,2) | NOT NULL, 默认 0.00 | 订单总金额 |

**order_items（明细，37 行）**

| 字段 | 类型 | 约束 | 含义 |
|---|---|---|---|
| `item_id` | int | PK | 明细 ID |
| `order_id` | int | NOT NULL, FK（CASCADE） | 所属订单 |
| `product_id` | int | NOT NULL, FK → products | 商品 |
| `quantity` | int | NOT NULL, 默认 1 | 数量，实测全部 > 0 |
| `unit_price` | decimal(10,2) | NOT NULL | 成交单价快照，实测全部 > 0 |

**products（商品，16 行）**

| 字段 | 类型 | 约束 | 含义 |
|---|---|---|---|
| `product_id` | int | PK | 商品 ID |
| `product_name` | varchar(100) | NOT NULL | 名称 |
| `category_id` | int | NOT NULL, FK, idx | 所属分类 |
| `price` | decimal(10,2) | NOT NULL | 标价 |
| `stock` | int | NOT NULL, 默认 0 | 库存（实测 20 ~ 500，无 0） |
| `status` | tinyint | NOT NULL, 默认 1 | 1 上架 / 0 下架 |
| `created_at` | datetime | NOT NULL, 默认 CURRENT_TIMESTAMP | 创建时间 |

**customers（客户，10 行）**

| 字段 | 类型 | 约束 | 含义 |
|---|---|---|---|
| `customer_id` | int | PK | 客户 ID |
| `customer_name` | varchar(50) | NOT NULL | 姓名 |
| `gender` | enum('男','女') | 默认 男 | 性别 |
| `phone` | varchar(20) | UNIQUE（`uk_phone`） | 手机号 |
| `email` | varchar(100) | — | 邮箱 |
| `city` | varchar(50) | idx（`idx_city`） | 城市 |
| `register_date` | date | NOT NULL | 注册日期 |
| `vip_level` | tinyint | NOT NULL, 默认 0 | 0–3 |

`categories`：`category_id` / `category_name` / `parent_id`（自引用，`idx_parent`）。
`employees`：`employee_id` / `emp_name` / `position` / `dept` / `hire_date` / `salary` / `manager_id`（自引用，`idx_manager`）。

### 1.4 索引一览

| 表 | 唯一索引 | 普通索引 |
|---|---|---|
| `customers` | `uk_phone(phone)` | `idx_city(city)` |
| `orders` | `uk_order_no(order_no)` | `idx_customer`、`idx_employee`、`idx_order_date` |
| `order_items` | — | `idx_order`、`idx_product` |
| `products` | — | `idx_category` |
| `categories` | — | `idx_parent` |
| `employees` | — | `idx_manager` |

外键覆盖的列都有索引，符合 MySQL 建 FK 的隐性要求，没有冗余索引。

### 1.5 数据现状

**订单状态分布**（22 单，合计 ¥101,713.00）

| 状态 | 单数 | 金额 |
|---|---:|---:|
| 已完成 | 17 | 89,284.00 |
| 待发货 | 2 | 11,196.00 |
| 已取消 | 1 | 598.00 |
| 已发货 | 1 | 398.00 |
| 待付款 | 1 | 237.00 |

- 日期跨度：`2024-01-05` ~ `2024-07-08`；客户注册跨度：`2023-01-05` ~ `2023-10-01`
- 订单号全部为 `SO2024` + 9 位，长度统一 13

**商品结构**（16 个商品 / 6 个叶子分类）

| 分类 | 商品数 | 均价 | 最低库存 |
|---|---:|---:|---:|
| 手机 | 3 | 5,165.67 | 80 |
| 笔记本电脑 | 3 | 7,932.33 | 30 |
| 家用电器 | 3 | 1,965.67 | 20 |
| 图书 | 3 | 95.67 | 300 |
| 男装 | 2 | 149.00 | 200 |
| 女装 | 2 | 399.00 | 80 |

- 分类树：`电子产品`(1) → `手机`(2)、`笔记本电脑`(3)；`服装`(6) → `男装`(7)、`女装`(8)；`家用电器`(4)、`图书`(5) 为独立根节点
- `电子产品`、`服装` 两个根节点不直接挂商品（符合"根分类只做聚合"的设计）
- 上下架：15 个上架，1 个下架（`女士风衣`，¥499，库存 80）
- 16 个商品全部至少被卖过 1 次，没有"零销量"商品

**销量 Top 5**

| 商品 | 销量 | 销售额 |
|---|---:|---:|
| SQL必知必会 | 7 | 413.00 |
| 男士纯棉T恤 | 5 | 495.00 |
| Python编程 | 4 | 356.00 |
| 美的电饭煲 | 4 | 1,596.00 |
| 小米 14 | 3 | 11,997.00 |

**客户消费 Top 3**：郑凯（VIP3）¥20,997 / 2 单；李小红（VIP2）¥15,294 / 3 单；冯丽（VIP1）¥15,235 / 2 单。10 个客户分布在 10 个不同城市，每人 2–3 单，无零单客户。

---

## 2. `practice_db` —— 语法练习库（3 表 / 11 行）

| 表 | 行数 | 结构 | 备注 |
|---|---:|---|---|
| `employees` | 4 | `id` PK，`name`、`age`、`department`、`salary` | 张三/李四/王五/赵六，研发部 2 人 |
| `orders` | 3 | `id` PK，`employee_id`、`amount`、`order_date` | **`employee_id` 没有外键**，只是普通列 |
| `sys_user` | 4 | `user_id` PK，`username` UNIQUE，`password`、`real_name`、`phone`、`status`、`create_time` | 演示 DCL/用户表 |

- 数据：订单 3 笔共 ¥8,100（5000 / 3000 / 100），日期 2023-10-01 ~ 2023-10-05
- `sys_user` 4 条记录密码字段完全相同，值 `e10adc3949ba59abbe56e057f20f883e` = **MD5("123456")**，是明文弱口令级别的教学演示
- 这一库没有任何外键，`orders.employee_id` 引用的员工并不强制存在（当前数据恰好都对得上，孤儿 0 条）

---

## 3. `ycx_study` —— 零散练习库（5 表 / 5 行）

| 表 | 行数 | 主键 | 结构 |
|---|---:|---|---|
| `Person` | 2 | **无** | `personId`、`lastName`、`firstName` |
| `Address` | 2 | **无** | `addressId`、`personId`、`city`、`state` |
| `one` | 0 | **无** | `id`、`name`、`age`、`gender`（建表练习） |
| `student` | 0 | **无** | `id`、`name`（建表练习） |
| `test_user` | 1 | `id` | `id`、`name`、`age` |

- 除 `test_user` 外全部无主键、无索引、无外键，属于典型的"建表语法练习残留"
- `Address.personId = 3` 在 `Person` 里不存在 → **唯一一条孤儿数据**
- `one`、`student` 两张空表，没有任何数据

---

## 4. 数据质量检查结果

| # | 检查项 | 方法 | 结果 |
|---|---|---|---|
| 1 | 订单金额一致性 | `orders.total_amount` vs `SUM(quantity × unit_price)` | ✅ 22/22 全部相等，最大差异 0.00 |
| 2 | 外键孤儿 | 5 组 LEFT JOIN 反查 | ✅ 0 条（`shop_practice`） |
| 3 | 明细异常值 | `quantity <= 0` / `unit_price <= 0` | ✅ 0 条 |
| 4 | 关键字段空值 | `customers.phone/email/city`、`employees.salary/age` | ✅ 0 条 |
| 5 | 唯一约束 | `uk_order_no`、`uk_phone` | ✅ 无重复（有约束兜底） |
| 6 | 订单号格式 | 前缀 + 长度分组 | ✅ 22 单全部 `SO2024…`，长度 13 |
| 7 | 孤立记录 | `ycx_study.Address` ↔ `Person` | ❌ **1 条**（personId=3） |
| 8 | 空表 | 行数统计 | ⚠️ 2 张（`one`、`student`） |
| 9 | 密码强度 | 值比对 | ⚠️ `sys_user` 4 条全部 MD5("123456") |
| 10 | 字符集一致性 | `information_schema.SCHEMATA` | ⚠️ 两种排序规则混用 |

---

## 5. 仓库里的 4 个 SQL 脚本 vs 实际库

| 脚本 | 实际作用 | 对应库/表 | 当前能否原样重跑 |
|---|---|---|---|
| `DQL练习.sql`（16.3 KB） | 建库 + 6 张表 + 全量演示数据（8/10/5/16/22/37） | `shop_practice` 整个库 | ❌ 第 7 行 `CREATE DATABASE shop_practice` 没有 `IF NOT EXISTS`，第二次跑会报库已存在 |
| `DCL用户访问数据.sql`（3.8 KB） | 建 `practice_db` + `employees` / `orders` / `sys_user` + 示例数据 | `practice_db` | ✅ 有 `IF NOT EXISTS`，但会重复插入 |
| `DDL语句练习表结构调教.sql`（3.5 KB） | 建 `second` 库、`ycx_study.student` / `one`、`员工信息表`，随后 `ALTER` 改名 `employee` 再 `DROP` | `ycx_study`（+ 一个已消失的 `second` 库） | ⚠️ 会重建两张空表；`second` 库当前不存在 |
| `02_DML语句练习_数据操作.sql`（1.2 KB） | 往 `员工信息表` 插数据 | 这张表**已被 DDL 脚本改名并删除** | ❌ 直接跑必然 `ERROR 1146 (42S02): Table '员工信息表' doesn't exist` |

> 注：上表中的 4 个脚本已于同日整理进 `sql/` 目录：`01_ddl.sql`、`02_dql.sql`、`03_dcl.sql`；`02_DML` 因引用的表已不存在而被删除。

也就是说：`shop_practice` 是 `DQL练习.sql` 的完整产物，数据与脚本逐行对得上；而 `02_DML` 依赖 `DDL` 脚本的**中间状态**，两个脚本分开跑没有意义。

---

## 6. 问题与建议（按优先级）

1. **字符集不一致**：`shop_practice` 用 `utf8mb4_general_ci`，另两个库用 `utf8mb4_0900_ai_ci`。同库内 JOIN 没问题，但跨库 JOIN 或以后迁表时可能出现 `Illegal mix of collations`。建议后续统一到 `utf8mb4_0900_ai_ci`。
2. **`ycx_study` 缺约束**：`Person` / `Address` / `one` / `student` 无主键，`Address.personId=3` 是孤儿。建议给 `Person(personId)` 加 PK、`Address` 加 PK + 外键，并删掉两张空表。
3. **`02_DML` 脚本已失效**：`员工信息表` 被 DDL 脚本 `DROP` 了。要么把插入改成写 `employees`，要么在 DML 里补建表语句，否则这份练习无法复现。
4. **`sys_user` 明文 MD5 密码**：教学演示可以，但真实项目必须换 bcrypt/Argon2 并加盐。
5. **`practice_db.orders.employee_id` 无外键**：当前数据没有孤儿，但约束缺失；如果这个库只是语法练习则无所谓，若要当业务库用应补 FK。
6. **`DQL练习.sql` 不可重跑**：建议把建库改成 `CREATE DATABASE IF NOT EXISTS`，或文件开头加 `DROP DATABASE IF EXISTS shop_practice` 的"重置段"。

---

## 附：本次检查执行的查询（节选）

```sql
-- 结构
SHOW CREATE TABLE shop_practice.orders;
SELECT * FROM information_schema.KEY_COLUMN_USAGE
 WHERE TABLE_SCHEMA='shop_practice' AND REFERENCED_TABLE_NAME IS NOT NULL;

-- 金额一致性（22 单全部 diff = 0）
SELECT o.order_id, o.total_amount,
       ROUND(SUM(i.quantity * i.unit_price), 2) AS calc,
       ROUND(o.total_amount - SUM(i.quantity * i.unit_price), 2) AS diff
  FROM shop_practice.orders o
  LEFT JOIN shop_practice.order_items i ON i.order_id = o.order_id
 GROUP BY o.order_id, o.total_amount
HAVING ABS(diff) > 0.01;

-- 孤儿检查（结果：1 条）
SELECT COUNT(*) FROM ycx_study.Address a
  LEFT JOIN ycx_study.Person p ON p.personId = a.personId
 WHERE p.personId IS NULL;
```
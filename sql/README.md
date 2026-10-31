# SQL 练习脚本

三个脚本互相独立，各自建自己的库，按编号顺序跑即可。

| 文件 | 作用 | 建的库 |
|---|---|---|
| `01_ddl.sql` | 建表、`ALTER` 改表、`DROP` 删表 | `second`、`ycx_study` |
| `02_dql.sql` | 电商练习库：6 张表 + 98 行演示数据，多表查询素材 | `shop_practice` |
| `03_dcl.sql` | 建表 + 增删改查示例 + `CREATE USER` / `GRANT` | `practice_db` |

## 怎么跑

```bash
mysql -h127.0.0.1 -P3307 -uroot -p < sql/02_dql.sql
```

## 注意

- 建库语句不都是 `IF NOT EXISTS`，重复执行前先删库：
  `DROP DATABASE IF EXISTS shop_practice;`
- `01_ddl.sql` 会建一张 `员工信息表`，一路 `ALTER` 改名成 `employee` 后在文件末尾 `DROP`，所以跑完只剩 `student`、`one` 两张空表，这是正常的。

## 各库用途

| 库 | 来自 | 用来练什么 |
|---|---|---|
| `shop_practice` | `02_dql.sql` | 多表 JOIN、子查询、聚合、窗口函数、索引 |
| `practice_db` | `03_dcl.sql` | 单表 CRUD、用户与权限管理 |
| `ycx_study` | `01_ddl.sql` | 建表/改表语法，做完即弃 |
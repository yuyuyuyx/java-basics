-- ============================================================
--  电商练习库 shop_practice  （MySQL 8.0+）
--  包含：建库、建表、外键、示例数据、练习查询
-- ============================================================
#方言指的是数据库之间不同的地方
DROP DATABASE IF EXISTS shop_practice;
CREATE DATABASE shop_practice DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE shop_practice;

-- ------------------------------------------------------------
-- 1. 客户表
-- ------------------------------------------------------------
CREATE TABLE customers
(
    customer_id   INT         NOT NULL AUTO_INCREMENT COMMENT '客户ID',
    customer_name VARCHAR(50) NOT NULL COMMENT '客户姓名',
    gender        ENUM ('男','女')     DEFAULT '男' COMMENT '性别',
    phone         VARCHAR(20) COMMENT '手机号',
    email         VARCHAR(100) COMMENT '邮箱',
    city          VARCHAR(50) COMMENT '所在城市',
    register_date DATE        NOT NULL COMMENT '注册日期',
    vip_level     TINYINT     NOT NULL DEFAULT 0 COMMENT 'VIP等级 0-3',
    PRIMARY KEY (customer_id),
    UNIQUE KEY uk_phone (phone),
    KEY idx_city (city)
) ENGINE = InnoDB COMMENT ='客户表';

SELECT customer_name, customer_id, phone
FROM customers;
#查询一下客户名字，编号，电话号
SELECT *
FROM customers
WHERE gender = '男';
#查询男客户
SELECT*
FROM customers
WHERE vip_level = 2
   OR vip_level = 3;
#查询VIP等级为2和3的客户
#为啥用and不行？因为and需要VIP同时为2和3的数据，但这不存在，等级不能重叠

#查询白嫖党
SELECT*
FROM customers
WHERE vip_level = 0;
#查询氪金用户
SELECT*
FROM customers
WHERE vip_level <> 0;
#in的写法等效查询VIP用户
SELECT*
FROM customers
WHERE vip_level IN (1, 2, 3);
#查询老客户
SELECT*#*可以改成具体数据项，这样可以任意设置要展示的内容，*是用来全展示的
FROM customers
WHERE register_date BETWEEN (SELECT MIN(register_date) FROM customers) AND (SELECT MAX(register_date) FROM customers);
#min max里面可以计算数据最值，写数据项就行，select必须用，from代表来自哪张表
#查询二字名和四字名客户
SELECT*
FROM customers
WHERE customer_name LIKE '___';
#这里不能用or来同时查询二字和三字，_代表一个字符
#查询邮箱从c开头的客户
SELECT*
FROM customers
WHERE email LIKE 'c%';
#%表明，只要前面是c,后面是啥无所谓
#查询客户数量
SELECT COUNT(customers.customer_id)
FROM customers;
#查询客户的平均VIP等级
SELECT AVG(customers.vip_level)
FROM customers;
#Avg是平均数
#SELECT*FROM customers;#把字段列出来，少用*不直观
SELECT customers.customer_name,
       customers.customer_id,
       customers.gender,
       customers.phone,
       customers.email,
       customers.city
FROM customers;
#这里可以把所有数据项都列出来
#给数据项起别名
SELECT customer_name AS '客户名'
FROM customers;
SELECT customer_name '客户'
FROM customers;
#as可以省略
#distinct可以去掉重复记录 select distinct数据项from表名
-- ------------------------------------------------------------
-- 2. 商品分类表（自关联，支持多级分类）
-- ------------------------------------------------------------
CREATE TABLE categories
(
    category_id   INT         NOT NULL AUTO_INCREMENT COMMENT '分类ID',
    category_name VARCHAR(50) NOT NULL COMMENT '分类名称',
    parent_id     INT DEFAULT NULL COMMENT '父分类ID',
    PRIMARY KEY (category_id),
    KEY idx_parent (parent_id),
    CONSTRAINT fk_category_parent FOREIGN KEY (parent_id)
        REFERENCES categories (category_id)
) ENGINE = InnoDB COMMENT ='商品分类表';

-- ------------------------------------------------------------
-- 3. 员工表（自关联，表示上下级）
-- ------------------------------------------------------------
CREATE TABLE employees
(
    employee_id INT         NOT NULL AUTO_INCREMENT COMMENT '员工ID',
    emp_name    VARCHAR(50) NOT NULL COMMENT '员工姓名',
    position    VARCHAR(50) COMMENT '职位',
    dept        VARCHAR(50) COMMENT '部门',
    hire_date   DATE COMMENT '入职日期',
    salary      DECIMAL(10, 2) COMMENT '月薪',
    manager_id  INT DEFAULT NULL COMMENT '直属上级ID',
    PRIMARY KEY (employee_id),
    KEY idx_manager (manager_id),
    CONSTRAINT fk_emp_manager FOREIGN KEY (manager_id)
        REFERENCES employees (employee_id)
) ENGINE = InnoDB COMMENT ='员工表';
#查询薪资为 7000, 7500, 12000, 18000 的员工所有信息
SELECT *
FROM employees
WHERE salary IN (7000, 7500, 12000, 18000);
#查询部门为 '销售部'，并且入职日期在 '2020-01-01' 到 '2022-12-31'（含）以内，且姓名为 两个字 的员工信息
SELECT*
FROM employees
WHERE hire_date BETWEEN '2020-01-01' AND '2022-12-31'
   OR emp_name = '__';

#统计某部门月薪5000在25以上的员工
SELECT COUNT(employees.salary > 5000)
FROM employees;
SELECT employees.employee_id
FROM employees;
#等效操作
SELECT COUNT(employees.employee_id)
FROM employees
WHERE salary > 5000;
#别用sum,那是对该数据项的全部数据进行求和，并且不能对varchar类型操作，在这里相当于把所有人id加在一起求和
#null不参与聚合函数计算
#统计员工表中，薪资大于 7000 的，销售部和客服部的员工人数
SELECT dept, COUNT(*) AS 人数
FROM employees
WHERE salary > 7000
  AND dept IN ('销售部', '客服部') -- 限制只看这两个部门
GROUP BY dept;
-- 告诉 MySQL 按部门分组


#根据部门分组，统计每个部门的薪资平均数
SELECT dept, AVG(employees.salary)
FROM employees
GROUP BY dept;
#语句结构大致为：select 要查看的数据项 操作 哪张表 分组条件having/where条件
#分组之前用where，之后用group by 先执行where，再是聚合函数，最后是分组条件
#分组之后数据项采用的是分组后的数据项，加别的没意义，比如dept是分组条件，select处强行加个emp_name就只能显示第一个符合条件的人的名字，不能显示全部，无意义

#查询所有薪资小于等于 10000 员工的姓名（emp_name）和薪资（salary），并对查询结果按薪资升序排序，如果薪资相同按入职日期降序排序。
SELECT employees.emp_name, employees.salary, hire_date
FROM employees
WHERE salary <= 10000
ORDER BY salary ASC, employees.hire_date DESC;



-- ------------------------------------------------------------
-- 4. 商品表
-- ------------------------------------------------------------
CREATE TABLE products
(
    product_id   INT            NOT NULL AUTO_INCREMENT COMMENT '商品ID',
    product_name VARCHAR(100)   NOT NULL COMMENT '商品名称',
    category_id  INT            NOT NULL COMMENT '分类ID',
    price        DECIMAL(10, 2) NOT NULL COMMENT '单价',
    stock        INT            NOT NULL DEFAULT 0 COMMENT '库存',
    status       TINYINT        NOT NULL DEFAULT 1 COMMENT '1上架 0下架',
    created_at   DATETIME       NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    PRIMARY KEY (product_id),
    KEY idx_category (category_id),
    CONSTRAINT fk_product_category FOREIGN KEY (category_id)
        REFERENCES categories (category_id)
) ENGINE = InnoDB COMMENT ='商品表';
#根据单价升降序（order by）
SELECT product_name, price
FROM products
ORDER BY price ASC;#升序
SELECT product_name, price
FROM products
ORDER BY price DESC;
#降序
#如果两条查询语句用的同一批数据，就会一张表共用，根据语句不同切换外形（SQL偷懒）
#先按照创建时间升序，如果创建时间相同再按照价格降序
SELECT products.product_name, created_at, price
FROM products
ORDER BY created_at ASC, price DESC;

-- ------------------------------------------------------------
-- 5. 订单表
-- ------------------------------------------------------------
CREATE TABLE orders
(
    order_id     INT            NOT NULL AUTO_INCREMENT COMMENT '订单ID',
    order_no     VARCHAR(30)    NOT NULL COMMENT '订单号',
    customer_id  INT            NOT NULL COMMENT '客户ID',
    employee_id  INT                     DEFAULT NULL COMMENT '负责业务员ID',
    order_date   DATE           NOT NULL COMMENT '下单日期',
    status       VARCHAR(10)    NOT NULL DEFAULT '待付款'
        COMMENT '待付款/待发货/已发货/已完成/已取消',
    total_amount DECIMAL(12, 2) NOT NULL DEFAULT 0 COMMENT '订单总金额',
    PRIMARY KEY (order_id),
    UNIQUE KEY uk_order_no (order_no),
    KEY idx_customer (customer_id),
    KEY idx_employee (employee_id),
    KEY idx_order_date (order_date),
    CONSTRAINT fk_order_customer FOREIGN KEY (customer_id)
        REFERENCES customers (customer_id),
    CONSTRAINT fk_order_employee FOREIGN KEY (employee_id)
        REFERENCES employees (employee_id)
) ENGINE = InnoDB COMMENT ='订单表';
#查询第一页订单记录,每页记录数10条,不写条数查不出来
SELECT orders.order_no
FROM orders
LIMIT 0,10;
#第一页查询第一个数字可以省略
#查询第二页订单记录,每页记录数10条,不写条数查不出来
SELECT orders.order_no
FROM orders
LIMIT 10,10;
#起始索引（第一个数字）公式：（查询页码-1）*每页记录数（第二个数字）


-- ------------------------------------------------------------
-- 6. 订单明细表
-- ------------------------------------------------------------
CREATE TABLE order_items
(
    item_id    INT            NOT NULL AUTO_INCREMENT COMMENT '明细ID',
    order_id   INT            NOT NULL COMMENT '订单ID',
    product_id INT            NOT NULL COMMENT '商品ID',
    quantity   INT            NOT NULL DEFAULT 1 COMMENT '数量',
    unit_price DECIMAL(10, 2) NOT NULL COMMENT '成交单价',
    PRIMARY KEY (item_id),
    KEY idx_order (order_id),
    KEY idx_product (product_id),
    CONSTRAINT fk_item_order FOREIGN KEY (order_id)
        REFERENCES orders (order_id) ON DELETE CASCADE,
    CONSTRAINT fk_item_product FOREIGN KEY (product_id)
        REFERENCES products (product_id)
) ENGINE = InnoDB COMMENT ='订单明细表';


-- ============================================================
--  示例数据
-- ============================================================

-- 客户
INSERT INTO customers (customer_name, gender, phone, email, city, register_date, vip_level)
VALUES ('张小明', '男', '13800000001', 'zhangxm@qq.com', '北京', '2023-01-05', 3),
       ('李小红', '女', '13800000002', 'lixh@163.com', '上海', '2023-02-11', 2),
       ('王大力', '男', '13800000003', 'wangdl@qq.com', '广州', '2023-03-20', 1),
       ('赵敏', '女', '13800000004', 'zhaomin@126.com', '深圳', '2023-04-15', 0),
       ('孙悦', '女', '13800000005', 'sunyue@qq.com', '杭州', '2023-05-09', 2),
       ('周杰', '男', '13800000006', 'zhoujie@163.com', '成都', '2023-06-18', 1),
       ('吴倩', '女', '13800000007', 'wuqian@qq.com', '武汉', '2023-07-22', 0),
       ('郑凯', '男', '13800000008', 'zhengkai@126.com', '西安', '2023-08-30', 3),
       ('冯丽', '女', '13800000009', 'fengli@qq.com', '南京', '2023-09-14', 1),
       ('陈晨', '男', '13800000010', 'chenchen@163.com', '重庆', '2023-10-01', 0);

-- 分类
INSERT INTO categories (category_name, parent_id)
VALUES ('电子产品', NULL), -- 1
       ('手机', 1),        -- 2
       ('笔记本电脑', 1),  -- 3
       ('家用电器', NULL), -- 4
       ('图书', NULL),     -- 5
       ('服装', NULL),     -- 6
       ('男装', 6),        -- 7
       ('女装', 6);
-- 8

-- 员工
INSERT INTO employees (emp_name, position, dept, hire_date, salary, manager_id)
VALUES ('张伟', '销售总监', '销售部', '2019-03-01', 18000.00, NULL), -- 1
       ('李娜', '销售经理', '销售部', '2020-06-15', 12000.00, 1),    -- 2
       ('王强', '销售专员', '销售部', '2021-09-01', 7500.00, 2),     -- 3
       ('刘洋', '销售专员', '销售部', '2022-02-20', 7000.00, 2),     -- 4
       ('陈静', '客服专员', '客服部', '2021-05-10', 6800.00, 1);
-- 5

-- 商品
INSERT INTO products (product_name, category_id, price, stock, status)
VALUES ('iPhone 15', 2, 5999.00, 100, 1),         -- 1
       ('小米 14', 2, 3999.00, 150, 1),           -- 2
       ('华为 Mate60', 2, 5499.00, 80, 1),        -- 3
       ('MacBook Air', 3, 8999.00, 50, 1),        -- 4
       ('联想小新 Pro', 3, 5299.00, 60, 1),       -- 5
       ('戴尔 XPS13', 3, 9499.00, 30, 1),         -- 6
       ('海尔冰箱', 4, 2999.00, 20, 1),           -- 7
       ('美的电饭煲', 4, 399.00, 200, 1),         -- 8
       ('小米电视', 4, 2499.00, 40, 1),           -- 9
       ('SQL必知必会', 5, 59.00, 500, 1),         -- 10
       ('深入理解计算机系统', 5, 139.00, 300, 1), -- 11
       ('Python编程', 5, 89.00, 400, 1),          -- 12
       ('男士纯棉T恤', 7, 99.00, 300, 1),         -- 13
       ('男士牛仔裤', 7, 199.00, 200, 1),         -- 14
       ('女士连衣裙', 8, 299.00, 150, 1),         -- 15
       ('女士风衣', 8, 499.00, 80, 0);
-- 16（已下架）

-- 订单
INSERT INTO orders (order_no, customer_id, employee_id, order_date, status, total_amount)
VALUES ('SO20240105001', 1, 3, '2024-01-05', '已完成', 6117.00),  -- 1
       ('SO20240108002', 2, 4, '2024-01-08', '已完成', 9398.00),  -- 2
       ('SO20240112003', 3, 3, '2024-01-12', '已完成', 7998.00),  -- 3
       ('SO20240120004', 1, 2, '2024-01-20', '已完成', 228.00),   -- 4
       ('SO20240202005', 4, 4, '2024-02-02', '已取消', 598.00),   -- 5
       ('SO20240214006', 5, 3, '2024-02-14', '已完成', 5676.00),  -- 6
       ('SO20240220007', 6, 2, '2024-02-20', '已完成', 5299.00),  -- 7
       ('SO20240301008', 2, 4, '2024-03-01', '待发货', 5498.00),  -- 8
       ('SO20240308009', 7, 3, '2024-03-08', '已完成', 496.00),   -- 9
       ('SO20240315010', 8, 2, '2024-03-15', '已完成', 18498.00), -- 10
       ('SO20240322011', 1, 3, '2024-03-22', '已完成', 499.00),   -- 11
       ('SO20240402012', 9, 4, '2024-04-02', '待付款', 237.00),   -- 12
       ('SO20240410013', 10, 3, '2024-04-10', '已完成', 798.00),  -- 13
       ('SO20240418014', 5, 2, '2024-04-18', '已完成', 6498.00),  -- 14
       ('SO20240505015', 3, 4, '2024-05-05', '已完成', 4138.00),  -- 15
       ('SO20240512016', 2, 3, '2024-05-12', '已发货', 398.00),   -- 16
       ('SO20240520017', 8, 2, '2024-05-20', '已完成', 2499.00),  -- 17
       ('SO20240601018', 4, 4, '2024-06-01', '已完成', 497.00),   -- 18
       ('SO20240611019', 6, 3, '2024-06-11', '已完成', 5588.00),  -- 19
       ('SO20240620020', 7, 2, '2024-06-20', '待发货', 5698.00),  -- 20
       ('SO20240701021', 10, 4, '2024-07-01', '已完成', 59.00),   -- 21
       ('SO20240708022', 9, 3, '2024-07-08', '已完成', 14998.00);
-- 22

-- 订单明细
INSERT INTO order_items (order_id, product_id, quantity, unit_price)
VALUES (1, 1, 1, 5999.00),
       (1, 10, 2, 59.00),
       (2, 4, 1, 8999.00),
       (2, 8, 1, 399.00),
       (3, 2, 2, 3999.00),
       (4, 11, 1, 139.00),
       (4, 12, 1, 89.00),
       (5, 15, 2, 299.00),
       (6, 3, 1, 5499.00),
       (6, 10, 3, 59.00),
       (7, 5, 1, 5299.00),
       (8, 7, 1, 2999.00),
       (8, 9, 1, 2499.00),
       (9, 13, 3, 99.00),
       (9, 14, 1, 199.00),
       (10, 6, 1, 9499.00),
       (10, 4, 1, 8999.00),
       (11, 16, 1, 499.00),
       (12, 12, 2, 89.00),
       (12, 10, 1, 59.00),
       (13, 8, 2, 399.00),
       (14, 1, 1, 5999.00),
       (14, 16, 1, 499.00),
       (15, 2, 1, 3999.00),
       (15, 11, 1, 139.00),
       (16, 15, 1, 299.00),
       (16, 13, 1, 99.00),
       (17, 9, 1, 2499.00),
       (18, 14, 2, 199.00),
       (18, 13, 1, 99.00),
       (19, 3, 1, 5499.00),
       (19, 12, 1, 89.00),
       (20, 5, 1, 5299.00),
       (20, 8, 1, 399.00),
       (21, 10, 1, 59.00),
       (22, 1, 1, 5999.00),
       (22, 4, 1, 8999.00);
#在 SQL 中，當題目沒有特別指定依據什麼欄位排序（例如沒有說「按年份」或「按評分」），我們預設就是去拿資料表最一開始出現的前 5 筆資料。
#寫 SQL 或刷程式題時，一開始常常會被題目的英文敘述或是資料庫的背景給干擾，這非常正常。
-- 1. 创建并切换到一个练习用的数据库
CREATE DATABASE IF NOT EXISTS practice_db DEFAULT CHARSET utf8mb4;
USE practice_db;

-- 2. 创建两张简单的业务表
-- 员工表
CREATE TABLE employees
(
    id         INT AUTO_INCREMENT PRIMARY KEY COMMENT '员工ID',
    name       VARCHAR(50) NOT NULL COMMENT '姓名',
    age        INT COMMENT '年龄',
    department VARCHAR(50) COMMENT '部门',
    salary     DECIMAL(10, 2) COMMENT '薪水'
);

-- 订单表
CREATE TABLE orders
(
    id          INT AUTO_INCREMENT PRIMARY KEY COMMENT '订单ID',
    employee_id INT COMMENT '关联员工ID',
    amount      DECIMAL(10, 2) COMMENT '订单金额',
    order_date  DATE COMMENT '下单日期'
);

-- 3. 插入一些测试数据
INSERT INTO employees (name, age, department, salary)
VALUES ('张三', 28, '研发部', 15000.00),
       ('李四', 32, '销售部', 12000.00),
       ('王五', 25, '研发部', 13000.00),
       ('赵六', 30, '人事部', 9000.00);

INSERT INTO orders (employee_id, amount, order_date)
VALUES (2, 5000.00, '2023-10-01'),
       (2, 3000.00, '2023-10-02'),
       (1, 100.00, '2023-10-05');
-- 切换回你刚才的练习数据库
USE practice_db;#use后面的是数据库，也就是表背后的东西

-- 4. 创建业务用户表 (注意：别和 MySQL 系统自带的 user 表混淆)
CREATE TABLE sys_user
(
    user_id     INT AUTO_INCREMENT PRIMARY KEY COMMENT '用户主键ID',
    username    VARCHAR(50)  NOT NULL UNIQUE COMMENT '登录账号',
    password    VARCHAR(100) NOT NULL COMMENT '登录密码(实际开发中存密文)',
    real_name   VARCHAR(50) COMMENT '真实姓名',
    phone       VARCHAR(20) COMMENT '手机号',
    status      TINYINT  DEFAULT 1 COMMENT '状态：1正常，0禁用',
    create_time DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '注册时间'
);

-- 5. 插入一些业务用户的测试数据
INSERT INTO sys_user (username, password, real_name, phone, status)
VALUES ('admin', 'e10adc3949ba59abbe56e057f20f883e', '超级管理员', '13800000001', 1),
       ('zhangsan', 'e10adc3949ba59abbe56e057f20f883e', '张三', '13800000002', 1),
       ('lisi', 'e10adc3949ba59abbe56e057f20f883e', '李四', '13800000003', 0),
       ('wangwu', 'e10adc3949ba59abbe56e057f20f883e', '王五', '13800000004', 1);
SELECT*FROM sys_user;#查询全体用户信息
#创建MySQL 数据库系统本身的一个“登录账号”
-- 只能从本机登录
CREATE USER 'test_user1'@'localhost' IDENTIFIED BY '123456';#怎么验证这句的效果呢？
USE mysql;#打开MySQL
SELECT user, host FROM mysql.user WHERE user = 'test_user1';#内置有一个user表，创建一下角色
GRANT SELECT ON practice_db.sys_user TO 'test_user1'@'localhost';
-- 1. 把之前那个限制本地登录的账号删掉（免得混淆）
DROP USER IF EXISTS 'test_user1'@'localhost';

-- 2. 重新建一个允许从任意 IP 登录的账号（百分号代表任意 IP）
CREATE USER 'test_user1'@'%' IDENTIFIED BY '123456';

-- 3. 顺便直接给他一个练习库的查询权限（不然连进去啥也看不见）
GRANT SELECT ON practice_db.* TO 'test_user1'@'%';
ALTER USER 'test_user1'@'%' IDENTIFIED BY 'new_password_888';
DROP USER 'test_user1'@'%';
SELECT * FROM mysql.user WHERE user = 'test_user1';
-- 1. 建个新号
CREATE USER 'user2'@'%' IDENTIFIED BY '123456';

-- 2. 给他 practice_db 下所有表的“增删改查”权限
GRANT SELECT, INSERT, UPDATE, DELETE ON practice_db.* TO 'user2'@'%';

-- 3. 去 DataGrip 建个 user2 的连接试试，查查 sys_user 表，是不是能看能改了？
#SQL Bolt的新东西
# SELECT *FROM movies WHERE year NOT BETWEEN 2000 AND 2010;   not between and 的用法，相当于查找不在哪些范围的东西
#John Lasseter
# not in（字符串） 排除某些东西

SHOW DATABASES;
#查询所有表
#把所有表展示出来
SELECT DATABASE();
#查询当前数据库
#把你现在用的数据库调出来
CREATE DATABASE second;
#drop database kong;
#drop database 空库；;#创建名字不需要在库名后面加;和”“
#drop database second;
#以上删除了三个废库
#use ycx_study;#使用数据库
SELECT DATABASE();
USE ycx_study;
SELECT DATABASE();
#CREATE DATABASE test_door；
CREATE TABLE student
(
    id   INT,
    name VARCHAR(20)
);
SHOW TABLES;#查询当前所有表，表是数据库的下级单位
SELECT *
FROM student;
DESC student;#查询表结构，把表整个翻出来看，各项指标明朗
SHOW CREATE TABLE student;
#把表的底层属性（代码，特点等等）告知


#表结构创建
#创建表骨架，不给数据
CREATE TABLE one
(
    id     INT COMMENT '编号',#comment注释,这个要写，不然报错
    name   VARCHAR(20) COMMENT '名字',#字符串类型别搞错是varchar,括号里面代表最长多大的字符串
    age    INT COMMENT '年龄',
    gender CHAR(2) COMMENT '性别'


);#目前是空表
SELECT*
FROM one;#把表one调出来
DESC one;#查询表结构，把表整个翻出来看，各项指标明朗,comment不会出现
SHOW CREATE TABLE one;

#员工信息表
CREATE TABLE 员工信息表
(
    id        INT COMMENT '编号',
    emp_no    VARCHAR(10) COMMENT '员工工号',
    name      VARCHAR(10) COMMENT '名字',
    gender    CHAR(1) COMMENT '性别',#定长字符串，最多存储1个字符
    age       TINYINT UNSIGNED COMMENT '年龄',#unsigned代表没有负数，tinyint微整型省下空间，适合小数值数据
    id_card   CHAR(18) COMMENT '身份证',
    hire_date DATE COMMENT '入职时间'#这个类型会存储 年-月-日 时:分:秒datetime


);
SELECT*
FROM 员工信息表;





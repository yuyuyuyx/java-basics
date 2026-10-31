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
CREATE DATABASE IF NOT EXISTS ycx_study;
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
    id     INT COMMENT '编号',#comment注释,这个要写，给自己看
    name   VARCHAR(20) COMMENT '名字',#字符串类型别搞错是varchar,括号里面代表最长多大的字符串
    age    INT COMMENT '年龄',
    gender CHAR(2) COMMENT '性别'


);#目前是空表
SELECT*
FROM one;#把表one调出来，调出来的是过去的版本
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
FROM 员工信息表;#以后对表动操作以后就来这里看效果，别再重复别的操作，比如重复建表或者重复修改
ALTER TABLE 员工信息表
    ADD retire INT COMMENT '退休时间';#alter 有更新的意思，这里的用法是添加表数据项
ALTER TABLE 员工信息表
    ADD nickname VARCHAR(20) COMMENT '昵称' NOT NULL;#不能为空字符，这是约束之一，对数据的限制
ALTER TABLE 员工信息表
    MODIFY nickname DOUBLE;
#把昵称的数据类型改成double
#ALTER TABLE  员工信息表 CHANGE nicknames usernames VARCHAR(30) COMMENT '昵称'NOT NULL ;#把昵称的英文名改了，并重新确定数据类型
#nicknames是nickname第一次修改的结果，才有资格作为第二次修改的起点，所以第二次修改不要把起点设置为nickname,不然只能找见Nicknames然后报错
DESC 员工信息表;
#可以直接看数据项,改了表名以后就失效了
#ALTER TABLE 员工信息表 DROP username;#删除字段（数据项）的操作
#红色字代表被删除的数据项
#当光标停在缩进的位置时，直接按一下键盘上的 Home 键(针对只写了注释换行不顶格的毛病）
ALTER TABLE 员工信息表 RENAME TO 员工信息表2;
SELECT*FROM 员工信息表2;
ALTER TABLE 员工信息表2 RENAME TO employee;
DESC employee;#删除表名也失效了

DROP TABLE employee;#删除表
TRUNCATE TABLE one;#删除再创建，前提是删除前存在，删除的是全部数据，但是结构不会修改
DESC one;
#one表删除再创建以后gender的数据类型被修改了，why？（无所谓了，不重要，数据类型对不上再改就好）














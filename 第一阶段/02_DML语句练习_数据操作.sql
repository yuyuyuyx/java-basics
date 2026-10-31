#以下为DML部分
INSERT INTO 员工信息表(ID, EMP_NO, NAME, GENDER, AGE, ID_CARD, HIRE_DATE)
VALUES (1, 'E001', '张三', '男', 25, 110105199901011234,
        2026 - 10 - 29);#添加数据
TRUNCATE TABLE 员工信息表;
-- 1. 查一下到底是不是 50 个人
SELECT COUNT(*)
FROM 员工信息表;

-- 2. 只看男的
SELECT *
FROM 员工信息表
WHERE gender = '男';

-- 3. 只看年龄大于 30 的
SELECT *
FROM 员工信息表
WHERE age > 30;

-- 4. 按年龄从大到小排个序
SELECT *
FROM 员工信息表
ORDER BY age DESC;
#如何修改数据？
#比如修改第一个人的名字
UPDATE 员工信息表
SET name = '李华'
WHERE id = 1;
#where可以作为条件，作为坐标确定数据的位置
#如果不带where，默认某一项数据全都要改
#delete不带where默认删除全部数据
DELETE
FROM 员工信息表
WHERE id = 50;#删除编号为50的员工
CREATE DATABASE test_door;
INSERT INTO 员工信息表(id, emp_no, name, gender, age, id_card, hire_date)
VALUES (51, 'E004', '赵六', '女', 26, '110105199804045678', '2026-11-01');

SELECT*
FROM 员工信息表;
UPDATE 员工信息表
SET age =30
WHERE emp_no = 'E001';
DELETE
FROM 员工信息表
WHERE id = 49;




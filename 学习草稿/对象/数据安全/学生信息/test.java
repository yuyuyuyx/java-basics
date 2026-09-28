package 学习草稿.对象.数据安全.学生信息;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Character_student zhangsan = new Character_student();// 记录张三信息
        zhangsan.name = "张三";
        zhangsan.age = 18;
        zhangsan.height = 183;
        zhangsan.weight = 60;
        Actions_student zhangsanAction = new Actions_student();
        zhangsanAction.study();// 打印张三大一啥情况
        System.out.println("大二期间,张三体重增加了10千克");
        System.out.println("大三期间张三减肥成功，身高增加2厘米，体重减少3千克");

        System.out.println(
                "大学毕业后，张三年龄为" + (zhangsan.age + 4) + "身高为" + (zhangsan.height + 2) + "厘米，体重为" + (zhangsan.weight + 7));

    }
}
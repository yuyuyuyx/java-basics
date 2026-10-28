package 第一阶段.API.API练习十五;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两串数字字符");
        System.out.println("数字串1:");
        String numbeString1 = sc.next();
        System.out.println("数字串2:");
        String numbeString2 = sc.next();
        // 对字符串求和
        // 可以把数字字符串转化为一串数字参与计算
        int number1 = Integer.parseInt(numbeString1);
        int number2 = Integer.parseInt(numbeString2);
        int num = number1 + number2;
        System.out.println(num);

    }
}

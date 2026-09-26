package 学习草稿.前期所学的综合的算法训练;

import java.util.Random;
import java.util.Scanner;

public class 红包问题 {

    public static double hongbao(double sum) {// 方法一
        Random r = new Random();// 随机器
        double Amoney = r.nextDouble(sum) + 1;// 开始生成（不能超过1000块）
        while (sum >= 0) {// 保证资金大于等于0
            sum -= Amoney;// 削减总金额

        }

        return Amoney;// 寄出红包

    }
    

    public static void main(String[] args) {
        // 一个红包生成器
        // main：
        // 1.设置两个变量，用来表示红包总额和个数
        // 方法一：内部程序

        

        System.out.println("（温馨提示:领红包的人数和红包总数一样多）");
        Scanner sc = new Scanner(System.in);
        System.out.println("请设置红包总额：");
        double sum = sc.nextDouble();
        System.out.println("请设置红包总数");
        int number = sc.nextInt();

    }
}

package 学习草稿.条件判断与循环.WHILE判断;

import java.util.Scanner;

public class 血条 {
    public static void main(String[] args) {
        // 掉血条
        /*
         * int characterblood = 200;// 初始血量
         * System.out.println("请输入数字：");
         * Scanner sc = new Scanner(System.in);
         * double x = sc.nextDouble();
         * System.out.println("请输入数字：");
         * double y = sc.nextDouble();
         * double nowblood = characterblood - x + y;
         * if (nowblood<=0) {
         * nowblood=1;
         * System.out.println("濒死状态下还有1滴血");
         * 
         * }else{
         * System.out.println("当前血量为：" + nowblood);
         * }
         */

        // 血条break版
        int characterblood = 200;// 初始血量
        System.out.println("请输入数字：");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        System.out.println("请输入数字：");
        double y = sc.nextDouble();
        // 如果x和y是负数该怎办
        while (x < 0 || y < 0) {//处理异常情况
            System.out.println("请重新输入");
            double hurt = sc.nextDouble();//重新定义变量记录数据
            double recover = sc.nextDouble();
            if (hurt >= 0 && recover >= 0) {
                break;//内部判断，不符合就一直while

            }
        }
        
        double nowblood = characterblood - x + y;
        if (nowblood <= 0) {
            nowblood = 1;
            System.out.println("濒死状态下还有1滴血");

        } else {
            System.out.println("当前血量为：" + nowblood);
        }
    }
}

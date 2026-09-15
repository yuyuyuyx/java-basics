package 学习草稿;

import java.util.Scanner;

public class 血条 {
    public static void main(String[] args) {
        // 掉血条
        int characterblood = 200;// 初始血量
        System.out.println("请输入数字：");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        System.out.println("请输入数字：");
        double y = sc.nextDouble();
        double nowblood = characterblood - x + y;
        if (nowblood<=0) {
            nowblood=1;
            System.out.println("濒死状态下还有1滴血");
            
        }else{
            System.out.println("当前血量为：" + nowblood);
        }

        

    }
}

package 学习草稿;

import java.util.Scanner;

public class 循环重复跳跃 {
    public static void jump(int n) {//类似C语言的定义函数，前面写一堆，后面直接调用
        // 写入用户交互
        System.out.println("请输入跳跃次数：");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();//jump那里定义了int，后面就别用
        // for里面int不用事先注释
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.println("跳了" + i + "次，好累啊！");
                continue;
            } else if (i % 5 == 0 && i % 3 != 0) {
                System.out.println("跳了" + i + "次，触发超级跳！");
                continue;
            } else if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("跳了" + i + "次，触发究极无敌跳！");
                continue;// 跳出循环
            } else {
                System.out.println("跳了" + i + "次");// 横着输出语句的方法

            }
            // 1.println变成print，不用换行
            // 2.字符之间用制表符 \t 隔开

        }
        System.out.println();// 防止print打印内容太短导致挤不进去视野中

    }

    public static void main(String[] args) {
        jump(10);

    }
}

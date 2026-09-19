package 学习草稿;

import java.util.Scanner;

public class 循环重复跳跃 {
    public static void jump(int n) {// 类似C语言的定义函数，前面写一堆，后面直接调用，相当于处理器

        // for里面int不用事先注释
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) { // 最特殊，放最前面
                System.out.println("跳了" + i + "次，触发究极无敌跳！");
            } else if (i % 3 == 0) { // 次特殊
                System.out.println("跳了" + i + "次，好累啊！");
            } else if (i % 5 == 0) {
                System.out.println("跳了" + i + "次，触发超级跳！");
            } else {
                System.out.println("跳了" + i + "次");
            } // 横着输出语句的方法
              // 1.println变成print，不用换行
              // 2.字符之间用制表符 \t 隔开
        }
        

    }

    public static void main(String[] args) {//一般是交互程序，相当于前台操作页面
        // 写入用户交互
        System.out.println("请输入跳跃次数：");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();//读取完毕后不再继续读取

        jump(n);

    }
}

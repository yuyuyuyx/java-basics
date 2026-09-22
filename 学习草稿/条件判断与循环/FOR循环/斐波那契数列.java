package 学习草稿.条件判断与循环.FOR循环;

import java.util.Scanner;

public class 斐波那契数列 {
    public static void main(String[] args) {
        // 斐波那契数列
        int sum = 0;
        System.out.println("请输入要求的第n项和:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num1 = 0;
        int num2 = 1;
        for (int i = 1; i <= n; i++) {
            sum += num1;
            


        }
    }
}
/*
 * package 学习草稿;
 * 
 * import java.util.Scanner;
 * 
 * public class 数字规律 {
 * public static void main(String[] args) {
 * System.out.println("请输入要求的项数 n：");
 * Scanner sc = new Scanner(System.in);
 * int n = sc.nextInt();
 * 
 * int a = 0; // 代表第 1 项
 * int b = 1; // 代表第 2 项
 * int sum = 0; // 用来记录前 n 项的和
 * 
 * // 循环 n 次，一次算出一项
 * for (int i = 1; i <= n; i++) {
 * // 1. 把当前项加到总和里
 * sum += a;
 * 
 * // 2. 计算下一项
 * int next = a + b;
 * 
 * // 3. 变量滑动（核心精髓）：向前推进一步
 * a = b;
 * b = next;
 * }
 * 
 * System.out.println("前 " + n + " 项和为：" + sum);
 * sc.close();
 * }
 * }
 */

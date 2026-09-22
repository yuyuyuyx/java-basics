package 学习草稿.条件判断与循环.FOR循环;

import java.util.Scanner;

public class 数列求和 {
    public static void main(String[] args) {
        int sum = 0, sum2 = 0, result = 0;
        System.out.println("输入需要计算的前n项和");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i += 2) {
             sum += i; // 需要事先初始化好

        }
           
        for (int k = 2; k <= n; k += 2) {
                sum2 += k;//两个循环彼此独立，不要嵌套，否则彼此进程受到影响

            }

        
        result = sum - sum2;
        System.out.println("前n项和为:" + result);
    }
}

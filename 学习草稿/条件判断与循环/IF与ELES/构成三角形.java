package 学习草稿.条件判断与循环.IF与ELES;

import java.util.Scanner;

public class 构成三角形 {
    public static void main(String[] args) {
        System.out.println("请输入三角形的三边数据");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第1条边:");
        double num1 = sc.nextDouble();
        System.out.println("请输入第2条边:");
        double num2 = sc.nextDouble();
        System.out.println("请输入第3条边:");
        double num3 = sc.nextDouble();

        // 1. 外层合法性判断：过滤非法输入。
        // 注意：不要只写 num1 + num2 < num3，因为用户可能把长边放在前面。任意两边之和都要大于第三边。
        if (num1 <= 0 || num2 <= 0 || num3 <= 0 || 
            num1 + num2 <= num3 || num1 + num3 <= num2 || num2 + num3 <= num1) {
            System.out.println("无效");
        } else {
            // 2. 漏斗筛选法：从最特殊到最一般
            if (num1 == num2 && num2 == num3) {
                // 最特殊：等边
                System.out.println("等边三角形");
            } 
            else if ((num1 == num2 || num1 == num3 || num2 == num3) && 
                     (num1 * num1 + num2 * num2 == num3 * num3 || 
                      num1 * num1 + num3 * num3 == num2 * num2 || 
                      num2 * num2 + num3 * num3 == num1 * num1)) {
                // 次特殊：等腰直角（两边相等 && 勾股定理）
                System.out.println("等腰直角三角形");
            } 
            else if (num1 == num2 || num1 == num3 || num2 == num3) {
                // 再次：普通等腰
                System.out.println("等腰三角形");
            } 
            else if (num1 * num1 + num2 * num2 == num3 * num3 || 
                     num1 * num1 + num3 * num3 == num2 * num2 || 
                     num2 * num2 + num3 * num3 == num1 * num1) {
                // 最后：普通直角
                System.out.println("直角三角形");
            } 
            else {
                // 兜底：普通
                System.out.println("普通三角形");
            }
        }
        sc.close();
    }
}
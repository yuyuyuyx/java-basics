package 学习草稿.方法;

import java.util.Scanner;

public class 求两个数的和 {
    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("请输入两个数：");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // 12sum(a, b);//调用函数sum
        System.out.println("和是:" + sum(a, b));// 也可以在打印语句里面直接调用

    }

}
/*
 * 优化方向（待办清单）
 * 【优化方向 1】：增加输入合法性校验（防御性编程）。
 * 
 * 现状：如果用户在控制台输入了字母 a，你的 sc.nextInt() 会直接崩溃报错。
 * 
 * 所需知识点：hasNextInt()、while(true) 循环。
 * 
 * 当前可行性：🟢 现在就能做。如果用户输入错误，提示“请输入整数：”并让他重新输入。
 * 
 * 【优化方向 2】：解决 Scanner 资源泄漏警告。
 * 
 * 现状：你的 IDE 左侧或代码里可能会有黄色的警告（Resource leak: 'sc' is never closed）。
 * 
 * 所需知识点：sc.close()。
 * 
 * 当前可行性：🟢 现在就能做。在 main 方法最后加上 sc.close(); 即可。
 * 
 * 【优化方向 3】：解决 int 数据类型溢出的隐患。
 * 
 * 现状：如果你输入 2000000000 和 2000000000，int 的最大值是 21 亿，两个大数相加会直接变成负数（溢出）。
 * 
 * 所需知识点：long 类型、类型转换（long a = sc.nextLong();）。
 * 
 * 当前可行性：🟢 现在就能做。把 sum 方法的参数和返回值改成 long。
 * 
 * 【优化方向 4】：提前预习“方法的重载（Overloading）”。
 * 
 * 现状：你的 sum(int a, int b) 只能算整数。
 * 
 * 所需知识点：同名方法、不同参数类型。
 * 
 * 当前可行性：🟡 稍加摸索能做（这也是你视频里接下来马上要讲的重点）。你可以尝试写一个 public static double sum(double
 * a, double b)，测试一下小数相加，感受一下 Java 如何根据传入类型自动选择对应的方法。
 * 
 */

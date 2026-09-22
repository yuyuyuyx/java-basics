package 学习草稿.条件判断与循环.WHILE判断;

import java.util.Scanner;

public class 计算器 {
    public static void main(String[] args) {
        // 修改1：优化提示语
        System.out.println("请输入算式（格式：数字1 空格 运算符 空格 数字2，例如：5 + 3）：");
        Scanner sc = new Scanner(System.in);

        // 1. 单独死磕第一个数字
        while (!sc.hasNextInt()) {
            System.out.println("第一个数字格式错误，请重新输入：");
            sc.nextLine(); // 吃掉错误的输入
        }
        int num1 = sc.nextInt();

        // 2. 单独死磕运算符（用 hasNext() 防EOF，实际上用户只要按了非空白键就能读到）
        while (!sc.hasNext()) {
            System.out.println("缺少运算符，请重新输入：");
            sc.nextLine();
        }
        String operation = sc.next();

        // 3. 单独死磕第二个数字
        while (!sc.hasNextInt()) {
            System.out.println("第二个数字格式错误，请重新输入：");
            sc.nextLine(); // 吃掉错误的输入
        }
        int num2 = sc.nextInt();

        // 修改5：除零保护
        switch (operation) {
            case "+" -> System.out.println(num1 + " + " + num2 + " = " + (num1 + num2)); // 有箭头别用break
            case "-" -> System.out.println(num1 + " - " + num2 + " = " + (num1 - num2)); // 符号之间有空格
            case "*" -> System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
            case "/" -> {
                if (num2 == 0) {
                    System.out.println("除数不能为 0！");
                } else {
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                }
            }
            default -> System.out.println("目前只能加减乘除");
        }
    }
}
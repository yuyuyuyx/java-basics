package 学习草稿.数组;

import java.util.Scanner;

public class 查找数据 {

    // 不返回数组了，直接在方法里把结果打印出来
    public static void findAndPrint(int[] array, int target) {
        boolean isFound = false; // 记录到底有没有找到

        System.out.print("该数字的下标分别是：");
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                System.out.print(i + " ");
                isFound = true;
            }
        }

        // 如果循环结束了还没找到，就打印没找到
        if (!isFound) {
            System.out.print("没有该数字");
        }
        System.out.println(); // 换行，让终端好看一点
    }

    public static void main(String[] args) {
        int[] array = { 33, 5, 22, 44, 55, 33 };
        System.out.println("请输入一个整数:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // 只需要一句调用，不需要接收返回值，也不需要再写 for 循环
        findAndPrint(array, num);

        sc.close();
    }
}
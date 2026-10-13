package 学习草稿.数组;

import java.util.Scanner;

public class 查找数据 {

    // 不返回数组了，直接在方法里把结果打印出来
    public static void findAndPrint(int[] array, int target) {
        boolean isFound = false;
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                System.out.println("找到了，下标为：" + mid);
                isFound = true; // 【补上】标记找到了！
                break; // 找到了就退出循环
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

            // 【移除】原来的 if(!isFound) 绝不能写在这里！
        }

        // 【移到这里】循环彻底结束，代表二分查找真的没找到
        if (!isFound) {
            System.out.println("没有该数字");
        }
    }

    public static void main(String[] args) {
        int[] array = { 5, 22, 33, 33, 44, 55 };
        System.out.println("请输入一个整数:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // 只需要一句调用，不需要接收返回值，也不需要再写 for 循环
        findAndPrint(array, num);

        sc.close();
    }
}

// 相关笔记：[[测试笔记]]（Java 二分查找学习记录）
// 延伸阅读：[[数组的内存分配]]、[[变量与方法的内存分配]]
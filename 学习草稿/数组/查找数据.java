package 学习草稿.数组;

import java.util.Scanner;

public class 查找数据 {
    public static void main(String[] args) {
        /*
         * 优化方向（待办清单）
         * 【优化方向 1】：把查找逻辑封装成一个独立的方法，练习“数组作为参数”和“返回 int”。
         * 
         * 所需知识点：public static int findIndex(int[] arr, int target)、return、方法调用。
         * 
         * 当前可行性：🟢 现在就能做（参考你重构 jump 和 calculatePrice 的经验，直接搬家）。
         * 
         * 【优化方向 2】：找出该数字出现的所有索引，而不是第一次。
         * 
         * 所需知识点：去掉 break、遍历整个数组、结果收集。
         * 
         * 当前可行性：🟡 稍加摸索能做（改起来很简单：把 break; 删掉，让循环跑完，每次匹配成功都打印一下索引）。
         * 
         * 【优化方向 3】：如果数组是有序的，使用二分查找提升效率。
         * 
         * 所需知识点：二分查找算法、while 循环、left/right 指针。
         * 
         * 当前可行性：🔴 需等学完算法基础（后续章节会讲）。
         */
        int[] array = { 33, 5, 22, 44, 55, 33 };
        System.out.println("请输入一个整数:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int index = -1; // 默认没找到

        // 开始遍历查找
        for (int i = 0; i < array.length; i++) {// 这里改动索引
            if (array[i] == num) {// 条件是找到了怎么样，不是没找到怎么样
                index = i; // 找到了，记录下标
                break; // 题目要求只找第一次，所以立刻停止！
            }
        }

        // 根据结果输出
        if (index == -1) {
            System.out.println("该数据不存在");
        } else {
            System.out.println("该数据第一次出现的索引是：" + index);
        }

        sc.close();
    }
}
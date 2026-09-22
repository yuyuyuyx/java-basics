package 学习草稿.数组;

import java.util.Random;

public class 数组遍历 {
    public static void main(String[] args) {
        // 1. 【关键】在循环外面创建数组（买一个大盒子）
        int[] array2 = new int[100];

        // 2. 在循环里面赋值（往格子里装东西）
        for (int i = 0; i < array2.length; i++) { // 用 array2.length 代替死数字 100
            array2[i] = i;
        }

        // 3. 再次遍历打印
        for (int i = 0; i < array2.length; i++) {
            //array2.length可以接受任何数组的长度，所以用这个，防止长度固定
            System.out.println(array2[i]);
        }
    } // main 方法结束
} // class 结束
/*
 * 优化方向（待办清单）：
 * 【优化方向 1】：用随机数填充这个数组。
 * 
 * 所需知识点：Random 类、array.length、for 循环。
 * 
 * 当前可行性：🟢 现在就能做。把 array2[i] = i; 改成 array2[i] = r.nextInt(100) + 1;，然后用循环打印。
 * 
 * 【优化方向 2】：找出数组中的最大值。
 * 
 * 所需知识点：数组遍历、打擂台法（假设第一个元素是最大值，依次与后面的比）。
 * 
 * 当前可行性：🟢 现在就能做。非常经典的数组算法题，自己尝试写一下，卡住随时问我。
 */
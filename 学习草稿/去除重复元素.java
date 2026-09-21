package 学习草稿;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class 去除重复元素 {
    public static void main(String[] args) {
        /*
         * int[] array = new int[10];
         * Random r = new Random();
         * int index;// 解决20行的问题————提前定义，然后循环里面避免重复定义
         * 
         * for (index = 0; index < array.length; index++) {
         * // 你要填第 i 个格子，需要保证它和前面 0 ~ i-1 的数字都不同
         * while (true) {
         * int newNum = r.nextInt(100) + 1; // 生成 1~100 的随机数
         * boolean isDuplicate = false; // 假设没重复
         * 
         * // 安检开始：只检查前面已经存好的数字！
         * for (int j = 0; j < index; j++) {
         * if (array[j] == newNum) {
         * isDuplicate = true; // 发现重复了
         * break; // 立刻停止安检，去重新生成
         * }
         * }
         * 
         * // 决定是否放行
         * if (!isDuplicate) {
         * array[index] = newNum; // 没重复，放进格子
         * break; // 跳出 while，去填下一个格子
         * }
         * }
         * 
         * }
         */
        // 洗牌法
        int[] array = new int[100];// 定好空间
        Random r = new Random();
        int i;
        for (i = 0; i < array.length; i++) {// 生成1-100元素的有序数组
            array[i] = i + 1;
        }
        for (i = 0; i < array.length; i++) {// 开始给元素打乱
            int index = r.nextInt(array.length);// 随机生成索引，内部不可能到100
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }

        for (int k = 0; k <= 9; k++) {// 截取前十个元素
            System.out.print(array[k] + " ");

        }
        System.out.println(); // 换行

    }
}
/*
 * 优化方向（待办清单）
 * 【优化方向 1】：理解经典的“Fisher-Yates 洗牌算法”。
 * 
 * 现状：你现在的做法是“每个元素和整个数组里的随机元素交换”，这虽然能打乱，但严格来说不是最均匀的洗牌。
 * 
 * 优化：更标准的写法是每次只与当前位置之后的元素交换，即 int index = i + r.nextInt(array.length -
 * i);。这样能保证每种排列出现的概率完全相等。
 * 
 * 所需知识点：Random 边界计算、循环不变性。
 * 
 * 当前可行性：🟡 稍加摸索能做。
 * 
 * 【优化方向 2】：用 Collections.shuffle() 一行代码搞定。
 * 
 * 所需知识点：集合框架、java.util.Collections。
 * 
 * 当前可行性：🔴 需等学完第5章“集合框架”。
 */

package 学习草稿.数组;

import java.util.Arrays;
import java.util.Random;

public class 打乱数组元素 {

    public static void main(String[] args) {
        // 打乱数组元素
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            int randomindex = r.nextInt(array.length);// array.length就是一个随时可以更新的数字
            int temp = array[i];
            array[i] = array[randomindex];
            array[randomindex] = temp;

        }
        System.out.println(Arrays.toString(array));// 打印一维数组
    }
}
/*
 * 优化方向（待办清单）
 * 【优化方向 1】：规范命名（立即可做）
 * 
 * 当前现象：int randomindex = ... 中 index 的 i 是小写。
 * 
 * 所需知识点：Java 驼峰命名法。
 * 
 * 当前可行性：🟢 现在就能做。改成 randomIndex，这样代码看起来更专业。
 * 
 * 【优化方向 2】：优化洗牌算法，避免“无意义的交换”和“概率偏置”（进阶思维）
 * 
 * 当前现象：你每次都在 [0, array.length - 1] 整个范围内随机选一个数进行交换。这意味着：
 * 
 * 比如 i = 5 时，它可能随机到 randomIndex = 1，把已经“处理过”的元素又换回来了。
 * 
 * 虽然数组最终确实被打乱了，但严格来说，有些排列出现的概率会比其他排列稍微大一点（数学上叫“有偏”）。
 * 
 * 优化做法：标准的 Fisher-Yates 洗牌算法，每次只从当前位置到数组末尾之间选一个随机数来交换，也就是 randomIndex = i +
 * r.nextInt(array.length - i)。
 * 
 * 所需知识点：for 循环边界的动态计算、Random 的取值范围。
 * 
 * 当前可行性：🟡 稍加摸索能做。
 * 
 * 【优化方向 3】：提取成方法（复习重构技巧）
 * 
 * 当前现象：打乱逻辑和打印逻辑都挤在 main 里。
 * 
 * 优化做法：提取一个 public static void shuffle(int[] array) 方法，把洗牌逻辑封装进去。这样以后有别的数组，直接调用
 * shuffle(arr) 就行。
 * 
 * 所需知识点：方法定义、数组作为参数、引用传递。
 * 
 * 当前可行性：🟢 现在就能做。
 */
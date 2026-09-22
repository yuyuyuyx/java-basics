package 学习草稿.方法;

public class 遍历数组 {
    public static int[] array(int[] array2) {
        for (int index = 0; index < array2.length; index++) {
            array2[index] = index + 1;

        }
        return array2;

    }

    public static void main(String[] args) {
        int[] arr = new int[5];

        System.out.println(java.util.Arrays.toString(array((arr))));

    }
}
/*
 * 优化方向（待办清单）
 * 【优化方向 1】：完成视频要求的 void 版遍历方法（见上方代码）。
 * 
 * 所需知识点：void 方法、for 循环、if 条件判断。
 * 
 * 当前可行性：🟢 现在就能做。
 * 
 * 【优化方向 2】：处理空数组或 null 的安全情况。
 * 
 * 现状：如果传入 null，printArray 方法里的 arr.length 会直接报错。
 * 
 * 所需知识点：if (arr == null) return;。
 * 
 * 当前可行性：🟢 现在就能做。
 * 
 * 【优化方向 3】：让打印结果支持任意大小、任意内容的数组。
 * 
 * 现状：你的数组内容是自己生成的 1 到 5。
 * 
 * 优化：在 main 里定义数组 {5, 2, 9, 1}，传给 printArray，看看能不能完美输出 [5, 2, 9, 1]。
 * 
 * 所需知识点：数组作为参数传递。
 * 
 * 当前可行性：🟢 现在就能做
 */
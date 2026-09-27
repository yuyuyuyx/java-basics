package 学习草稿.窟窿.双指针与数组去重;

import java.util.Arrays;

public class 有序数组去重 {
    public static void main(String[] args) {
        int nums[] = { 1, 1, 2, 2, 3, 3, 4 };
        int slow = 0; // 慢指针从0开始

        for (int fast = 1; fast < nums.length; fast++) { // 快指针从1开始
            if (nums[fast] != nums[slow]) { //  遇到新元素
                slow++; // 1. 先挪位置（腾出新格）
                nums[slow] = nums[fast]; // 2. 再放入新元素
            }
            // 如果相等（重复），什么都不做。fast 自动往下走，slow 不动。
        }

        int[] result = Arrays.copyOf(nums, slow + 1); // 长度=索引+1
        System.out.println(Arrays.toString(result));
    }
}

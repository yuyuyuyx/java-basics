package 学习草稿.窟窿.双指针与数组去重;

import java.util.Arrays;

public class 数组移除元素 {
    public static void main(String[] args) {
        int nums[] = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int val = 2;// 要去除的目标

        int slow = 0;

        for (int fast = 0; fast < nums.length; fast++) {// 快指针去找东西
            if (nums[fast] != val) {// 找到和目标值不一样的，就地更改
                // 不要先找一样的，因为不知道怎么删，所以找出来不一样的，然后覆盖数组就行
                nums[slow] = nums[fast];// 把快指针找到的东西给慢指针，相当于找座位
                slow++;// 给下一个座位找东西

            }
        }

        int[] result = Arrays.copyOf(nums, slow);//记住
        System.out.println(Arrays.toString(result));
        System.out.println(slow);// 记录新数组长度

    }
}

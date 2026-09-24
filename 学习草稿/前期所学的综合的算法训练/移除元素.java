package 学习草稿.前期所学的综合的算法训练;

import java.util.Arrays;
//优化方向（待办清单）
//TODO【优化方向 1】：用快慢指针重写这段代码。

//TODO所需知识点：for 循环、数组索引、if 条件。

//TODO当前可行性：🟢 现在就能做。把 if (num[i] == val) num[i] = 2; 删掉，换成快慢指针。

//TODO【优化方向 2】：处理空数组和单元素数组。

//TODO所需知识点：if (nums.length == 0) 边界判断。

//TODO当前可行性：🟢 现在就能做。

//TODO【优化方向 3】：将逻辑提取为一个独立的方法。
//TODOpublic static int removeElement(int[] nums, int val)、return。
//TODO当前可行性：🟢 现在就能做。这是 LeetCode 官方的函数签名。


//TODO所需知识点：



public class 移除元素 {
    public static void main(String[] args) {
        int[] num = { 3, 2, 2, 3 };// 旧数组
        // 快慢指针（变量）

        int val = 3;// 要删除的元素
        int slow = 0;
        for (int fast = 0; fast < num.length; fast++) {// 遍历
            if (num[fast] != val) {// 如果不等于3
                num[slow] = num[fast];// 就让慢指针的元素变成这个
                slow++;

            }

        }
        int[] nums = Arrays.copyOf(num, slow);

        System.out.println(Arrays.toString(nums));// 确认全部是2

    }

}

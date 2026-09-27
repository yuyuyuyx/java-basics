package 学习草稿.前期所学的综合的算法训练;

import java.util.Arrays;
/*
 * ========== 接雨水优化方向（待办清单） ==========
 * 
 * 【难度：🟢 现在就能做】方向1：变量重命名，提升代码可读性
 * 具体做法：把 jiaoji 改为 waterLine（水位线），h_max_l 改为 maxLeft，h_max_r 改为 maxRight。
 * 
 * 【难度：🟢 现在就能做】方向2：合并循环，减少代码行数
 * 具体做法：把最后的“累加水位”和“减去柱子”两个 for 循环合并成一个 for。
 *          写法：sum += (jiaoji[index] - height[index]);
 * 
 * 【难度：🟡 稍加摸索能做】方向3：空间优化，去掉中间数组
 * 具体做法：不再创建 jiaoji 数组，直接在最后一个循环里用 Math.min(left[index], right[index])
 *          算出水位线，然后减去 height[index]。这样节省 O(N) 的空间。
 * 
 * 【难度：🔴 需等理解算法进阶】方向4：学习“双指针法”进阶解法（LeetCode 经典 O(1) 空间解法）
 * 具体做法：不用 left 和 right 数组，直接用 leftMax 和 rightMax 两个变量配合双指针，从两端向中间逼近。
 *          时间复杂度 O(N)，空间复杂度降至 O(1)。（这是大厂面试的终极答案，建议以后回来挑战）
 * ==================================================
 */

public class 接雨水 {
    public static void main(String[] args) {
        int height[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        // 输入:int height []={0,1,0,2,1,0,1,3,2,1,2,1};
        // 输出：6（雨水体积）
        // 思路
        // 1.从左到右遍历，记录雨水＋柱子的面积综合（矩阵填充）
        // 1.1.设定一个数组记录从左往右的数据
        int left[] = new int[height.length];
        // 1.2定义第三变量 代表最高的柱子
        int h_max_l = height[0];// 不知道是谁，从第一个开始计数
        // 1.3从左往右遍历数组
        for (int index = 0; index < left.length; index++) {
            if (height[index] < h_max_l) {// 低于最大值，就把新数组用最大值填充上
                left[index] = h_max_l;

            } else {
                left[index] = height[index];// 新数组对应位置用原数组对应位置数字填充

                h_max_l = height[index];// 如果高于最大值就更新最大值

            }

        }
        System.out.println(Arrays.toString(left));
        // 1.4从右往左遍历数组
        int h_max_r = height[height.length - 1];
        int right[] = new int[height.length];
        for (int index = right.length - 1; index >= 0; index--) {
            if (h_max_r > height[index]) {// 低于最大值，就用最大值填充上
                right[index] = h_max_r;

            } else {
                right[index] = height[index];// 新数组对应位置用原数组对应位置数字填充

                h_max_r = height[index];// 如果高于最大值就更新最大值

            }

        }
        System.out.println(Arrays.toString(right));

        // 求柱子与雨水的交集
        int jiaoji[] = new int[height.length];
        for (int index = 0; index < right.length; index++) {
            if (right[index] > left[index]) {
                jiaoji[index] = left[index];

            } else {
                jiaoji[index] = right[index];
            }

        }
        System.out.println(Arrays.toString(jiaoji));
        // 求和总面积
        int sum = 0;
        for (int index = 0; index < jiaoji.length; index++) {
            sum += jiaoji[index];

        }
        for (int index = 0; index < height.length; index++) {
            sum -= height[index];
        }
        System.out.println(sum);
    }
}

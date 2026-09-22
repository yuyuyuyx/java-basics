package 学习草稿.数组;

public class 查找元素 {
    public static void main(String[] args) {
        int[] array = { 1, 3, 4, 5, 6 };
        int target = 4;

        for (int index = 0; index < array.length; index++) {
            // 核心：如果当前位置的值等于或大于目标值，插入位置就是当前索引
            if (array[index] >= target) {// 利用某一个大于它的值把它固定在这里
                System.out.println(index);
                return; // 结束整个方法
            }
        }
        // 如果循环跑完都没找到，说明目标值比数组里所有数都大，插入位置就是数组长度
        System.out.println(array.length);
    }
}
/*
 * 优化方向（待办清单）
 * 【优化方向 1】：处理边界情况（数组为空或全比目标值小）。
 * 
 * 现状：你的代码目前可以处理 target = 7 的情况，因为循环跑完没找到时，你打印了 array.length。
 * 
 * 所需知识点：array.length。
 * 
 * 当前可行性：🟢 现在就能做。
 * 
 * 【优化方向 2】：将查找逻辑提取为独立方法。
 * 
 * 现状：所有逻辑都在 main 里。
 * 
 * 所需知识点：public static int searchInsert(int[] nums, int target)、return。
 * 
 * 当前可行性：🟢 现在就能做（这是 LeetCode 官方的函数签名）。
 * 
 * 【优化方向 3】：使用“二分查找”将效率提升到极致（大厂面试必考）。
 * 
 * 现状：你现在的线性查找时间复杂度是 O(n)。如果数组有 100 万个数，找 100 万次效率很低。
 * 
 * 优化：用 left、right 两个指针，每次折半，直接把时间复杂度降到 O(log n)。
 * 
 * 所需知识点：while 循环、left/right 指针、mid = left + (right - left) / 2。
 * 
 * 当前可行性：🟡 稍加摸索能做（你可以先了解思路，等学完第5章“方法”后，回头来用二分查找重写这题，作为你的算法进阶作品）。
 */
package 学习草稿;

public class 数组的两数之和 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 5, 9, 2 };
        int target1 = 5;
        int target2 = 3;
        for (int index = 0; index < nums.length; index++) {// 第一个因子
            for (int index2 = index + 1; index2 < nums.length; index2++) {// 第二个因子,利用index防止重复
                if (nums[index] + nums[index2] == target1) {
                    System.out.println("第一个因子的索引是:" + index + "," + "第二个因子的索引是:" + index2 + "\t");
                    System.out.println("它们的和是：" + target1);

                }
                if (nums[index] + nums[index2] == target2) {
                    System.out.println("第一个因子的索引是:" + index + "," + "第二个因子的索引是:" + index2 + "\t");
                    System.out.println("它们的和是：" + target2);

                }

            }

        }
    }
}
/*
 * 化方向（待办清单）
 * 【优化方向 1】：需求解耦——拆分成两个独立的方法（解决当前“逻辑打架”的核心）。
 * 
 * 现状：你的代码把 target1 和 target2 混在一个双层循环里，导致 break 顾此失彼。
 * 
 * 所需知识点：public static void 方法定义、参数传递、return 关键字。
 * 
 * 当前可行性：🟢 现在就能做。
 * 
 * 具体做法：
 * 
 * 写一个 findFirstPair(int[] nums, int target) 方法，找到第一对就 return;。
 * 
 * 再写一个 findAllPairs(int[] nums, int target) 方法，双层循环遍历，不加 break。
 * 
 * 在 main 方法里分别调用它们测试。
 * 
 * 【优化方向 2】：添加边界防御（避免隐藏的崩溃）。
 * 
 * 现状：如果数组里只有 1 个元素，或者数组是 null，你的内层循环 j = i + 1 会直接失效或报错。
 * 
 * 所需知识点：if 条件拦截、return;。
 * 
 * 当前可行性：🟢 现在就能做。
 * 
 * 具体做法：在方法开头加一句 if (nums == null || nums.length < 2) return;。
 * 
 * 【优化方向 3】：使用“哈希表”优化算法效率（降维打击，大厂面试必考）。
 * 
 * 现状：你现在的双层循环时间复杂度是 O(n²)。如果数组有 10 万个元素，电脑要算 100 亿次，会卡死。
 * 
 * 优化：利用 HashMap，把“找另一个因子”的时间复杂度降为 O(1)。只需要一次循环（时间复杂度 O(n)）就能搞定。
 * 
 * 所需知识点：集合框架（HashMap、containsKey、get、put）。
 * 
 * 当前可行性：🔴 需等学完第5章“集合框架”。这是力扣第一题的标准解法，等你学完集合，一定要回来把这题重写一遍。
 * 
 * 【优化方向 4】：变量命名优化（提升代码可读性）。
 * 
 * 现状：index 和 index2 让人一眼看不出谁是“第一个数”，谁是“第二个数”。
 * 
 * 所需知识点：命名规范。
 * 
 * 当前可行性：🟢 现在就能做。
 * 
 * 具体做法：把 index 改成 i，index2 改成 j（标准双层循环惯例）；或者更进一步，改成 firstIndex 和 secondIndex。
 * 
 * 
 * 
 */

package 学习草稿.方法;

public class 九九乘法表 {
    public static void fomula() { // 1. 改为 void（无返回值），括号里不写参数
        for (int i = 1; i <= 9; i++) { // 外层循环控制行
            for (int k = 1; k <= i; k++) { // 内层循环控制列
                // 2. 直接打印算式，而不是赋给 result
                System.out.print(k + "X" + i + "=" + (k * i) + "\t");
            }
            System.out.println(); // 3. 每行结束换行
        }
    }

    public static void main(String[] args) {
        // 只要调用方法，不需要接收返回值
        fomula();
    }
}
/*
 * 优化方向（待办清单）
 * 【优化方向 1】：支持用户自定义大小（比如输入 12 就打印 12x12）。
 * 
 * 所需知识点：Scanner、方法参数 public static void fomula(int max)。
 * 
 * 当前可行性：🟢 现在就能做。只需要改一下循环条件：i <= max 和 k <= i。
 * 
 * 【优化方向 2】：练习把“计算结果”装入二维数组，然后再统一打印（这是第4章内容的复习）。
 * 
 * 所需知识点：二维数组 int[][] table = new int[10][10];、嵌套循环。
 * 
 * 当前可行性：🟡 稍加摸索能做。
 * 
 * 【优化方向 3】：解决长算式（比如 9x9=81）和短算式（比如 1x1=1）带来的列对齐问题。
 * 
 * 所需知识点：System.out.printf、格式化占位符 %-4d。
 * 
 * 当前可行性：🟢 现在就能做。
 */

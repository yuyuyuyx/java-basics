package 学习草稿.条件判断与循环.FOR循环;

/*
 * ========== 九九乘法表优化方向（待办清单） ==========
 * 
 * 【难度：🟢 现在就能做】方向1：提取打印逻辑为独立方法
 * 所需知识点：public static void 方法定义、参数传递
 * 具体做法：把两层 for 循环包进一个 public static void printMultiplicationTable() 方法里，
 *          然后 main 方法里只写一句调用。
 * 
 * 【难度：🟢 现在就能做】方向2：支持用户自定义大小
 * 所需知识点：Scanner 输入、循环边界的动态替换
 * 具体做法：引入 Scanner 读取用户输入的 n，把 for 循环里的 9 换成 n。
 * 
 * 【难度：🟡 稍加摸索能做】方向3：解决表格对齐错位问题
 * 所需知识点：System.out.printf 或 String.format 格式化
 * 具体做法：把 print 里的拼接改成 System.out.printf("%dX%d=%-4d", k, i, i*k);
 *          （%-4d 表示以整数格式输出并占 4 个字符宽度，左对齐）
 * 
 * 【难度：🔴 需等学完第4章“数组”】方向4：用二维数组存储乘法结果并遍历输出
 * 所需知识点：二维数组初始化、嵌套遍历
 * 具体做法：定义一个 int[][] table = new int[10][10];
 *          用双层 for 循环把结果填入数组，再遍历数组打印。
 * ==================================================
 */

public class 打印九九乘法表 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(k + "X" + i + "=" + i * k + "\t");
            }
            System.out.println();
        }
    }
}
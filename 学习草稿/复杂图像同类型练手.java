package 学习草稿;

public class 复杂图像同类型练手 {
    public static void main(String[] args) {
        // 数字直角三角形
        /*
         * for (int i = 1; i <= 5; i++) {// 换行5次
         * for (int n = 1; n <= i; n++) {
         * System.out.print(n + " ");// 记得打印n
         * 
         * }
         * System.out.println();
         * 
         * }
         * // 倒置数字直角三角形
         * for (int i = 1; i <= 5; i++) {// 换行5次
         * for (int n = 5; n >= i; n--) {
         * System.out.print(n - (i - 1) + " ");// n-(i-1)更新第一列数字，也就是开头
         * // i-1保证第一行的5可以保留下来，最后一行的5-4=1可以保留下来
         * }
         * System.out.println();
         * }
         * // 空心正方形5*5
         * // 思路：先竖着看，按行列去找，区分那些行需要挖空
         * for (int i = 1; i <= 5; i++) { // 外层循环：控制行
         * for (int j = 1; j <= 5; j++) { // 内层循环：控制列
         * // 👇 判断就插在这里！
         * if (i == 1 || i == 5 || j == 1 || j == 5) {
         * System.out.print("*"); // 边缘位置：打印星号
         * } else {
         * System.out.print(" "); // 内部位置：打印空格
         * }
         * }
         * System.out.println(); // 这一行走完，换行
         * }
         */
        // 空心菱形7行
        // (417),326,235,144||526,635,744
        
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                // 核心：曼哈顿距离方程（菱形本质）
                if (Math.abs(i - 4) + Math.abs(j - 4) == 3) {
                    System.out.print("*");
                } else {
                    System.out.print(" "); // 关键：必须打空格，不能打""
                }
            }
            System.out.println();
        }

    }

}

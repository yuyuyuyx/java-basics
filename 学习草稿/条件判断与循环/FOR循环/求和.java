package 学习草稿.条件判断与循环.FOR循环;

public class 求和 {
    public static void main(String[] args) {
        // 求1-5的和
        int sum = 0, sum2 = 0, result = 1;
        // 初始化防乱值,阶乘初始化一定为1，不然全是0
        int result1 = 1;
        int sum3 = 0;// 储存阶乘和
        for (int i = 1; i <= 5; i++) {
            sum += i;

        }
        System.out.println(sum);
        // 求1-100之间的偶数和
        for (int j = 1; j <= 100; j++) {
            if (j % 2 == 0) {
                sum2 += j;
            }

        }
        System.out.println(sum2);
        // 5的阶乘
        for (int k = 1; k <= 5; k++) {
            result *= k;

        }
        System.out.println(result);
        // 5的阶乘和
        for (int f = 1; f <= 5; f++) {
            result1 *= f;// 先算阶乘
            sum3 += result1;// 算完立马加和

        }
        System.out.println(sum3);
        // 5*5星号矩阵
        /*
         * for (int l = 0; l <= 4; l++) {
         * System.out.println("* * * * *" + "");
         * }
         * /*
         * 矩阵更好版本
         * // 5*5星号矩阵（嵌套循环版）
         * for (int row = 1; row <= 5; row++) { // 外层循环：控制行数（共5行）
         * for (int col = 1; col <= 5; col++) { // 内层循环：控制每行的列数（每行5个星）
         * System.out.print("* "); // 注意用 print，不换行
         * }
         * System.out.println(); // 关键点：内层循环结束后，手动换行，准备打印下一行
         * }
         */
        // 这样只用改数字就可以控制矩阵
        for (int row = 1; row <= 9; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("" + row + "*" + "" + col + "=" + (row * col) + "\t ");// 尾部加""可以空开算式不拥挤
            }
            // 在 Java 中，只要 + 号两边有一个是字符串，Java 就会自动把另一边也当成字符串拼接起来。
            // System.out.print(row + "*" + col + "=" + (row * col) + " ");
            /*
             * 因为乘法表的结果长度不一（比如 1*1=1 很短，9*9=81 稍微长一点），
             * 用空格会导致列对齐不够完美。
             */
            // System.out.print(row + "*" + col + "=" + (row * col) + "\t");制表符
            System.out.println();
        }

    }
}

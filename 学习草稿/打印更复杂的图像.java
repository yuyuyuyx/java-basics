package 学习草稿;

public class 打印更复杂的图像 {
    public static void main(String[] args) {
        //思维误区：
        //执着于让右边也有空格，但其实不需要
        //*右移的时候自然就会有空格的效果，不需要为右边写代码
        
        System.out.println("===== 梯形 =====");
        // 1. 梯形（3行）
        for (int i = 1; i <= 3; i++) {//换行换3次
            for (int j = 1; j <= 3 - i; j++) System.out.print(" "); // 空格
            //（知识误区）“j <= 3 - i”，形如这样的公式，可以控制print打印的内容，不只代表循环次数
            for (int k = 1; k <= 2 * i + 1; k++) System.out.print("*"); // 星号
            System.out.println();
        }

        System.out.println("\n===== 菱形 =====");
        // 2. 菱形（上半部分：4行）
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 - i; j++) System.out.print(" ");
            for (int k = 1; k <= 2 * i - 1; k++) System.out.print("*");
            System.out.println();
        }
        // 2. 菱形（下半部分：3行）
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) System.out.print(" ");
            for (int k = 1; k <= 7 - 2 * i; k++) System.out.print("*");
            System.out.println();
        }

        System.out.println("\n===== 空心菱形 =====");
        // 3. 空心菱形（上半部分：4行）
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 - i; j++) System.out.print(" ");
            for (int k = 1; k <= 2 * i - 1; k++) {
                // 核心：只打首尾，中间打空格
                if (k == 1 || k == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // 3. 空心菱形（下半部分：3行）
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) System.out.print(" ");
            for (int k = 1; k <= 7 - 2 * i; k++) {
                if (k == 1 || k == 7 - 2 * i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
//太牛逼了
//是我学不会的东西
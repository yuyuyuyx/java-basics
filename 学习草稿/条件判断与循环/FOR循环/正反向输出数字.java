package 学习草稿.条件判断与循环.FOR循环;

public class 正反向输出数字 {
    public static void main(String[] args) {
        // 正向循环
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        
        // 🌟 关键修复：正向循环结束后，主动换行
        System.out.println(); 

        // 反向循环
        for (int j = 5; j >= 1; j--) {
            System.out.print(j + " ");
        }
        
        // 🌟 关键修复：程序最后也换行，防止提示符覆盖输出
        System.out.println(); 
    }
}
/*两个同时进行 
for (int i = 1, j = 5; i <= 5; i++, j--) {
    System.out.print(i + " ");   // 正向
    System.out.print(j + "\t");  // 反向，用制表符 \t 对齐
}*/ 
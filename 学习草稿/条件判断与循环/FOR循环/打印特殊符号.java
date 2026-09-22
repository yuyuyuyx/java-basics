package 学习草稿.条件判断与循环.FOR循环;

public class 打印特殊符号 {
    public static void main(String[] args) {
        //打印4*5的*矩阵
        for (int i = 1; i <= 4; i++) {//行数
            for (int k = 1; k <=5; k++) {//列数
                System.out.print("*");//print不换行

            }
            System.out.println();//换行记得在外层换
        }
        //打印5*5的*图标组成的正三角形
        for (int i = 1; i <= 5; i++) {//行数
            for (int k = 1; k <=i; k++) {//列数保持和行数相等
                //行循环到2，列也循环到2
                System.out.print("*");//print不换行

            }  
            System.out.println();//换行记得在外层换
        }
        //打印5*5的*图标组成的倒三角形
        for (int i = 1; i <= 5; i++) {//行数
            for (int k = i; k <=5; k++) {//列数与行数一致，设定列数的边界，用行数固定列数
                //行循环到2，列也循环到2
                System.out.print("*");//print不换行

            }
            System.out.println();//换行记得在外层换
        }

        
    }

}

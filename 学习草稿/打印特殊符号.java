package 学习草稿;

public class 打印特殊符号 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {//行数
            for (int k = 1; k <=5; k++) {//列数
                System.out.print("*");//print不换行

            }
            System.out.println();//换行记得在外层换
        }
    }

}

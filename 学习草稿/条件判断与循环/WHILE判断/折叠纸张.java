package 学习草稿.条件判断与循环.WHILE判断;

public class 折叠纸张 {
    public static void main(String[] args) {
        double paperThickness = 0.1;
        double altitude = 8848860;//此处为毫米，约等于8848.86米
        int n = 0;
        while (paperThickness <= altitude) {
            paperThickness*=2.0;
            n++;


        }
        System.out.println(n);
    }
}

package 学习草稿.面向对象进阶.static关键字.final关键词.常量练习;

public class circle_test {
    public static void main(String[] args) {
        circle one = new circle();
        one.setr(4);
        one.getr();
        one.circumference();
        //只要类里面的方法设置的为空参，这里就不用再次输入参数
        //只需要前面输入一次就行了
        one.area();
        System.out.println(one.area());
        System.out.println(one.circumference());
    }
}

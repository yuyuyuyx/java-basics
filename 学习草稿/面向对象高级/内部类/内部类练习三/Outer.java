package 学习草稿.面向对象高级.内部类.内部类练习三;

public class Outer {
    int a = 10;
    static int b = 10;

    // 静态内部类
    static class Inner {
        public void show1() {//非静态方法
            System.out.println("非静态的方法被调用了");
            System.out.println(b);// 打印外部静态变量是允许的
            // System.out.println(a);//外部非静态变量不允许
            Outer one = new Outer();//先创建外部类对象才能访问，静态内部类方法也是如此
            System.out.println(one.a);

        }

        public static void show2() {
            System.out.println("静态的方法被调用了");
        }
    }
}

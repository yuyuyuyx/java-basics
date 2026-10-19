package 学习草稿.面向对象进阶.static关键字.final关键词.final特性测试;

public class final创建常量测试 {
    public static void main(String[] args) {
        // 定义一个常量
        final int x = 10;// 常量的名字居然可以用汉语？
        // 下划线隔开
        final int x_h = 10;
        // 使用常量
        // 参与加减乘除
        System.out.println(x + x_h);
        System.out.println(x * x_h);
        // 常量无法再次赋值

        // x =5;

        // System.out.println(x);

        // final修饰什么，什么便无法改变
        // 基本数据类型：变量里储存的是数据，数据无法修改
        // 引用数据类型：储存的是地址，地址无法更改，但数据可以改
        // 定义一个引用数据变量
        final student ONE = new student("张三", 13);
        // ONE = new student();//利用常量创建一个新对象是不行的
        // 给引用数据类型赋值,是可以的
        ONE.setage(14 );
        System.out.println(ONE.getage());


    }
}

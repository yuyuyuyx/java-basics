package 第一阶段.面向对象高级.内部类.内部类练习三;

public class test {
    public static void main(String[] args) {
        //静态的东西，用类名.获取，有外部就把外部先拉进来
        Outer.Inner one = new Outer.Inner();
        //创建静态内部类对象的方式
        Outer.Inner.show2();//静态方法这样做
        Outer.Inner two = new Outer.Inner();
        two.show1();//这是非静态方法的做法
    }
}

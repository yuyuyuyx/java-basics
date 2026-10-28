package 第一阶段.面向对象高级.内部类.内部类练习二;

public class test {
    public static void main(String[] args) {
        Outer.Inner one = new Outer().new Inner();
        one.show();

    }
}

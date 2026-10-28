package 第一阶段.面向对象高级.内部类.内部类练习四;

public class Outer {
    int a = 10;

    public void show() {

        class inner {
            String name="1";//局部内部类变量
            int age;
            // 创建在方法内部的类就是局部内部类
            // public用不在局部内部类，外界的public变量也不行

            public void method1() {
                System.out.println("局部method1");
            }

            public static void method2() {
                System.out.println("局部method2静态");
            }
        }
        // 创建局部内部类对象以调用局部内部类变量与方法
        inner i = new inner();
        System.out.println(i.name);
        i.method1();

    }

}

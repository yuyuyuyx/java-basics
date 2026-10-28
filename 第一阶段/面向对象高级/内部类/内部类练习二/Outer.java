package 第一阶段.面向对象高级.内部类.内部类练习二;

public class Outer {
   
    private int a = 10;//外部类的变量

    class Inner {
        private int a = 20;//内部类的变量

        public void show() {
            int a = 30;//本方法的变量
            System.out.println(Outer.this.a); // 10
            //外部类.this.外部类变量名就可以调用外部变量，对抗就近原则
            System.out.println(this.a); // 20
            System.out.println(a); // 30
        }
    }
}


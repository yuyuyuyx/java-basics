package 第一阶段.面向对象高级.内部类.内部类练习五;

import 第一阶段.面向对象高级.接口.接口练习一.swim;

public class Test {
    public static void main(String[] args) {
        // 要求:在测试类中调用下面的goSwimming方法
        // student one = new student();

        // goSwimming(one);
        // 以上为传统方式调用、

        // 以下为省略实现类文件的做法（匿名内部类）
        goSwimming(new Swim() {// 定义匿名内部类（没有类名的内部类）
            @Override
            // 此处的swim只是一个接口
            // 大括号里面的才是真正的匿名内部类
            public void swim() {// 重写方法
                System.out.println("swim");

            }

        });
        // 整个goSwimming的括号被撑开，里面把匿名内部类塞进去
        // 也可以把匿名内部类赋值给变量
        Swim s = new Swim() {//匿名内部类（实现类）本质是一个没名字的变量
            @Override
            public void swim() {// 重写方法
                System.out.println("swim");

            }

        };
        goSwimming(s);

    }

    public static void goSwimming(Swim s) {
        // 这里需要一个swim实现类，但swim是个接口
        // 所以需要stduent实现类来辅助创建变量执行
        s.swim();
    }
}
package 学习草稿.面向对象高级.接口.接口练习一;

public class test {
    public static void main(String[] args) {
        animal[] animal = {
                new frog("青蛙", "green"),
                new rabit("兔子", "white"),
                new dog("狗", "yellow")
        };
        for (animal index : animal) {
            System.out.print(index.getname());
            index.eat();
            if (index instanceof swim) {
                // 兔子没接入swim接口，不能直接index.swim()。
                // 需要接入instanceof来做个判断
                // 继承要写在接口前面
                // 如果父类是一个抽象类，子类中需要抽象所有的抽象方法，或者子类自己就是抽象类
                // 不同接口的抽象方法有重复，子类只重写一次，与父类有重复也是这样
                // 接口可以接好几个
                ((swim) index).swim();

            }

        }
    }
}

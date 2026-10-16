package 学习草稿.面向对象基础.dog;

public class dog {// 定义一个名叫"狗"的类
    // 定义类的属性,私有化改造
    String name;
    private int age;
    double weight;// 单位千克
    String color;

    // 定义行为
    // 1.判断数据合理与否
    public void setAge(int age) {// 这里需要把外界的相关数据类型作为形参加入
        if (age <= 15 && age >= 0) {
            // 当方法的参数名和类的成员变量名相同时，
            // 必须使用 this.属性名 来指代成员变量，
            // 直接写 属性名 指的是传进来的参数。
            this.age = age;// 前一个 this.age 是成员变量，后一个 age 是参数

        } else {
            System.out.println("请重新输入,此输入不合法");

        }

    }

    public int getAge() {
        return this.age;

    }

    public void eat() {
        System.out.println(age + "岁的" + name + "," + "正在吃骨头");

    }

}

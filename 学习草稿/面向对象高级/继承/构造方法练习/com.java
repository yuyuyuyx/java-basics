package 学习草稿.面向对象高级.继承.构造方法练习;

public class com {
    String name;
    int age;

    // 空参构造
    public com() {
        System.out.println("com空");

    }

    // 添加接收对应参数的构造方法
    public com(String name, int age) {
        this.name = name;
        this.age = age;
    }

}

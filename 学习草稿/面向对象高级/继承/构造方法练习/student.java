package 学习草稿.面向对象高级.继承.构造方法练习;

public class student extends com {
    String grade;

    public student() {
        super();
        System.out.println("studen空");
    }

    public student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;//子类独有的参数不能往父类里面塞
        System.out.println("student");

    }
}

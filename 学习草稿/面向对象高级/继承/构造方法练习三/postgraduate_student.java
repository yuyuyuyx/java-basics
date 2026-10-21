package 学习草稿.面向对象高级.继承.构造方法练习三;

public class postgraduate_student extends student {
    @Override
    public void study() {
        System.out.println("正在攻读硕士学位");

    }

    @Override
    public void sleep() {
        System.out.println("过了一段时间，在豪华版学生公寓睡觉");
    }

    public postgraduate_student() {

    }

    public postgraduate_student(String name, int age, String grade) {
        super(name, age, "研究生");
    }
}

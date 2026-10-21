package 学习草稿.面向对象高级.继承.构造方法练习一;

public class teacher extends com {
    String subject;

    public teacher() {
        System.out.println("teach空");
    }

    public teacher(String name, int age) {
        System.out.println("teach");
        super(name, age);
        this.subject = subject;
    }
}

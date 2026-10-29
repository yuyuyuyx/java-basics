package 第一阶段.面向对象高级.继承.构造方法练习一;

public class teacher extends com {
    String subject;

    public teacher() {
        System.out.println("teach空");
    }

    public teacher(String name, int age) {
        super(name, age);
        System.out.println("teach");

        this.subject = subject;
    }
}

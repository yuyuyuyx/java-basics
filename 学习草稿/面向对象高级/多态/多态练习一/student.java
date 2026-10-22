package 学习草稿.面向对象高级.多态.多态练习一;

public class student extends com {
    // 空参
    public student() {
        super();
    }

    public student(String name, int account, int cope,String job) {
        super(name, account, cope,"学生");
    }
    //继承方法
    @Override
    public void work() {
        System.out.println("学生的工作是学习");
    }
    
    //父类抽象了几个概念，子类如果是实体（无abstract）就必须实际化几个方法

}

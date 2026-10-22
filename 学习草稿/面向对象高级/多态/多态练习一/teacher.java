package 学习草稿.面向对象高级.多态.多态练习一;

public class teacher extends com {
    public teacher() {
        super();
    }

    public teacher(String name, int account, int cope,String job) {
        super(name, account, cope,"老师");
    }

    // 继承方法
    @Override
    public void work() {
        System.out.println("老师的工作是教书");
    }

    
}

package 学习草稿.面向对象高级.多态.多态练习一;

public class admin extends com {
    public admin() {
        super();
    }

    public admin(String name, int account, int cope,String job) {
        super(name, account, cope,"管理员");
    }

    // 继承方法
    @Override
    public void work() {
        System.out.println("管理员的工作是管理网站");
    }

   
}

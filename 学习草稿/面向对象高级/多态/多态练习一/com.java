package 学习草稿.面向对象高级.多态.多态练习一;

public abstract class com {
    private String name;
    private int account;
    private int cope;
    private String job;

    // 空参
    public com() {

    }

    public com(String name, int account, int cope, String job) {
        this.name = name;
        this.cope = cope;
        this.account = account;
        this.job = job;
    }

    // abstract提取概念
    public abstract void work();// 抽象一个“工作”的概念，为所有子类服务

    // set/get方法

    public void setname(String name) {
        this.name = name;
    }

    public String getname() {
        return name;
    }

    public void setaccount(int account) {
        this.account = account;

    }

    public int getaccount() {
        return account;

    }

    public void setcope(int cope) {
        this.cope = cope;

    }

    public int getcope() {
        return cope;
    }

    public void setjob(String job) {
        this.job = job;

    }

    public String getjob() {
        return job;
    }
}

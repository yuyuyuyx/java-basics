package 学习草稿.面向对象高级.继承.作业一;

public class com {
    private int id;
    private String name;
    private double salary;
    private String job;

    // 空参
    public com() {

    }

    public com(int id, String name, double salary,String job) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.job =job;

    }

    // get/set方法
    public void setid(int id) {
        this.id = id;
    }

    public int getid() {
        return id;

    }

    public void setname(String name) {
        this.name = name;

    }

    public String getname() {
        return name;

    }

    public void setsalary() {
        this.salary = salary;
    }

    public double getsalary() {
        return salary;

    }
    public void setjob(String job) {
        this.job =job;
        
    }
    public String getjob(){
        return job;
    }
    //吃饭
    public void eat(){
        System.out.println("吃米饭");
    }
}

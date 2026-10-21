package 学习草稿.面向对象高级.继承.作业一;

public abstract class com {
    //abstract效果是禁止：“ new：new com(...) ”直接编译不通过。
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

    public void setsalary(double salary) {
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
    //工作新定义方法
    public abstract void work();// 父类只声明"要干活"
    // 只有声明，没有方法体，连 {} 都没有
}

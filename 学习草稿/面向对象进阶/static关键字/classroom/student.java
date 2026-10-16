package 学习草稿.面向对象进阶.static关键字.classroom;

public class student {
    private String name;
    private int age;
    
    // 写一个空参(反正写一个)

    public student() {

    }

    // 写一个全参
    public student(String name, int age) {
        // 似乎共享变量不能在全参里面写

    }

    // 学生变量设置set/get方法
    public void setname(String name) {
        this.name = name;

    }

    public String getname() {
        return name;
    }

    public void setage(int age) {
        this.age = age;

    }

    public int getage() {
        return age;
    }

}

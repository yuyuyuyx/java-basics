package 学习草稿.面向对象.学生1;

public class student1 {
    private String name;
    private int age;

    public student1() {

    }

    public student1(String name, int age) {
        this.name = name;
        this.age = age;

    }

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

    public void eat() {
        System.out.println(name + "在吃饭");

    }

    public void study() {
        System.out.println(name + "在学习");

    }

    public void sleep() {
        System.out.println(name + "在睡觉");

    }

}

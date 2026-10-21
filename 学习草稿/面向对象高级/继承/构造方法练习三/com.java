package 学习草稿.面向对象高级.继承.构造方法练习三;

public class com {
    private String name;
    private int age;

    public void eat() {
        System.out.println("在吃饭");
    }

    public void sleep() {
        System.out.println("在睡觉");

    }

    public com() {

    }

    public com(String name, int age) {
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

}

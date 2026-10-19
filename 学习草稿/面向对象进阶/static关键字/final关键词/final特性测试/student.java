package 学习草稿.面向对象进阶.static关键字.final关键词.final特性测试;

public class student {
    //final修饰私有变量，类内无法修改，只要再赋值就失效
    //但是可以在测试类里面
    private String name;
    private int age;

    public student() {

    }

    public student(String name, int age) {
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

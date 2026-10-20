package 学习草稿.面向对象高级.继承.初步试验;

public class father {
    private String name;
    private int age;

    public father() {

    }

    public father(String name, int age) {
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

    // 写一个动作：吃饭
    public void eat() {
        System.out.println("在吃饭");
    }

}

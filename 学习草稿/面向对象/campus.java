package 学习草稿.面向对象;

public class campus {
    private String name;
    private int age;
    private double height;
    private double weight;

    public void study() {
        System.out.println("刚进入大学努力学习");

    }

    public void setname(String name) {
        this.name = name;

    }

    public String getname() {
        return name;

    }

    public void setage(int age) {
        this.age = age;
        if (age < 0 || age > 30) {
            System.out.println("请重新输入");

        }

    }

    public int getage() {
        return age;

    }

    public void setweight(double weight) {
        this.weight = weight;

    }

    public double getweight() {
        return weight;
    }

    public void setheight(double height) {
        this.height = height;
    }

    public double getheight() {
        return height;
    }
}

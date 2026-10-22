package 学习草稿.面向对象高级.多态.多态练习二;

public abstract class vehicle {
    private String brand;
    private double speed;

    public vehicle() {

    }

    public vehicle(String brand, double speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void setbrand(String brand) {
        this.brand = brand;
    }

    public String getbrand() {
        return brand;
    }

    public void setspeed(double speed) {
        this.speed = speed;
    }

    public double getspeed() {
        return speed;
    }

    // abstract提取抽象概念
    public abstract void move();

}

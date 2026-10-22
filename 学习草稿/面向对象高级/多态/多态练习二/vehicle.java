package 学习草稿.面向对象高级.多态.多态练习二;

public abstract class vehicle {
    //如果一个类里面有抽象方法，这个类前面必须有abstract（抽象类）
    //ps：为什么class前面要写abstract？
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
    //抽象以后必须让子类在方法里面重写

}

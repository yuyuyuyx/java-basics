package 学习草稿.面向对象高级.多态.多态练习二;

public abstract class com {
    private String grand;
    private double speed;

    public com() {

    }

    public com(String grand, double speed) {
        this.grand = grand;
        this.speed = speed;
    }

    public void setgrand(String grand) {
        this.grand = grand;
    }

    public String getgrand() {
        return grand;
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

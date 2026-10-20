package 学习草稿.面向对象高级.继承.继承练习一;

public class father {
    private double price;
    private String grand;

    // 行为
    public void telephone() {
        System.out.println("打电话");

    }

    public void Email() {
        System.out.println("发短信");

    }

    // get/set
    public void setprice(double price) {
        this.price = price;
    }

    public double getprice() {
        return price;
    }

    public void setgrand(String grand) {
        this.grand=grand;
    }

    public String getgrand() {
        return grand;
    }
}

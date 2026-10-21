package 学习草稿.面向对象高级.继承.方法练习二;

public class smart_device {
    private String grand;
    private double price;

    public double compute_price() {
        if (price < 1000 && price > 0) {
           
        } else if (price >= 1000 && price < 5000) {
            price *= 0.9;
        } else if (price >= 5000 && price < 10000) {
            price *= 0.8;
        } else {
            price *= 0.7;
        }
        return price;

    }

    public void setgrand(String grand) {
        this.grand = grand;
    }

    public String getgrand() {
        return grand;
    }

    public void setprice(double price) {
        this.price = price;

    }

    public double getprice() {
        return price;

    }
}

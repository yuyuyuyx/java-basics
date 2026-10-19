package 学习草稿.面向对象进阶.static关键字.final关键词.常量练习;

public class circle {
    private double r;
    private final static double Π = 3.14;// 定义常量Π
    // 空参

    public circle() {

    }

    // 全参，常量不算变量参数，不要写入括号
    public circle(double r) {
        this.r = r;

    }

    // set方法
    public void setr(double r) {
        this.r = r;

    }

    // get方法
    public double getr() {
        return r;

    }

    // 为什么常量需要写get，不写行不行？
    // 不写也行，目前没有用到get的人
    // 什么时候要加
    /*
     * 这个类要作为库发布给别人用 → 那时该考虑的是 API 稳定性，而不是 getter 本身。
     * 团队有强制编码规范 → 那是评审规则的成本，技术上依然零影响。
     */
    public double getΠ() {
        return Π;

    }

    // 计算周长的方法
    public double circumference() {
        double circumference = 2 * r * Π;
        return circumference;

    }

    // 计算面积的方法
    public double area() {
        double area = r * r * Π;
        return area;

    }

}

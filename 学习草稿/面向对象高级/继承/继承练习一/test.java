package 学习草稿.面向对象高级.继承.继承练习一;

public class test {
    public static void main(String[] args) {
        // 创建三种设备
        Android one = new Android();
        apple two = new apple();
        computer three = new computer();
        // 都写入信息
        one.setgrand("安卓");
        one.setprice(2300);
        System.out.println(one.getgrand() + one.getprice());
        two.setgrand("苹果");
        two.setprice(5700);
        System.out.println(two.getgrand() + two.getprice());
        three.setgrand("联想");
        three.setprice(7800);
        System.out.println(three.getgrand() + three.getprice());
        // 执行行为
        one.telephone();
        one.Email();
        one.nfc();
        two.telephone();
        two.Email();

        three.coding();
        // 类里面没定义的，并且没继承的，就不能跨类调用
    }
}

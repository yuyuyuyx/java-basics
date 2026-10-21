package 学习草稿.面向对象高级.继承.方法练习二;

public class test {
    public static void main(String[] args) {
        phone device1 = new phone();
        device1.setgrand("vivo");
        System.out.println(device1.getgrand());
        device1.setprice(3000);
        device1.compute_price();
        System.out.println(device1.getprice());

        laptop device2 = new laptop();
        device2.setgrand("联想");
        device2.getgrand();
        device2.setprice(10000);
        device2.compute_price();
        System.out.println(device2.getprice());

        tablet device3 = new tablet();
        device3.setgrand("华为");
        device3.getgrand();
        device3.setprice(3300);
        device3.compute_price();

    }
}

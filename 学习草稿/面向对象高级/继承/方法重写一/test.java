package 学习草稿.面向对象高级.继承.方法重写一;


public class test {
    public static void main(String[] args) {
        System.out.println("第一代功能展示");
        Frist telephone1 = new Frist();
        telephone1.telephone();
        System.out.println("第二代功能展示");
        second telephone2 = new second();
        telephone2.telephone();;
        telephone2.Email();
        System.out.println("第三代功能展示");
        third telephone3 =new third();
        telephone3.telephone();
        telephone3.game();
        telephone3.Email();

    }
}

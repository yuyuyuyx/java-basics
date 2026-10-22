package 学习草稿.面向对象高级.多态.多态练习二;

public class test {
    public static void main(String[] args) {
        vehicle[] staff = {
                new bicycle("松下", 15),
                new car("大众", 60)
        };
        person one = new person("小张", 24, "男");
        System.out.println(one.getname() + "," + one.getage() + "," + one.getgender());
        for (vehicle index : staff) {
            System.out.print(one.getname() + "正在驾驶");
            index.move();
            one.drive(index);
        }
    }
}

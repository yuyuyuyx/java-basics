package 学习草稿.对象.数据安全.小狗;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Shuxing D = new Shuxing();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入小狗的名字");
        D.name = sc.nextLine();

        // ... 输入名字的逻辑 ...

        // 循环录入年龄，直到合法为止
        while (true) {
            System.out.println("请输入小狗的年龄");
            if (sc.hasNextInt()) { // 安检
                int num = sc.nextInt();
                sc.nextLine(); // 吃掉回车

                if (D.setAge(num)) {
                    break;
                } else {
                    System.out.println("年龄不能为负数，请重新输入！");
                }
            } else {
                System.out.println("请输入合法的整数！");
                sc.nextLine(); // 吃掉这一行垃圾输入
            }
        }

        System.out.println("小狗的名字是：" + D.name);
        System.out.println("小狗的年龄是：" + D.getAge());

        Action dogAction = new Action();
        dogAction.eatbone();

    }

}
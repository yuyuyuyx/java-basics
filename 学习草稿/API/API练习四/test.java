package 学习草稿.API.API练习四;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // 写一个登陆过程
        // 假设数据
        String true_account = "zhangsan";
        String true_password = "123456";//这里也需要为字符串，不然虽然不报错，但是运行出错
        for (int i = 1; i <= 3; i++) {
            // 请输入您的账号和密码
            System.out.println("请输入您的账号和密码：");
            Scanner sc = new Scanner(System.in);
            //加个先后提示
            System.out.println("账号：");
            String account = sc.next();
            System.out.println("密码：");
            String password = sc.next();

            // 采取一个布尔值来打包整个数据（核心）
            boolean result = account.equals(true_account) && password.equals(true_password);// 比较字符串，两种数据类型都是字符串
            if (result) {
                System.out.println("登录成功");
                break;
            } else {
                if (i <= 2) {
                    System.out.println("账号或者密码错误，请重新输入，您还有" + (3 - i) + "机会");// 别忘了括号

                } else {
                    System.out.println("错误次数过多，您的账号暂时被锁定，请联系客服解决");
                }
            }
        }
    }
}

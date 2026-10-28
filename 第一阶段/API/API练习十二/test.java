package 第一阶段.API.API练习十二;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        System.out.println("请输入一串字符串");
        Scanner sc = new Scanner(System.in);
        String result = sc.next();

        StringBuffer sB = new StringBuffer(result);// 可以传参数然后反转
        sB.reverse();// 先反转再转回字符串才能打印
        // 这一点也表明字符串是不能修改的
        // 每一次操作只是在创造新的字符串，然后打印

        System.out.println(sB.toString());

    }
}

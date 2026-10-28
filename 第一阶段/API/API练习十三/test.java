package 第一阶段.API.API练习十三;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        System.out.println("请输入字符串：");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int result = str.length() % 8;// 判断是不是八的倍数
        int zero = 8 - result;// 缺几个补充几个
        if (zero != 0) {
            String result2 ="00000000".substring(0, zero);
            str += result2;

        }
        System.out.println(str);
    }

}

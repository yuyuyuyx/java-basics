package 学习草稿.API.API练习六;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.println("请输入一串字符：");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // 统计大小写和数字出现的次数
        int big = 0;
        int small = 0;
        int number = 0;
        // 全部初始化
        for (int index = 0; index < str.length(); index++) {
            char c = str.charAt(index);
            if (c <= 'Z' && c >= 'A') {
                big++;

            } else {
                if (c <= 'z' && c >= 'a') {
                    small++;

                } else {
                    if (c <= '9' && c >= '0') {
                        number++;
                    }else{
                        System.out.println("特殊字符不参与统计");
                    }
                }
            }

        }
        System.out.println(//别写在for循环里面，这是展示结果用的，不需要重复循环
            "大写字母出现的次数为:"+big+
            "\n小写字母出现的次数为:"+small+ 
            "\n数字字符出现的次数为:"+ number);

    }
}

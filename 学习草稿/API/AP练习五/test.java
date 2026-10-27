package 学习草稿.API.AP练习五;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // 遍历字符串
        // 定义一个字符串
        System.out.println("请输入一个字符串：");
        Scanner sc = new Scanner(System.in);
        String k = sc.next();//输入数字也可以
        for (int index = 0; index < k.length(); index++) {

            System.out.println(k.charAt(index));//如何防止换行呢
            //直接print打不出来

            
        }

    }
}

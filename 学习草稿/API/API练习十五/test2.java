package 学习草稿.API.API练习十五;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两串数字字符");
        System.out.println("数字串1:");
        String numbeString1 = sc.next();
        System.out.println("数字串2:");
        String numbeString2 = sc.next();
        // 把数字往数组里面放
        // 先确定数组长度，以长的为准
        int len = numbeString1.length() >= numbeString2.length() ? numbeString1.length() : numbeString2.length();
        //定义一个方法把数据放进去
        public static int[]array(String str,int len){
            //new出一个新数组
            int []arr =new int[];
            //把字符串中的数据放到数组
            for(int index =0;index<str.length();index++){
                  char c = str.charAt(len);
                  int num =c-48;
            }
            

            

        }


    }
}

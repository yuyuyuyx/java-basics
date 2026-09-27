package 学习草稿.前期所学的综合的算法训练;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class 大乐透 {
    public static void machine_produce(int user[]) {
        Random r = new Random();

        int data_array[] = new int[7];
        for (int index = 0; index <= data_array.length - 3; index++) {
            // 机器查重
            int data = r.nextInt(35) + 1;
            while (true) {
                if (data == data_array[index]) {
                    data = r.nextInt(35) + 1;// 重新生成
                    continue;

                }
                data_array[index] = data;
            }

        }
        for (int index = 0; index < data_array.length; index++) {
            if (user[index]==data_array[index]) {
               
                
            }

        }
        System.out.println(Arrays.toString(data_array));

    }

    public static void main(String[] args) {
        int user[] = new int[7];// 装用户输入数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请从1-35中选取5个不重复数字作为前区号码:");
        for (int index = 0; index <= 4; index++) {
            int number = sc.nextInt();
            user[index] = number;

        }
        System.out.println("请从1-12中选取2个不重复数字作为后区号码");
        for (int index = 5; index <= 6; index++) {
            int number = sc.nextInt();
            user[index] = number;
        }
        System.out.println(Arrays.toString(user));// 检测数组能不能正常打印

    }
}

package 学习草稿;

import java.util.Scanner;

public class 满足条件的数字 {
    public static void main(String[] args) {
        System.out.println("请输入两个整数作为区间");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result = 0;//一定程度上也可以解决，区间不现实，所以结果是0
        if (num1 >= num2) {
            System.out.println("请重新输入");
            return;// 避免必须执行一次（“1”）的问题

        }
        for (int i = num1; i <= num2; i++) {
            if (i % 6 == 0 && i % 8 == 0) {
                result++;

            }

        }
        System.out.println(result);

    }

}

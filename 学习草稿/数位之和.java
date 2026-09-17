package 学习草稿;

import java.util.Scanner;

public class 数位之和 {
    public static void main(String[] args) {
        System.out.println("请输入一个合法整数");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

        if (num < 0) {
            //记住这个 Math.abs()，以后处理绝对值会非常常用。(绝对值函数)
            //num = Math.abs(num); // 取绝对值，无论正负都变成正数
            num = -num;

        }

        while (num > 0) {//核心循环：只要数字大于 0，就继续拆解(大于0说明还有数位)
            int result = num % 10;// 取个位数方式
            sum += result;// 累加到总和
            num /= 10;

        }
        System.out.println(sum);
    }
}

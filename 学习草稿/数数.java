package 学习草稿;

import java.util.Scanner;

public class 数数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // 第一道拦截：是 4 的倍数，直接跳过
            if (i % 4 == 0) {
                continue;
            }

            // 第二道拦截：拆位检查是否包含 4
            int temp = i;
            boolean hasFour = false; // 默认不包含 4
            while (temp > 0) {
                int digit = temp % 10; // 取个位
                if (digit == 4) {
                    hasFour = true; // 发现包含 4
                    break; // 已经发现包含 4，后面的位不用查了
                }
                temp /= 10; // 砍掉个位
            }

            // 如果包含 4，也跳过
            if (hasFour) {
                continue;
            }

            // 经过两层拦截都没跳过，说明是安全的数字，打印它
            System.out.println(i);
        }
    }
}
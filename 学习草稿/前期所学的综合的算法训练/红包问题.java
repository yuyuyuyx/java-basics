package 学习草稿.前期所学的综合的算法训练;

import java.util.Random;
import java.util.Scanner;

public class 红包问题 {

    public static void main(String[] args) {
        // 一个红包生成器

        System.out.println("（温馨提示:领红包的人数和红包总数一样多）");
        Scanner sc = new Scanner(System.in);
        System.out.println("请设置红包总额：");
        double sum = sc.nextDouble();
        System.out.println("请设置红包总数");
        int number = sc.nextInt();
        Random r = new Random();

        for (int i = 1; i <= number; i++) {// 保证每个人都能领钱，循环number次，全都有份
            double money;// 假设每个人都没领钱
            if (sum > 0) { // 只要还有钱就发
                // 1. 计算随机上限（给后面的人留 1 元保底）
                double maxAmount = sum - (number - i) * 1.0;

                // 2. 在 [1, maxAmount] 之间随机
                money = r.nextDouble(maxAmount) + 1;

                // 3. 扣钱！
                sum -= money;

                // 4. 打印（用 Math.round 保留两位小数）
                System.out.println("第" + i + "个人分到了 " + Math.round(money * 100) / 100.0 + " 元");

            } else {
                // 如果前面的运气太好把钱分完了，后面的人保底 0 元
                System.out.println("第" + i + "个人没抢到红包");
            }

    

        }

    }
}

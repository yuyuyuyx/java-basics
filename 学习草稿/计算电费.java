package 学习草稿;

import java.util.Scanner;

public class 计算电费 {
    public static void main(String[] args) {
        System.out.println("请输入你用了几度电");
        Scanner sc = new Scanner(System.in);
        double usage = sc.nextDouble();
        if (usage > 0 && usage <= 100) {
            double cost = 0.5 * usage;
            System.out.println("cost=" + cost);

        } else if (usage > 100 && usage <= 200) {
            double cost = (usage - 100) * 0.8 + 100 * 0.5;
            System.out.println("cost=" + cost);

        } else {
            double cost = (usage - 200) * 1.2 + 200 * 0.8;
            System.out.println("cost=" + cost);
        }
    }
}
/*
 * 致命 Bug：大于200度的计算公式算错了
 * 看你的第三段 else：
 * 
 * java
 * double cost = (usage - 200) * 1.2 + 200 * 0.8;
 * 带入一个真实数据验证一下：假设用户用了 300度电。
 * 
 * 前100度：100 * 0.5 = 50元
 * 
 * 100到200度：100 * 0.8 = 80元
 * 
 * 超过200度的部分（300-200=100度）：100 * 1.2 = 120元
 * 
 * 总电费应该是：50 + 80 + 120 = 250元。
 * 
 * 但是你的代码算出来是多少呢？
 * (300 - 200) * 1.2 + 200 * 0.8 = 100 * 1.2 + 160 = 120 + 160 = 280元。
 * 
 * 多收了30元！ 因为你把前200度的电费全按 0.8 计算了，但实际上前100度应该是 0.5。所以你的第三段公式应该写成：
 * (usage - 200) * 1.2 + 100 * 0.8 + 100 * 0.5
 * 
 * 🛡️ 逻辑漏洞：没拦住负数（和之前一样）
 * 你只判断了 usage > 0 && usage <= 100。如果用户输入 0 或者 -50，它会直接掉进最后的 else 里，算出负数电费。
 * 建议在第一行加上 if (usage <= 0) 的拦截。
 */

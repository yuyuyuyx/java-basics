package 学习草稿.条件判断与循环.WHILE判断;

public class 复利计算器 {
    public static void main(String[] args) {
        double money1 = 100000;//本金和利率数据类型相同
        double year = 0;
        /*
         * 你的代码（year=1）：初始 10万，第一年结束变成 101700，year 变成 2。如果此时刚好超过 20 万，程序会打印“2
         * 年后本金翻倍”。但事实是第一年刚结束。
         * 
         * 优化后（year=0）：初始 10万，第一年结束变成 101700，year 变成 1。打印“1 年后本金翻倍”。这才是正确的计年逻辑。
         */
        while (money1 <= 200000) {
            money1 *= 1.017;
            year++;

        }
        System.out.println(year + "年后本金翻倍");

    }
}

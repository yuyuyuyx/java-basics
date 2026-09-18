package 学习草稿;

import java.util.Random;
import java.util.Scanner;

public class 模拟猜数字 {
    public static void main(String[] args) {
        Random r = new Random();
        /* 生成随机数字的生成器，和scanner相同结构（一个前提＋执行语句） */
        Scanner sc = new Scanner(System.in);
        
        int num = r.nextInt(100) + 1;
        //只能执行一次，不然猜错后下一次数字就是新数字，永远猜不对
        // 开始生成,括号里面是区间右，不写就是乱值，循环有范围都拦不住
        // nextInt(最大值 - 最小值 + 1) + 最小值）
        // 为什么要这样：因为括号里的数是右开，实际上取不到，所以要加1
        // 左边是从0开始
        for (int i = 1; i <= 100; i++) {

            System.out.println("你猜数字是几(从1-100的整数)");
            //即便提示在后面，录入语句在前面，录入步骤依然生效

            int ynum = sc.nextInt();
            if (ynum == num) {
                System.out.println("猜对了");

            } else {
                System.out.println("没猜对,正确答案是:" + num);
                //一般别剧透，不然下次直接就对了，失去游戏性
                // break;//加一个break猜一次就够，不然就是无限猜下去导致可以直接枚举破解游戏
            }

        }
    }
}

package 学习草稿.前期所学的综合的算法训练;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
/*/*
 * ========== 多数据统计优化方向（待办清单） ==========
 * 
 * 【难度：🟢 现在就能做】方向1：处理“并列最多”的情况（目前只找了一个人）
 * 具体做法：使用“两次遍历法”。第一次遍历只找出 maxVotes 的值；
 *          第二次遍历找出所有等于 maxVotes 的候选人并打印。
 * 
 * 【难度：🟡 稍加摸索能做】方向2：将“找最大值/最小值”的逻辑提取为独立方法
 * 具体做法：写 public static int getMaxVotes(int[] data) 等方法，
 *          把循环和打擂台封装起来，让 main 方法更清爽。
 * 
 * 【难度：🔴 需等学完第8章“面向对象/集合”】方向3：用 ArrayList 处理动态名单
 * 具体做法：因为并列的人数不确定，用固定数组不好存。
 *          用 ArrayList<Integer> winners = new ArrayList<>(); 存所有并列第一。
 * 
 * 【难度：🟡 稍加摸索能做】方向4：支持用户自定义候选人数量
 * 具体做法：用 Scanner 读入候选人数 N，把数组长度改为 N+1（给弃权留位置），
 *          把循环里的 6 都改成 N+1。
 * ==================================================
 */ 

public class 多数据统计 {
    public static void main(String[] args) {
        Random r = new Random();
        // 0为弃权，1-5是人，所以为6，不然5选不到（左闭右开）

        // 1.统计每个人的票数==统计除了0以外哪个数字最多
        // 2.得票率==除了0以外的数字/1000
        // 3.弃票率==0出现次数/1000
        // 4.弃票数==0出现次数

        int ticket;
        int ticket_data[] = new int[6];// 装票数
        double ticket_and_zero_cate[] = new double[6];// 装各种率

        for (int person = 0; person <= 999; person++) {// 一千人投票==循环1000次，但可以当数组索引
            ticket = r.nextInt(6);// 开始投票

            ticket_data[ticket]++;// 票数加一

        }

        for (int i = 0; i < ticket_and_zero_cate.length; i++) {// 开始算各种率
            ticket_and_zero_cate[i] = ticket_data[i] / 1000.0;// 数组起点相同可以用同索引
            if (i == 0) {
                System.out.println("弃票率是：" + ticket_and_zero_cate[0]);

            } else {
                System.out.println("第" + i + "位选手的得票率是：" + ticket_and_zero_cate[i]);

            } // 0以后才是人

        }
        // 找得票最多者其实就是得票率最高的人
        double max = ticket_and_zero_cate[1];
        double min = ticket_and_zero_cate[1];
        int i;
        int numbermax = 0;
        int numbermin = 0;

        for (i = 1; i <= ticket_and_zero_cate.length - 1; i++) {
            if (ticket_and_zero_cate[i] >= max) {
                max = ticket_and_zero_cate[i];
                numbermax = i;
            }

            if (ticket_and_zero_cate[i] <= min) {
                min = ticket_and_zero_cate[i];
                numbermin = i;
            }
            //两个独立逻辑要分开写

        }
        System.out.println("得票最多的选手是第" + numbermax + "位选手,票数为" + max);
        System.out.println("得票最少的选手是第" + numbermin + "位选手,票数为" + min);

        // System.out.println(Arrays.toString(ticket_data));// 检测能不能把数组先打出来
        // System.out.println(Arrays.toString(ticket_and_zero_cate));// 检测能不能把数组先打出来

    }
}

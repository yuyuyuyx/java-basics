package 学习草稿.方法;

import java.util.Scanner;

public class 评委打分 {
    public static double Extremum(double scorearray[]) {// 括号里面记得写数据类型
        double max = scorearray[0];
        double min = scorearray[0];
        for (int i = 0; i < scorearray.length; i++) {
            if (scorearray[i] > max) {
                max = scorearray[i];

            }
            if (scorearray[i] < min) {
                min = scorearray[i];

            }

        }

        return max + min;

    }
    /*
     * /*
     * ========== 评委打分优化方向（待办清单） ==========
     * 
     * 【难度：🟢 现在就能做】方向1：Scanner 输入流清理与防死循环机制（防缓存）
     * 所需知识点：hasNextDouble()、next()、while(true)、输入缓冲区原理
     * 具体做法：不要直接用 nextDouble()。应先判断 hasNextDouble() 是否为 true，
     * 如果为 false（用户输入了字母或回车），必须调用 sc.next() 将错误内容“吃掉”，
     * 否则这些残留字符会堵塞缓冲区，导致下一次读取失败，出现“多输入一次”或死循环。
     * 
     * 【难度：🟢 现在就能做】方向2：修复数组越界与最小值初始值逻辑
     * 所需知识点：for 循环边界、打擂台法
     * 具体做法：循环条件必须用 i < scorearray.length（不能写 <=）；
     * 求最小值的初始值必须设为 scorearray[0]（不能写死 scorearray[4]）。
     * 
     * 【难度：🟢 现在就能做】方向3：计算逻辑补全与输出文案修正
     * 所需知识点：数组遍历、除法运算
     * 具体做法：去掉一个最高分和一个最低分后，剩余 3 个分数的平均值 = 剩余总分 / 3.0；
     * 修正输出文案，把“五位选手”改为“五位评委”。
     * ==================================================
     */

    public static void main(String[] args) {
        System.out.println("请依次五位选手的得分：");
        Scanner sc = new Scanner(System.in);
        double scorearray[] = new double[5];
        double falsesum = 0;// += 可以加任何“值”，包括变量、表达式、数组元素。如果是变量需要提前定义
        for (int index = 0; index < scorearray.length; index++) {

            double score = sc.nextDouble();
            while (score < 0 || score > 100) { // 只要不合法，就循环重新输
                System.out.println("分数必须在0~100之间，请重新输入：");
                score = sc.nextDouble();
                sc.next();// 这种由于上一次错误输入会被缓存，所以下一次需要多输入一个数据才能出结果
            }
            scorearray[index] = score;
            falsesum += scorearray[index];

        }

        Extremum(scorearray);
        double sumscore = falsesum - Extremum(scorearray);

        System.out.println("该选手平均分为：" + sumscore / 3.0);

    }
}

package 学习草稿.方法;

import java.util.Scanner;

public class 计算班级分数 {
    public static double person(double scorearray[]) {// 传了数组就行
        int person = 0;
        for (int index = 0; index < scorearray.length; index++) {
            if (scorearray[index] >= 60) {// 完全不需要额外的score来储存成绩，每次索引本来就是成绩
                person++;

            }

        }

        return person;

    }

    public static double sumscore(double scorearray[]) {
        double sumscore = 0;// 装成绩的变量需要初始化定义，不然乱值
        for (int index = 0; index < scorearray.length; index++) {
            sumscore += scorearray[index];// 和上一个方法一样的毛病，记得用索引加数组表示数据

        }

        return sumscore;

    }

    public static double max(double scorearray[]) {
        double max = scorearray[0];
        for (int index = 0; index < scorearray.length; index++) {// 数组不要越界
            if (scorearray[index] > max) {
                max = scorearray[index];

            }

        }
        return max;

    }

    public static void main(String[] args) {
        System.out.println("请输入十位学生的成绩:");
        Scanner sc = new Scanner(System.in);
        double scorearray[] = new double[10];
        double score = 0;// 用以下循环的时候需要事先初始化，一定要赋值
        for (int index = 0; index < scorearray.length; index++) {

            while (true) {
                if (sc.hasNextDouble()) {
                    score = sc.nextDouble();// 录入学生成绩
                    if (score >= 0 && score <= 100) {
                        scorearray[index] = score;
                        break;

                    } else {
                        System.out.println("成绩无效，请重新输入");// 防止不合格数据
                    }

                } else {
                    System.out.println("输入格式错误,请重新输入数字");
                    sc.next();//把烂数据消除掉防止缓存

                }

            }

        }
        sc.close();// 防止非数字数据，放在最外侧循环外面，防止输错一次就关掉导致下一次输入不了

        double PassRate = person(scorearray) / 10.0;// 及格率
        double average = sumscore(scorearray) / 10.0;// 平均分
        System.out.println("及格率是:" + PassRate + "平均分是：" + average + "第一名的分数是:" + max(scorearray));

    }
}

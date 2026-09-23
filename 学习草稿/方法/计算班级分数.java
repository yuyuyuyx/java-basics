package 学习草稿.方法;

import java.util.Scanner;
/*优化方向（待办清单）
【优化方向 1】：统一方法返回值类型（小细节）。

现状：public static double person(...) 返回的是 int。虽然 Java 会自动把 int 提升为 double 不出错，但在设计上，计数通常返回 int 更精确。

修改：改成 public static int getPassCount(...)。

所需知识点：方法的返回值类型。

当前可行性：🟢 现在就能做。

【优化方向 2】：消除硬编码的 10.0。

现状：你写的是 person(scorearray) / 10.0。如果以后班级人数变了，你要改两个地方（数组长度和除法）。

修改：用 scorearray.length 来代替 10.0。

所需知识点：array.length。

当前可行性：🟢 现在就能做。

【优化方向 3】：方法命名专业化。

现状：person、max、sumscore 稍微有点口语化。

修改：参考我们上一问的“英文命名”，改成 getPassCount（及格人数）、getAverage（平均分）、getMaxScore（最高分）。

所需知识点：见名知意。

当前可行性：🟢 现在就能做。

【优化方向 4】：max 循环从索引 1 开始。

现状：你的 max 方法里 for (int index = 0; index < scorearray.length; index++) 从 0 开始。但你初始化时已经取了 scorearray[0] 当最大值。

修改：改成 index = 1 开始，少比较一次，效率略高。

所需知识点：数组边界。

当前可行性：🟢 现在就能做。 */

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
                    sc.next();// 把烂数据消除掉防止缓存

                }

            }

        }
        sc.close();// 防止非数字数据，放在最外侧循环外面，防止输错一次就关掉导致下一次输入不了

        double PassRate = person(scorearray) / 10.0;// 及格率
        double average = sumscore(scorearray) / 10.0;// 平均分
        System.out.println("及格率是:" + PassRate + "平均分是：" + average + "第一名的分数是:" + max(scorearray));

    }
}

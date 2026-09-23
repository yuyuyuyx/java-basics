package 学习草稿.方法;

import java.util.Scanner;

public class 比较面积大小 {
    public static String compareArea(double length1, double width1, double length2, double width2) {

        double result1 = length1 * width1;
        double result2 = length2 * width2;

        if (result1 < result2) {
            return "第二个长方形面积大";

        } else if (result1 > result2) {
            return "第一个长方形面积大";
        } else {
            return "一样大";
        }

    }

    // 返回类型是 double
    public static double getPositiveDouble(Scanner sc, String tip) {
        double num = 0; // 准备装数据的容器

        System.out.println(tip);
        while (true) {
            if (sc.hasNextDouble()) {
                num = sc.nextDouble(); // 读到 num 里
                if (num > 0) {
                    break; // 数据合法，跳出循环，准备返回
                } else {
                    System.out.println("数据必须大于0，请重新输入：");
                }
            } else {
                System.out.println("输入格式错误，请输入数字：");
                sc.next(); // 吃掉错误输入
            }
        }

        return num; // 🌟 核心：把好不容易拿到的合法数据交出去！
    }

    /*
     * ========== 比较面积大小优化方向（待办清单） ==========
     * 
     * //*【难度：🟢 现在就能做】方向1：统一输出文案
     * //*具体做法：把输出语句里的“正方形”全部改成“长方形”。
     * 
     * //TODO(不够独立做出核心）【难度：🟢 现在就能做】方向2：增加输入合法性校验
     * //TODO具体做法：用 while(true) + hasNextDouble() 确保用户输入正数，防止输入字母导致崩溃。
     * 
     * //*【难度：🟡 稍加摸索能做】方向3：封装比较逻辑（视频中可能期望的方案）
     * //*具体做法：写一个 public static String compareArea(double length1, double width1,
     * //*double length2, double width2)，
     * //*把所有计算、比较逻辑打包进方法里，返回比较结果的字符串，main 只负责调用和打印。
     * //*这样 main 方法里将不再有 if-else。
     * 
     * //!【难度：🔴 需要等知识储备足够】方向4：用面向对象（OOP）重构
     * //!具体做法：等学完“面向对象”后，创建一个 Rectangle（矩形）类，用对象封装长、宽，
     * //!再写一个比较方法。这是面向对象编程的经典练习。
     * //!==================================================
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 🌟 每次调用只拿回一个合法的数字！
        double length1 = getPositiveDouble(sc, "请输入第一个长方形的长：");
        double width1 = getPositiveDouble(sc, "请输入第一个长方形的宽：");
        double length2 = getPositiveDouble(sc, "请输入第二个长方形的长：");
        double width2 = getPositiveDouble(sc, "请输入第二个长方形的宽：");

        sc.close(); // 🚨 注意：close 只能写在 main 里，不要写在 getPositiveDouble 里

        System.out.println(compareArea(length1, width1, length2, width2));
    }
}

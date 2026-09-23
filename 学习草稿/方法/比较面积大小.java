package 学习草稿.方法;

import java.util.Scanner;

public class 比较面积大小 {
    public static double area(double length, double width) {
        double area = length * width;
        return area;

    }

    public static void main(String[] args) {
        System.out.println("请给出两个长方形的长宽(先长后宽）：");
        Scanner sc = new Scanner(System.in);
        System.out.println("以下是第一个长方形的几何数据：");
        double length1 = sc.nextDouble();
        double width1 = sc.nextDouble();
        double result1 = area(length1, width1);

        System.out.println("以下是第二个长方形的几何数据：");
        double length2 = sc.nextDouble();
        double width2 = sc.nextDouble();
        double result2 = area(length2, width2);
        if (result1 < result2) {
            System.out.println("第二个长方形面积大");

        }else if(result1 > result2){
            System.out.println("第一个长方形面积大");
        }else{
            System.out.println("一样大");
        }

    }
}
/*/*
 * ========== 比较面积大小优化方向（待办清单） ==========
 * 
 * 【难度：🟢 现在就能做】方向1：统一输出文案
 * 具体做法：把输出语句里的“正方形”全部改成“长方形”。
 * 
 * 【难度：🟢 现在就能做】方向2：增加输入合法性校验
 * 具体做法：用 while(true) + hasNextDouble() 确保用户输入正数，防止输入字母导致崩溃。
 * 
 * 【难度：🟡 稍加摸索能做】方向3：封装比较逻辑（视频中可能期望的方案）
 * 具体做法：写一个 public static String compareArea(double length1, double width1, double length2, double width2)，
 *          把所有计算、比较逻辑打包进方法里，返回比较结果的字符串，main 只负责调用和打印。
 *          这样 main 方法里将不再有 if-else。
 *          
 * 【难度：🔴 需要等知识储备足够】方向4：用面向对象（OOP）重构
 * 具体做法：等学完“面向对象”后，创建一个 Rectangle（矩形）类，用对象封装长、宽，
 *          再写一个比较方法。这是面向对象编程的经典练习。
 * ==================================================
 */ 
package 学习草稿;

import java.util.Scanner;

public class 减肥计划表 {
    public static void main(String[] args) {
        System.out.println("请输入今天星期几(星期天请输入7):");
        Scanner sc = new Scanner(System.in);
        int week = sc.nextInt();
        switch (week) {
            case (1):
                System.out.println("跑步");
                break;
            case (2):
                System.out.println("游泳");
                break;
            case (3):
                System.out.println("慢走");
                break;
            case (4):
                System.out.println("动感单车");
                break;
            case (5):
                System.out.println("拳击");
                break;
            case (6):
                System.out.println("爬山");
                break;

            default://如果输入八8也会触发，一个小bug
                System.out.println("好好吃一顿");
                break;
        }
    }
}

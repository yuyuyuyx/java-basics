package 学习草稿;

import java.util.Scanner;

public class 及格判断 {
    public static void main(String[] args) {
        System.out.println("请输入学生的考试成绩:");
        Scanner sc = new Scanner(System.in);
        double score = sc.nextDouble();
        if (score<60) {
            System.out.println("不通过");
        }else{
            System.out.println("通过");
        }
    }
}


package 学习草稿;

import java.util.Scanner;

public class 根据月份找季节 {
    public static void main(String[] args) {
        System.out.println("请输入合法月份");
        Scanner sc = new Scanner(System.in);
        
        int month;
        while (true) {//一直循环
            if (sc.hasNextInt()) {//判断是不是输入的整数，不是触发else
                month = sc.nextInt();//不用这一句写两遍，是整数才读取
                break;//读完就跳出循环，去干正事（判断季节）
            } else {
                System.out.println("输入错误，请输入整数月份：");
                sc.next();//不是整数时，把错误内容吸收掉，否则循环会一直卡住
            }
        }
        
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;

            default:
                System.out.println("月份不存在");
                break;
        }
    }
}

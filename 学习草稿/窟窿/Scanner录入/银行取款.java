package 学习草稿.窟窿.Scanner录入;

import java.util.Scanner;

public class 银行取款 {
    public static void main(String[] args) {
        System.out.println("请输入提款金额：");
        Scanner sc = new Scanner(System.in);
        while (true) {
            if (sc.hasNextInt()) {// 输入的是整数吗
                int money = sc.nextInt();
                if (money<=0 || money>1000) {
                    System.out.println("没那么多钱，请重新输入：");
                    sc.nextLine();
                  

                    
                }else{
                   
                   System.out.println("这是"+money+"元，请拿好");
                   break;
                }

            }else{
                System.out.println("您的输入无法识别，请重新输入：");
                sc.nextLine();
               

            }
            

        }
       
    }

}

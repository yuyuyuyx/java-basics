package 学习草稿.条件判断与循环.FOR循环.IF与ELES;

import java.util.Scanner;
import java.util.InputMismatchException;//引入一种专门处理输入类型不匹配的异常

public class 充卡赠送 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double money = 0;// 先初始化，防止循环出来用不了
        // 加入一个检测非法输入的程序
        while (true) {// while循环保证可以不停输错重新输入
            try {
                System.out.print("请输入充值金额：");
                money = sc.nextDouble();// 如果输入的是大多数数字
                if (money <= 0) {// 如果输入了<=0的数字
                    System.out.println("输入不合理，请重新输入");
                    sc.next();// 一直输错就一直输入

                } else {
                    break;// 如果输入成功就退出

                }

            } catch (Exception e) {// 如果捕捉到非法输入e
                // (e只是一个名字，随便起)
                // （e指代的就是类型对不上的数据
                System.out.println("输入非法，请重新输入");// 提示重新输入，这句有必要
                sc.next();// 下一次继续输入，如果输错就清除错误输入

            }

        }

        // 以下为充值系统校验
        double balance = 0;
        double IncreaseMoney = 0;
        double gift = 0;

        while (money > 0) {
            if (money <= 499) {
                System.out.println(
                        "充值金额:" + money
                                + "\n赠送金额:" + gift
                                + "\n本次到账:" + balance);
                System.out.println("未达到充值赠送门槛,请问您需要继续充值吗？");
                System.out.println("(输入1代表您同意,输入0代表退出充值)");
                int option = sc.nextInt();// 定义是否要继续充值的选择
                if (option == 1) {
                    System.out.println("请输入金额");
                    IncreaseMoney = sc.nextDouble();// 需要一个变量储存每次增加的充值金额
                    money += IncreaseMoney;

                    if (money >= 500 && money <= 999) {
                        gift += 50;
                        balance = money + gift;// 记录用户当前累计拥有的余额
                        System.out.println("赠送您" + gift);
                        System.out.println(
                                "充值金额:" + IncreaseMoney
                                        + "\n赠送金额:" + gift
                                        + "\n目前总计:" + balance);
                        continue;
                    } else if (money >= 1000 && money <= 2999) {
                        gift += money * 0.1;
                        System.out.println("赠送您" + gift);
                        System.out.println(
                                "充值金额:" + IncreaseMoney
                                        + "\n赠送金额:" + gift
                                        + "\n本次到账:" + balance);
                        continue;

                    } else if (money <= 4999 && money >= 3000) {
                        gift += money * 0.15;
                        System.out.println("赠送您" + gift);
                        System.out.println(
                                "充值金额:" + IncreaseMoney
                                        + "\n赠送金额:" + gift
                                        + "\n本次到账:" + balance);
                        continue;

                    } else if (money > 4999) {
                        gift += money * 0.2;
                        if (gift > 1500) {
                            gift = 1500;

                        }
                        System.out.println("赠送您" + gift);
                        System.out.println(
                                "充值金额:" + IncreaseMoney
                                        + "\n赠送金额:" + gift
                                        + "\n本次到账:" + balance);

                    }
                    continue;

                } else if (option == 0) {
                    break;// 退出判断

            } else if (money >= 500 && money <= 999) {
                    gift += 50;
                    balance = money + gift;// 记录用户当前累计拥有的余额
                    System.out.println("赠送您" + gift);
                    System.out.println(
                            "充值金额:" + IncreaseMoney
                                    + "\n赠送金额:" + gift
                                    + "\n目前总计:" + balance);
                    continue;
            } else if (money >= 1000 && money <= 2999) {
                    gift += money * 0.1;
                    System.out.println("赠送您" + gift);
                    System.out.println(
                            "充值金额:" + IncreaseMoney
                                    + "\n赠送金额:" + gift
                                    + "\n本次到账:" + balance);
                    continue;

            } else if (money <= 4999 && money >= 3000) {
                    gift += money * 0.15;
                    System.out.println("赠送您" + gift);
                    System.out.println(
                            "充值金额:" + IncreaseMoney
                                    + "\n赠送金额:" + gift
                                    + "\n本次到账:" + balance);
                    continue;

            } else if (money > 4999) {
                    gift += money * 0.2;
                    if (gift > 1500) {
                        gift = 1500;

                    }
                    System.out.println("赠送您" + gift);
                    System.out.println(
                            "充值金额:" + IncreaseMoney
                                    + "\n赠送金额:" + gift
                                    + "\n本次到账:" + balance);

                }
                continue;

            }

        }

    }
}

package 学习草稿;

import java.util.Scanner;

public class 优惠券计算 {
    public static void main(String[] args) {
        System.out.println("请输入商品总价：");
        Scanner sc = new Scanner(System.in);
        double price = sc.nextDouble();// 获取价格
        double cardprice = price * 0.8;// 会员卡的折扣额度
        if (price <= 0) {// 避免乱数据
            System.out.println("商品价格有误");
        } else if (price <= 10 && price > 0) {
            double quanprice = price - 8;// 优惠券的减免
            double result = quanprice < cardprice ? quanprice : cardprice;
            if (result <= 0) {
                System.out.println(0);

            } else {
                System.out.println(result);
            }

            // 套模板
        } else if (price <= 50 && price > 10) {
            double quanprice = price - 30;// 优惠券的减免
            double result = quanprice < cardprice ? quanprice : cardprice;
            // 选最省钱的
            if (result <= 0) {
                System.out.println(0);

            } else {
                System.out.println(result);
            }
        } else if (price <= 100 && price > 50) {
            double quanprice = price - 50;// 优惠券的减免
            double result = quanprice < cardprice ? quanprice : cardprice;
            if (result <= 0) {
                System.out.println(0);

            } else {
                System.out.println(result);
            }

        } else if (price <= 200 && price > 100) {
            double quanprice = price - 90;// 优惠券的减免
            double result = quanprice < cardprice ? quanprice : cardprice;
            if (result <= 0) {
                System.out.println(0);

            } else {
                System.out.println(result);
            }

        } else {
            double result = price * 0.6;

            System.out.println(result);

        }
    }
}
//更好的版本
/*package 学习草稿;

import java.util.Scanner;

public class 优惠券计算 {
    public static void main(String[] args) {
        System.out.println("请输入商品总价：");
        Scanner sc = new Scanner(System.in);
        double price = sc.nextDouble();
        double cardPrice = price * 0.8;
        
        if (price <= 0) {
            System.out.println("商品价格有误");
        } else {
            // 1. 声明一个变量，用来存最后的底价，默认是原价
            double finalPrice = price; 
            
            // 2. 只计算，不打印
            if (price <= 10) {
                finalPrice = price - 8;
            } else if (price <= 50) {
                finalPrice = price - 30;
            } else if (price <= 100) {
                finalPrice = price - 50;
            } else if (price <= 200) {
                finalPrice = price - 90;
            } else {
                finalPrice = price * 0.6;
            }
            
            // 3. 选出最便宜的（比对优惠券和会员卡）
            double result = finalPrice < cardPrice ? finalPrice : cardPrice;
            
            // 4. 统一兜底和打印（只写一次！）
            if (result <= 0) {
                System.out.println(0);
            } else {
                System.out.println(result);
            }
        }
        sc.close();
    }
} */
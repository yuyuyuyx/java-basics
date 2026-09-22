package 学习草稿.条件判断与循环.FOR循环;

import java.util.Scanner;

public class 优惠券计算 {
    public static double calculatePrice(double price) {
        // 这里写打折和比价的逻辑，返回最终价格
        // 1. 定义查表结构：[价格上限, 减免金额]
        double[][] coupons = {//数组横行竖列
                { 10, 8 },
                { 50, 30 },
                { 100, 50 },
                { 200, 90 }
        };

        double couponPrice = price; // 默认券后价就是原价  

        // 2. 遍历这张表
        for (int i = 0; i < coupons.length; i++) {
            //i < coupons.length就是查询数组的第几组元素
            double limit = coupons[i][0]; // 拿到这档的价格上限
            double discount = coupons[i][1]; // 拿到这档的减免金额
            //可以选定数字来固定数组的一部分内容

            if (price <= limit) {
                couponPrice = price - discount; // 匹配到了，算出券后价
                break; // 🚀 关键：一旦匹配到，立刻跳出循环，不再看后面的表格！
            }
        }

        // 3. 兜底：如果循环跑完了都没匹配到（price > 200）
        if (couponPrice == price) {
            couponPrice = price * 0.6;
        }
        return couponPrice; // 🌟 核心修复：把最终结果返回出去！

    }

    public static void main(String[] args) {
        System.out.println("请输入商品总价：");
        Scanner sc = new Scanner(System.in);
        double price = sc.nextDouble();// 获取价格
        

        double finalPrice = calculatePrice(price);
        System.out.println("最终价格为：" + finalPrice);
        sc.close();

    }
}

// 更好的版本
/*
 * package 学习草稿;
 * 
 * import java.util.Scanner;
 * 
 * public class 优惠券计算 {
 * public static void main(String[] args) {
 * System.out.println("请输入商品总价：");
 * Scanner sc = new Scanner(System.in);
 * double price = sc.nextDouble();
 * double cardPrice = price * 0.8;
 * 
 * if (price <= 0) {
 * System.out.println("商品价格有误");
 * } else {
 * // 1. 声明一个变量，用来存最后的底价，默认是原价
 * double finalPrice = price;
 * 
 * // 2. 只计算，不打印
 * if (price <= 10) {
 * finalPrice = price - 8;
 * } else if (price <= 50) {
 * finalPrice = price - 30;
 * } else if (price <= 100) {
 * finalPrice = price - 50;
 * } else if (price <= 200) {
 * finalPrice = price - 90;
 * } else {
 * finalPrice = price * 0.6;
 * }
 * 
 * // 3. 选出最便宜的（比对优惠券和会员卡）
 * double result = finalPrice < cardPrice ? finalPrice : cardPrice;
 * 
 * // 4. 统一兜底和打印（只写一次！）
 * if (result <= 0) {
 * System.out.println(0);
 * } else {
 * System.out.println(result);
 * }
 * }
 * sc.close();
 * }
 * }
 */
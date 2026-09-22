package 学习草稿.条件判断与循环.IF与ELES;

import java.util.Scanner;

public class 充卡赠送 {
    public static void main(String[] args) {
        System.out.print("请输入充值金额：");
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        int gift = 0;

        if (money < 1000) {
            System.out.println("未达到充值赠送门槛");
        } else {
            // 第一层：先判断大阶梯
            if (money >= 2000) {
                // 充了2000以上：2000的基数送500（假设），超出的部分按30%算
                gift = 500 + (int)((money - 2000) * 0.3);
            } else {
                // 1000到1999之间：1000的基数送200，超出的部分按25%算
                gift = 200 + (int)((money - 1000) * 0.25);
            }
            
            int balance = money + gift;
            System.out.println("充值成功！赠送金额：" + gift + " 元，卡里余额：" + balance + " 元");
        }
        sc.close();
    }
}
/*更高级的写法
// 未来的写法：把规则存进数组（表驱动）
int[] 阈值 = {1000, 2000, 5000, 10000, 20000, 50000};
int[] 赠送 = {200, 500, 1300, 2500, 6000, 15000};

for (int i = 阈值.length - 1; i >= 0; i--) {
    if (money >= 阈值[i]) {
        gift = 赠送[i];
        break; // 找到了就退出循环
    }
}
// 如果产品经理改了规则，只要改数组里的数字，逻辑代码一行都不用动！ */
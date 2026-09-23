package 学习草稿.方法;

import java.util.Scanner;
/*优化方向（待办清单）
【优化方向 1】：修正 Math.ceil 与 if-else 的逻辑（见上面代码）。

所需知识点：Math.ceil()、if-else if-else 优先级。

当前可行性：🟢 现在就能做。

【优化方向 2】：修复输入校验中的 hasNextDouble() 和 sc.next() 配合。

所需知识点：Scanner 防缓存机制（你昨天刚学过的）。

当前可行性：🟢 现在就能做。

【优化方向 3】：将方法名 price 改为 calculatePrice。

现状：方法名和局部变量名都是 price，容易混淆。

所需知识点：命名规范。

当前可行性：🟢 现在就能做。

【优化方向 4】：解决阶梯计价的“分段累加”问题（进阶思考）。

现状：你现在的写法是 10 + exceed * 1.5，意味着超出的重量全部按 1.5 元/kg 算。

真实业务：真实快递通常是分段计价，比如前 5kg 按 2 元/kg，超出部分才按 1.5 元/kg。

所需知识点：数学逻辑拆解。

当前可行性：🟡 稍加摸索能做（你可以思考一下如果要求分段计价，代码该怎么改）。 */

public class 计算快递邮费 {
    public static double price(double weightfinall) {// 把重量传进去算
        double exceed = weightfinall - 1;
        double price = 0;// 需要事先定义，不然return传不出去
        if (exceed < 0) {
            exceed = 1;
            price = 10;

        } else if (exceed == 0) {
            price = 10;
        } else if (exceed <= 5 && exceed >= 1) {
            price = 10 + exceed * 2;

        } else if (exceed > 5) {
            price = 10 + exceed * 1.5;
        }

        return price;

    }

    public static void main(String[] args) {
        System.out.println("请输入快递重量:");
        Scanner sc = new Scanner(System.in);
        double weightfinall = 0;// 也是需要事先定义好

        while (true) {
            System.out.println("请输入快递重量:");
            if (sc.hasNextDouble()) { // 检查是不是数字
                double weight = sc.nextDouble();
                if (weight > 0) { // 题目要求必须大于0
                    weightfinall = weight;
                    break;
                } else {
                    System.out.println("重量必须大于0，请重新输入:");
                }
            } else {
                System.out.println("输入格式错误，请输入数字:");
                sc.next(); // 吃掉非数字的错误输入
            }
        }

        System.out.println("价格为:" + price(weightfinall));

    }
}

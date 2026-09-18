package 学习草稿;

public class 逢七过 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            // 1. 每次循环前，重置标志位（默认不包含7，也不是7的倍数）
            boolean isPass = false;/*
                                    * ispass：是否跳过，先假设全都不跳过，也就是全都是目标数字
                                    */

            // 2. 判断是不是 7 的倍数
            if (i % 7 == 0) {
                isPass = true;// 可以跳过了
            }

            // 3. 拆位判断是否包含 7（处理有7但不是7的倍数的数字）
            int temp = i; // 借用临时变量（temp）拆位，保护 i 不被改变，也用来储存每次更新的i

            // 如果不用temp，在第24行代码处i就变成了乱数字，没法正常处理
            while (temp > 0) {
                int digit = temp % 10;// dight（当前位数）
                if (digit == 7) {
                    isPass = true;
                    break; // 找到 7 了，不用继续拆了
                }
                temp /= 10;// 每个数位都要看一遍，防止其他位置的7顾不上
            }

            // 4. 根据标志位宣判
            if (isPass) {
                System.out.println("过");// 对应前面的跳过
            } else {
                System.out.println(i);// 反之则不过
            }
        }
    }
}
/*
 * continue版本

 * for (int i = 1; i <= 100; i++) {
 * // 1. 先拦截“7的倍数”
 * if (i % 7 == 0) {
 * System.out.println("过");
 * continue; // 跳过下面拆位逻辑，直接进入下一轮
 * }
 * 
 * // 2. 拆位判断是否包含 7
 * int temp = i; // 借用替身拆位
 * boolean hasSeven = false;
 * while (temp > 0) {
 * if (temp % 10 == 7) {
 * hasSeven = true;
 * break;
 * }
 * temp /= 10;
 * }
 * 
 * // 3. 如果包含 7，也拦截
 * if (hasSeven) {
 * System.out.println("过");
 * continue; // 跳过打印原数字
 * }
 * 
 * // 4. 经历了上面的层层关卡，剩下的都是普通数字
 * System.out.println(i);
 * }
 */
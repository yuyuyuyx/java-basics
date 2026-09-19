package 学习草稿;

import java.util.Scanner;

public class 判断整数是不是质数 {
    public static void main(String[] args) {
        System.out.println("请输入一个大于等于2的整数");
        Scanner sc = new Scanner(System.in);
        int znum = sc.nextInt();
        boolean isPrime = true;// 假设所有输入的全是质数
        for (int i = 2; i <= znum - 1; i++) {
            // 4. 核心逻辑：只要发现能整除，就是合数
            if (znum % i == 0) {
                isPrime = false; // 推翻“质数”的假设
                break; // 找到质数了，立刻跳出循环，不用再试了
            }
        }
        if (isPrime) {// 逻辑与前面独立
            System.out.println(znum + " 是质数");
        } else {
            System.out.println(znum + " 不是质数");
        }
    }
}
/*
 * 思路
 * 把你要判断的数字 n 想象成一个嫌疑人：
 * 
 * 默认假设：一开始我们先假设它是好人（是质数）。
 * 
 * 寻找证据：从 2 开始，一直找到 n-1，看看能不能找到“同伙”（能整除它的数）。
 * 
 * 一票否决：只要在循环里找到任何一个能整除它的数（n % i == 0），它就立刻被判定为“坏人”（合数）。一旦定罪，立刻 break 退出，不再继续审问。
 * 
 * 最终宣判：如果从头到尾都没找到能整除它的数，那它成功洗清嫌疑，确认是质数。
 * 
 * 核心口诀：默认是好人（isPrime = true），找到坏人立刻推翻（isPrime = false），最后看结论。
 */


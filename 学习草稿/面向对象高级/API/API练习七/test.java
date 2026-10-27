package 学习草稿.面向对象高级.API.API练习七;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        for (int index = 0; index < arr.length; index++) {
            if (index == 0) {//打一个开头
                System.out.print("[" + arr[index]);
            } else {//打中间，不要换行
                System.out.print("," + arr[index]);
            }
        }//循环之外补一个尾巴就行
        System.out.println("]"); // 循环结束后补收尾，顺便换行

    }

}

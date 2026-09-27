package 学习草稿.窟窿.方法的参数传递;

import java.util.Arrays;

public class 交换两个变量的值 {
    public static void addOne(int[] arr) {
        for (int index = 0; index < arr.length; index++) {
            arr[index]+=1;

        }
        
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        addOne(nums);
        System.out.println(Arrays.toString(nums));
    }
}

package 学习草稿;

import java.util.Arrays;

public class 合并有序数组 {
    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 5, 7, 9 };
        int[] arr2 = { 2, 4, 6, 8, 10 };
        int[] arr3 = new int[10];
        int i = 0; // arr1的指针
        int j = 0; // arr2的指针
        int k = 0; // arr3的指针

        // 1. 两个都有序，同时遍历
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                arr3[k] = arr1[i];
                i++;
            } else {
                arr3[k] = arr2[j];
                j++;
            }
            k++; // k 每次都要后移
        }

        // 2. 收尾：如果 arr1 还有剩，全扔进 arr3
        /*while (i < arr1.length) {
            arr3[k++] = arr1[i++];
        }

        // 3. 收尾：如果 arr2 还有剩，全扔进 arr3
        while (j < arr2.length) {
            arr3[k++] = arr2[j++];
        }*/

        // 4. 打印 arr3
        System.out.println(Arrays.toString(arr3));

    }
}

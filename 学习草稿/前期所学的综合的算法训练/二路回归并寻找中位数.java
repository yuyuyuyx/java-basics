package 学习草稿.前期所学的综合的算法训练;

import java.util.Arrays;

public class 二路回归并寻找中位数 {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5 };
        int arr2[] = { 6, 7, 8, 9 };
        int arr3[] = new int[arr1.length + arr2.length];// 新数组
        int a3 = 0, a2 = 0, a1 = 0;// 三指针
        // 1. 双方都还没空的时候，比大小
        while (a1 < arr1.length && a2 < arr2.length) {
            if (arr1[a1] <= arr2[a2]) {
                arr3[a3] = arr1[a1];
                a1++;
            } else {
                arr3[a3] = arr2[a2];
                a2++;
            }
            a3++; // 无论谁被放进 arr3，a3 都要往前挪一格
        }

        // 2. 收尾：如果是 arr1 先空了
        while (a1 < arr1.length) {
            arr3[a3] = arr1[a1];
            a1++;
            a3++;
        }

        // 3. 收尾：如果是 arr2 先空了
        while (a2 < arr2.length) {
            arr3[a3] = arr2[a2];
            a2++;
            a3++;//填充完最后一个元素的时候，a3等于8，再++变成9
        }
        System.out.println(Arrays.toString(arr3));
        if (a3 % 2 == 0) {// 由于从0开始，最大序列为奇数的元素数量为偶数，所以这是偶数元素数量数组
            double midnumber = arr3[a3 / 2];
            System.out.println(midnumber);

        } else {
            double midnumber = (arr3[(a3 / 2 )- 1] + arr3[a3 / 2]) / 2.0;
            System.out.println(midnumber);

        }

    }
}

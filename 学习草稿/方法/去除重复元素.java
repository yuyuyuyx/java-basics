package 学习草稿.方法;

import java.util.Arrays;
import java.util.Random;

public class 去除重复元素 {
    // 返回值是 int，代表去重后的新长度
public static int removeDuplicates(int[] array) {
    if (array.length == 0) return 0; // 防御性判空
    
    int slow = 0; // 慢指针
    for (int fast = 1; fast < array.length; fast++) {
        if (array[fast] != array[slow]) {
            slow++; // 先自增
            array[slow] = array[fast]; // 把新元素搬过来
        }
    }
    return slow + 1; // 长度 = 最后一个有效索引 + 1
}

    public static void main(String[] args) {
    // 准备一个有序且包含重复元素的数组
    int[] array = { 1, 1, 2, 2, 3, 3, 3 }; // 长度7，去重后有效长度为3
    
    // 调用方法，接收新长度
    int newLength = removeDuplicates(array);
    System.out.println("去重后的有效长度: " + newLength);
    
    // 只打印有效的部分
    for (int i = 0; i < newLength; i++) {
        System.out.print(array[i] + " ");
    }
    System.out.println();
}
}

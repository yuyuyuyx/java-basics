package 第一阶段.API.API练习十五;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两串数字字符");
        System.out.println("数字串1:");
        String numbeString1 = sc.next();
        System.out.println("数字串2:");
        String numbeString2 = sc.next();

        // 先确定数组长度，以长的为准
        int len = numbeString1.length() >= numbeString2.length() ? numbeString1.length() : numbeString2.length();

        // 调用方法（把两个字符串都转成数组）
        int[] arr1 = stringToArray(numbeString1, len);
        int[] arr2 = stringToArray(numbeString2, len);

        System.out.println("数字串1的数组：" + java.util.Arrays.toString(arr1));
        System.out.println("数字串2的数组：" + java.util.Arrays.toString(arr2));
    }

    // 方法要放在外面！和 main 平级！
    public static int[] stringToArray(String str, int len) {
        // new 数组必须指定长度，这里以传入的 len 为准
        int[] arr = new int[len];

        // 把字符串中的数据放到数组
        for (int index = 0; index < str.length(); index++) {
            // 注意这里是 index，不是 len！获取当前索引的字符
            char c = str.charAt(index);
            // 将字符转为数字（'0' 就是 48，比写 48 更直观）
            int num = c - '0';
            // 把转换好的数字存进数组（这里需要你思考：如果字符串长度不够 len，要不要从后面往前放？）
            arr[index] = num;
        }
        // 必须有返回值
        return arr;
    }
}
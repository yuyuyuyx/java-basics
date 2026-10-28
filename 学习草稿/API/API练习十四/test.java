package 学习草稿.API.API练习十四;

import java.util.Arrays;
import java.util.Random;

public class test {
    public static void main(String[] args) {
        String str = "568895";
        // 把它变成字符数组
        char[] array = str.toCharArray();
        // 利用随机数生成来打乱顺序
        Random r = new Random();// 先写一个随机数格式

        for (int index = 0; index < array.length; index++) {// 开始遍历
            int number = r.nextInt(array.length);// 在数组长度范围内随机生成一个数字
            char temp = array[index];// 先把数组中的字符按照索引先生成
            array[index] = array[number];
            array[number] = temp;
            // 把数组元素打乱重新赋值
            // 中间变量交换
            //中间变量交换不牢固

        }
        String result = new String(array);
        System.out.println(result);

    }
}

package 学习草稿.窟窿.随机数和洗牌法;

import java.util.Arrays;
import java.util.Random;

public class 洗牌法版本的大乐透机制 {
    public static void main(String[] args) {
        int data[] = new int[35];// 一个数组装数字
        for (int i = 1; i <= 35; i++) {// 先造出来1-35\
            data[i - 1] = i;// 先把数字放到数组里面

        }
        System.out.println(Arrays.toString(data));
        Random r = new Random();
        int temp;// 设置一个中间变量，这里数值可以任意换,不赋值每次都是新的

        for (int index = 0; index < data.length; index++) {// 打乱数组顺序
            // 用随机数生成索引来打乱数组顺序

            int k = index + r.nextInt(data.length - index);// 随机生成1-35的数字索引，左闭右开，可以取34,取35数组溢出
            temp = data[k];// 要换的先给中间变量，这时候不需要它在原来的位置了
            data[k] = data[index];// 把空出来的位置换上被换的，这时候目标位置就空出来了
            data[index] = temp;// 由于中间变量携带的是要换的，所以把它放到目标位置上就行
        }
        int result[] = Arrays.copyOf(data, 5);
        System.out.println(Arrays.toString(result));
    }
}

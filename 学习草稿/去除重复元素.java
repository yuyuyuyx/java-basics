package 学习草稿;

import java.util.Arrays;
import java.util.Random;

public class 去除重复元素 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random r = new Random();
        int index;// 解决20行的问题————提前定义，然后循环里面避免重复定义

        for (index = 0; index < array.length; index++) {
            // 你要填第 i 个格子，需要保证它和前面 0 ~ i-1 的数字都不同
            while (true) {
                int newNum = r.nextInt(100) + 1; // 生成 1~100 的随机数
                boolean isDuplicate = false; // 假设没重复

                // 安检开始：只检查前面已经存好的数字！
                for (int j = 0; j < index; j++) {
                    if (array[j] == newNum) {
                        isDuplicate = true; // 发现重复了
                        break; // 立刻停止安检，去重新生成
                    }
                }

                // 决定是否放行
                if (!isDuplicate) {
                    array[index] = newNum; // 没重复，放进格子
                    break; // 跳出 while，去填下一个格子
                }
            }

        }
    }
}

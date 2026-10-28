package 学习草稿.API.API练习十三;

import java.util.ArrayList;
import java.util.List;

public class SplitBy8 {
    public static void main(String[] args) {
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; // 一共 26 个字符

        // 用来装切好的每一段
        List<String> result = new ArrayList<>();

        // i 每次加 8，代表每一段的起点
        for (int i = 0; i < str.length(); i += 8) {
            // 计算终点。如果剩下的字符不够8个，终点就是字符串的末尾
            int end = Math.min(i + 8, str.length());

            // 截取从 i 到 end 的字符串（注意：包左不包右）
            String chunk = str.substring(i, end);
            result.add(chunk);
        }

        // 打印结果
        System.out.print(result);
        System.out.println();
        // 输出：[ABCDEFGH, IJKLMNOP, QRSTUVWX, YZ]
    }
}

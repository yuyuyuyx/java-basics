package 学习草稿.面向对象高级.API.API练习九;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // 敏感词屏蔽
        String words = "123456司马了";
        System.out.println(words.replace("司马了", "***"));
        // 可以加一个识别程序，自动根据不同情况因地制宜地修改
        // 1.定义一个敏感词库‘
        String dirty[] = {
                "智障", "脑残", "垃圾",
                "废物", "sb", "nc",
                "傻狗", "草泥马", "滚" };
        Scanner sc = new Scanner(System.in);
        String fuck = sc.next();
        // 检测内容是否与词库匹配
        for (int index = 0; index < dirty.length; index++) {
            // 接收脏话

            // 思路：直接把句子中的脏字换掉就行，不需要额外加检测

            fuck = fuck.replace(dirty[index], "***");
            // 靠词语识别容易钻空子，需要按字读+语义理解+语种识别。。。才行
            // 根据字数来确定*数量，不能固定三个

        }
        System.out.println(fuck);
        String word = "a b c ";
        System.out.println(word.trim());

    }
}

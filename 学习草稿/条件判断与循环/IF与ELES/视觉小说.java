package 学习草稿.条件判断与循环.IF与ELES;

import java.util.Scanner;

public class 视觉小说 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("你遇到了一个神秘人，你要怎么做？");
System.out.println("1. 拔剑 2. 逃跑 3. 微笑");
int choice = sc.nextInt();

if (choice == 1) {
    System.out.println("你拔出了剑，神秘人后退了一步...");
    // 这里就是你说的“联系立绘和配音”
    // playSound("剑出鞘.mp3");
    // showImage("拔剑立绘.jpg");
    // affection -= 10; // 好感度降低
} else if (choice == 2) {
    System.out.println("你转身就跑，但被石头绊倒了...");
    // playSound("摔跤.mp3");
    // showImage("逃跑立绘.jpg");
} else if (choice == 3) {
    System.out.println("你微微一笑，神秘人似乎放松了警惕...");
    // playSound("轻笑.mp3");
    // showImage("微笑立绘.jpg");
    // affection += 10; // 好感度增加
} else {
    System.out.println("输入错误，请重新选择。");
}
    }
}

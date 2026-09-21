package 学习草稿;

import java.util.Scanner;

public class 数组动态初始化 {
    public static void main(String[] args) {
        /*
         * 优化方向（待办清单）
         * 【优化方向 1】：分离“录入”与“输出”逻辑（核心业务逻辑修正）
         * 
         * 当前现象：你的代码在第 16 行 System.out.println(array[i]);，属于边录边打。用户输入第 1 个数，程序立刻打印；再输入第
         * 2 个数，再打印……完全没有体现“批量存储”的感觉。
         * 
         * 所需知识点：数组遍历、for 循环、array.length。
         * 
         * 当前可行性：🟢 现在就能做。
         * 
         * 具体做法：把打印的代码从第一个 for 循环里删掉。在这个循环结束后，新写一个 for 循环，专门用来打印整个数组。
         * 
         * 【优化方向 2】：让提示语动态化（提升用户体验）
         * 
         * 当前现象：你代码里写死了一句
         * System.out.println("请输入五个整数：");。用户输完第一个，界面上又出现“请输入五个整数：”，让人一脸懵。
         * 
         * 所需知识点：字符串拼接、for 循环变量 i 的使用。
         * 
         * 当前可行性：🟢 现在就能做。
         * 
         * 具体做法：把提示语改成 System.out.println("请输入第 " + (i + 1) + " 个整数：");。
         * 
         * 【优化方向 3】：输入合法性校验（防御性编程）
         * 
         * 当前现象：如果用户手滑输入了字母 a，程序会在 sc.nextInt() 处直接崩溃抛出异常。
         * 
         * 所需知识点：sc.hasNextInt()、while(true) 循环、continue/break 控制流。
         * 
         * 当前可行性：🟢 现在就能做（你之前已经熟练掌握这套防呆校验了）。
         * 
         */
        int[] array = new int[5];
        Scanner sc = new Scanner(System.in);
        // 防止每次录入的数据因为循环而丢失，所以把它放外边

        for (int i = 0; i < array.length; i++) {
            System.out.println("请输入五个整数：");
            // 录入记得在循环里面录入，不然只能录入一堆初始值
            int num = sc.nextInt();
            array[i] = num;// 给数组里面装元素
            System.out.println(array[i]);

        }
        sc.close();
    }
}

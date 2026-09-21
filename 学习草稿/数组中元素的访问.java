package 学习草稿;

/*
 * ========== 数组元素访问与修改（待办清单） ==========
 * 
 * 【难度：🟢 现在就能做】方向1：规范数组声明与命名
 * 所需知识点：Java 数组声明规范、变量命名规范
 * 具体做法：把 int array[] 改成 int[] numbers，把变量名改成有意义的名字（比如 scores、ages）。
 * 
 * 【难度：🟢 现在就能做】方向2：用循环遍历打印数组的所有元素
 * 所需知识点：array.length 属性、array[i] 下标访问、for 循环
 * 具体做法：用 for (int i = 0; i < numbers.length; i++) 配合 System.out.println(numbers[i]) 把 10、20、30 全部打印出来。
 * 
 * 【难度：🟢 现在就能做】方向3：故意访问越界下标，观察报错
 * 所需知识点：数组越界异常（ArrayIndexOutOfBoundsException）
 * 具体做法：尝试访问 numbers[3]，看看控制台会报什么错。
 * 
 * 【难度：🟡 稍加摸索能做】方向4：实现数组元素的“批量化”修改
 * 所需知识点：数组遍历 + 赋值
 * 具体做法：用循环把数组里的每个元素都乘以 2，然后再用循环遍历打印出来。
 * ==================================================
 */

public class 数组中元素的访问 {
    public static void main(String[] args) {
        // 数组中元素的访问
        int array[] = { 10, 20, 30 }; // 生成一个数组
        // 开始访问
        System.out.println(array[0]);
        // 修改元素
        array[0] = 56;
        System.out.println(array[0]);
    }
}
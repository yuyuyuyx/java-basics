package 学习草稿.面向对象进阶.static关键字.array;

public class arrayutill {
    private arrayutill() {// 构造一个私有化方法，不让外界自己创建对象

    }

    // 定义方法
    public static void printarr(int[] array) {// 用于遍历数组的方法
        System.out.print("[");// 把第一个"["打印出来
        for (int index = 0; index < array.length; index++) {
            // 遍历数组需要把数据和形式都得复刻
            if (index == array.length - 1) {
                System.out.println(array[index] + "]");
                // 打印到最后一个元素时，顺便把]复刻下来
                // 此处必须换行，不然看不见数组

            } else {
                System.out.print(array[index] + ",");
                // 其他元素顺便把","复刻下来
            }

        }

    }
    // 返回值类型（double）：只负责规定方法输出什么类型，不管你输入什么。
    // 参数类型（int[]）：只负责规定方法接收什么类型，跟返回值无关。
    // 方法内部把整数数据处理成了double数据
    // 以上三者共同决定double方法里面传入整数数组不报错

    public static double getAverage(int[] array) {// 算平均值先把数组传进来

        int sum = 0;// 储存数组元素和
        for (int index = 0; index < array.length; index++) {
            sum += array[index];

        }
        double Average = sum * 1.0 / array.length;
        // sum*1.0可以把整数和转化为浮点数类型，避免数据类型冲突
        return Average;
    }

}

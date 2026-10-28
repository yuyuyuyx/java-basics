package 第一阶段.API.API练习十一;

public class test {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 6, 7 };
        StringBuffer sB = new StringBuffer();
        // 先打印数组左框
        sB.append("[");
        for (int index = 0; index < arr.length; index++) {

            sB.append(arr[index]);
            if (index != arr.length - 1) {
                sB.append(",");// 最后一个元素不加，

            }

        }
        sB.append("]");// 补足右框
        System.out.println(sB);

    }
}

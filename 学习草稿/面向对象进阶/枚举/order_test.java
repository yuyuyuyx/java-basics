package 学习草稿.面向对象进阶.枚举;

public class order_test {
    public static void main(String[] args) {
        // 使用：枚举类名+枚举项

        order one = order.CANCELLED;
        System.out.println(one.getname());//不加get直接是cancelled
        //匹配用switch，因为选项是固定的
        switch (one) {
            case  UNPAID->System.out.println("待支付");
        //以此类推，只要更新one的值，就能打印出不同状态，
        // one相当于一个模板，可以填入全部枚举项创建好几种状态
            
        }

    }
}

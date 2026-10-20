package 学习草稿.面向对象进阶.枚举.注意事项测试;

import 学习草稿.面向对象进阶.枚举.电商.order;

public class test {
    public static void main(String[] args) {
        /*
         * 每个枚举项都是枚举类的对象,每个对象都是构造方法创造的
         * 2.枚举项底层为常量，默认为public static final修饰
         * 2.1最后的三个关键字不需要写，机器自己加 *
         * 枚举类上一项必须是同类，之间用，隔开，以；结尾
         * 构造方法必须private修饰，这样可以不让外界随意修改
         * 编辑器默认给枚举类两个方法：values(),valueof()
         */
        order two = order.DELIVERED;
        System.out.println(two.getname());

        order three = order.valueOf("PROCESSING");
        //这个和上面的two等效
        System.out.println(three);

    }
}

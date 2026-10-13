package 学习草稿.面向对象.dog;

public class dog_test {// 定义一个类,用来记录不同狗的个体数据
    public static void main(String[] args) {
        // 创建对象(编号为1的狗)并记录个体数据
        dog one = new dog();
        one.name = "小白";
        one.setAge(-1);
        one.color = "red";
        one.weight = 3;
        // 展现one的信息,正常打印即可
        System.out.println("名字:" + one.name);
        System.out.println("年龄:" + one.getAge());

        System.out.println("颜色:" + one.color);
        System.out.println("体重:" + one.weight + "千克");
        one.eat();

        // 其它个体同模板即可

    }
}

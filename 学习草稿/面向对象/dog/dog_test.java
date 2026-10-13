package 学习草稿.面向对象.dog;


public class dog_test {// 定义一个类,用来记录不同狗的个体数据
    public static void main(String[] args) {
        // 创建对象(编号为1的狗)并记录个体数据
        dog one = new dog();
        one.name = "过去";
        one.age = 13;
        one.color = "red";
        one.weight = 3;
        //展现one的信息,正常打印即可
        System.out.println(one.name);

        //其它个体同模板即可

    }
}

package 第一阶段.面向对象高级.内部类.内部类练习一;

public class car {// 外部类
    // 练习内部类书写
    private String brand, color;
    private int age;

     class engine {// 成员内部类
        // 被private修饰成私有类，外部test文件访不了，想访问只能在内部类创建对象
        private String enginebrand;
        private int engineage;

    }

    public engine getinstance() {
        return new engine();

    }

}
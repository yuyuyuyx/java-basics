package 学习草稿.面向对象基础.学生;

public class 学生 {
    private String name;
    private int age;
    private String gender;
    private double height;

    // 构造方法
    public 学生() {// 汉字也可以写入程序
        // 空参调用
        // System.out.println("空参被调用");
        // 空参一般为空白

    }

    public 学生(String name, int age, String gender, double height) {
        // 全参数
        System.out.println("全参数调用");
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.gender);
        System.out.println(this.height);

    }

}

package 学习草稿.对象;

public class 类和对象 {
    public static void main(String[] args) {
        // 狗子档案系统
        // 学生档案系统
        // 手机品牌统计
        phone A = new phone();
        A.brand = "vivo";
        A.color = "red";
        A.price = 3200;
        System.out.println(A.brand);
        System.out.println(A.color);
    }

    public static class dog {
        String name;// 名字
        double age;// 年龄
        double weight;// 体重
        String color;// 毛发颜色

    }

    public static class student {
        String name;// 名字
        double age;// 年龄
        double height;// 身高
        String gender;// 性别

    }

    public static class phone {
        String brand;// 品牌
        String color;// 颜色
        double price;// 价格
    }
}

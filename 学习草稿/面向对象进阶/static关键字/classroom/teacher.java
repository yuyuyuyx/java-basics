package 学习草稿.面向对象进阶.static关键字.classroom;

public class teacher {
    private static String teacher = "阿伟";// 共享变量
    // 换老师方法(本质为set)
    // private还是要写，阻止滥写数据的功能还在

    public static void changeteacher(String teacher_name) {
        teacher = teacher_name;
        // 静态变量不用this，用类名限定
        // 这里不能让形参和成员变量重名，需要重新给形参命名

    }

    public static String getteacher() {
        return teacher;//此处get起到应用老师的方法
    }

}

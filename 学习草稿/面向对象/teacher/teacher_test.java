package 学习草稿.面向对象.teacher;

public class teacher_test {
    public static void main(String[] args) {// 测试文件要写main
        teacher one = new teacher();
        one.name = "李老师";
        one.age = 23;
        // 以下为调用方法,不用写打印
        one.eat();

        one.teach();
        one.sleep();

    }

};

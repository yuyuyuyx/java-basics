package 学习草稿.面向对象高级.继承.构造方法练习三;

public class major_course_instructor extends teacher {
    @Override
    public void teach() {
        System.out.println("正在教授专业课知识");
    }

    public major_course_instructor() {
        super();
    }

    public major_course_instructor(String name, int age) {
        super(name, age);

    }
}

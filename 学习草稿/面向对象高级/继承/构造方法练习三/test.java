package 学习草稿.面向对象高级.继承.构造方法练习三;

public class test {
    public static void main(String[] args) {
        // 设定一个本科学生
        undergraduate student1 =new undergraduate("张三", 18, null);
        System.out.println(student1.getname()+"\n"+student1.getage()+"\n"+student1.getgrade());
        System.out.print("目前");
        student1.study();
        //设定空参和全参可以缩短代码量,还可以设置默认值
        // 设定一个研究生
        postgraduate_student student2 =new postgraduate_student("李四", 25, null);
        System.out.println(student2.getname()+"\n"+student2.getage()+"\n"+student2.getgrade());
        System.out.print("目前");
        student2.study();
        student2.sleep();
        major_course_instructor teacher1 =new major_course_instructor("寻老师", 31);
        System.out.println(teacher1.getname()+"\n"+teacher1.getage());
        teacher1.teach();
        general_education_instructor teacher2 =new general_education_instructor("王老师", 32);
        System.out.println(teacher2.getname()+"\n"+teacher2.getage());
        teacher2.teach();
        

    }
}

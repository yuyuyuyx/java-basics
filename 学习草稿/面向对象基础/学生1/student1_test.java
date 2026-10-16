package 学习草稿.面向对象基础.学生1;

public class student1_test {
    public static void main(String[] args) {
        student1 s = new student1();// 这是用空参制定对象
        // set是用来给变量赋值的
        s.setname("张三");
        System.out.println(s.getname());// get负责打印
        s.setage(18);
        System.out.println(s.getage());
        // 调用行为
        s.study();
        s.eat();
        s.sleep();
        // 以下为用全参制定对象
        student1 ss = new student1("岳麓", 19);
        //s.setage(20);//全参赋值后再次赋值不认
        System.out.println(ss.getname());
        System.out.println(ss.getage());
        ss.study();
        ss.eat();
        ss.sleep();
    }
}

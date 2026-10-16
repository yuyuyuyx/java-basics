package 学习草稿.面向对象进阶.static关键字.classroom;

public class classroom {
    public static void main(String[] args) {
        
        student one = new student();
        one.setname("小诗诗");
        one.setage(19);
        System.out.println(one.getname());
        System.out.println(one.getage());
        student two = new student();
        two.setname("小丹丹");
        two.setage(20);
        System.out.println(two.getname());
        System.out.println(two.getage());
        System.out.println("截至目前，她们由"+teacher.getteacher()+"负责授课");
        teacher.changeteacher("小雯");//换老师
        System.out.println("现在由" + teacher.getteacher() + "负责授课");
    }

}

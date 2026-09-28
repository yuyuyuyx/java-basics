package 学习草稿.对象.面向对象小细节.老师;

public class 成品 {
    public static void main(String[] args) {
        shuxing teacherA = new shuxing();
        teacherA.name = "张老师";
        teacherA.age = 36;
        Action teacherAction=new Action();//调用方法前提句子
        teacherAction.teach();//老师开始上课上述为一般方法




    }
}

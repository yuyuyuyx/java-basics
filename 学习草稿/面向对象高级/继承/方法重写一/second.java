package 学习草稿.面向对象高级.继承.方法重写一;

public class second extends origin {

    /*
     * 在 Java 中，
     * 调用方法的语句（执行代码）必须放在方法（或构造方法、代码块）里面，
     * 不能直接裸写在类的大括号下。
     */
    // 把方法调用放在一个方法里
    public void show_second() {
        super.telephone();
        super.Email();
    }

}

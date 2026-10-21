package 学习草稿.面向对象高级.继承.方法重写一;

public class third extends origin {
    @Override
     // （告诉编译器这是一个重写方法，写错了会报错）
    public void telephone() {

        System.out.println("视频通话");

    }
    public void game(){
        System.out.println("打游戏");

    }
    
}

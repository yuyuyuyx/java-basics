package 学习草稿.面向对象高级.接口.接口练习二;

public interface speakEnglish {
    String getname(); // 声明对实现者的要求

    default void speakEnglish() { // 共享的默认实现
        System.out.println(getname() + "说英语");
    }
    // public 可以省略，default不要省略，创建的时候
    // default代表默认方法，有方法体{},不强制被重写，但如果要重写，把default去掉
}
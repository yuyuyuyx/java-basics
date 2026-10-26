package 学习草稿.面向对象高级.接口.接口练习二;

public interface speakEnglish {
    String getname();                 // 声明对实现者的要求

    default void speakEnglish() {     // 共享的默认实现
        System.out.println(getname() + "说英语");
    }
}
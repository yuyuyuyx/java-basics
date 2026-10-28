package 第一阶段.面向对象高级.接口.接口练习一;

public interface swim {

    default void swim() {
        System.out.println("游泳");

    }
}

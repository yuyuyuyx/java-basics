package 学习草稿.面向对象高级.接口.接口练习一;

public class dog extends animal implements swim {
    public dog() {
        super();
    }

    public dog(String name, String color) {
        super(name, color);

    }
    @Override
    public void eat() {
        System.out.println("吃骨头");
        
    }
    @Override
    public void swim() {
       System.out.println("狗刨");
    }
}

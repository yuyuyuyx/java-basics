package 学习草稿.面向对象高级.接口.接口练习一;

public class frog extends animal implements swim{
     public frog() {
        super();
    }

    public frog(String name, String color) {
        super(name, color);

    }
    @Override
    public void eat() {
        System.out.println("吃虫子");
        
    }
    @Override
    public void swim() {
        System.out.println("蛙泳");
    }
}

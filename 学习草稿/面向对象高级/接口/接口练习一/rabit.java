package 学习草稿.面向对象高级.接口.接口练习一;

public class rabit extends animal {
     public rabit() {
        super();
    }

    public rabit(String name, String color) {
        super(name, color);

    }
    @Override
    public void eat() {
        System.out.println("吃胡萝卜");
        
    }
    
}

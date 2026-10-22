package 学习草稿.面向对象高级.抽象.抽象练习一;

public class cat extends com {
    public cat(){
        super();

    }
    public cat(String name,String color){
        super(name, color);

    }
    
    @Override
    public void eat() {
        System.out.println("颜色是"+getcolor()+"的"+getname()+"吃鱼");
        
    }
    @Override
    public void indoor_pet_activities() {
       System.out.println("颜色是"+getcolor()+"的"+getname()+"捉老鼠");
        
    }
    @Override
    public void drink() {
        System.out.println("颜色是"+getcolor()+"的"+getname()+"喝水");
        
        
    }
}

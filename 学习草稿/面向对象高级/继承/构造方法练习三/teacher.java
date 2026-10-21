package 学习草稿.面向对象高级.继承.构造方法练习三;

public class teacher extends com {
    public void teach(){
        System.out.println("在教书");
    }
    public teacher(){
        super();

    }
    public teacher(String name,int age){
        super(name, age);
        

    }
    
}

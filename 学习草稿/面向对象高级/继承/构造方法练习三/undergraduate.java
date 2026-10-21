package 学习草稿.面向对象高级.继承.构造方法练习三;

public class undergraduate extends student {
   @Override
   public void study() {
       System.out.println("正在攻读学士学位");
   }
   public undergraduate(){
    super();
   }
   public undergraduate(String name,int age,String grade){
    super(name, age, "本科生");

   }

}

package 学习草稿.面向对象高级.继承.作业一;

public class cooker extends com {
    public cooker(){
        super();
    }
    public cooker(String name,int id,double salary,String job){
        super(id, name, salary,"厨师");//如果不做特殊处理，这里可以设定基础工资
    }
    public void cook(){
        System.out.println("炒菜");
    }
}

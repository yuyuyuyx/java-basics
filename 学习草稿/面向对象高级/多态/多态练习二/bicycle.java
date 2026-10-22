package 学习草稿.面向对象高级.多态.多态练习二;

public class bicycle extends vehicle {
    public bicycle(){

    }
    public bicycle(String brand, double speed){
        super(brand, speed);

    }
    public void ringBell(){
        System.out.println(getbrand()+"自行车响铃");
        //这里因为车子的品牌和速度都在变，所以不能以一句话了事,要添加变量
    }
    @Override
    public void move() {
       System.out.println(getbrand()+"自行车以"+getspeed()+"移动");
        
    }
}

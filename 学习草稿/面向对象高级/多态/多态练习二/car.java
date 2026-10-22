package 学习草稿.面向对象高级.多态.多态练习二;

public class car extends vehicle {
    public car() {

    }

    public car(String brand, double speed) {
        super(brand, speed);

    }

    public void honk() {
        System.out.println(getbrand()+"汽车鸣笛");
    }
    @Override
    public void move() {
        System.out.println(getbrand()+"汽车以"+getspeed()+"移动");
        
    }

}

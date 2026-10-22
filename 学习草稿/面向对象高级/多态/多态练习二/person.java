package 学习草稿.面向对象高级.多态.多态练习二;

public class person {
    private String name;
    private int age;
    private String gender;

    public person() {

    }

    public person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;

    }

    public void setname(String name) {
        this.name = name;
    }

    public String getname() {
        return name;
    }

    public void setage(int age) {
        this.age = age;
    }

    public int getage() {
        return age;

    }

    public void setgender(String gender) {
        this.gender = gender;
    }

    public String getgender() {
        return gender;
    }

    // 向下或者向上转型
    public void drive(vehicle vehicle) {// 这个括号里面可以把父类传递过来，名字写两遍
        // 第一个名字代表属于父类，第二个名字代表一个变量vehicle
        vehicle.move();
        // 不同交通工具有自己的特色功能，所以需要判断是谁，不然不知道调用谁
        if (vehicle instanceof bicycle) {// instanceof关键字：判断是不是某个子类
            // 如果是，就响自行车的铃
            // 这里需要一个强转来调用特色功能,把父类身份的vehicle转化为bicycle的vehicle
            bicycle vechBicycle = (bicycle) vehicle;
            vechBicycle.ringBell();

            // 创建一个自行车个体
        }else if (vehicle instanceof car) {//如果是汽车，以此类推
            car veCar = (car)vehicle;
            veCar.honk();
            
        }else{
            System.out.println("没有这种类型的交通工具");
        }

    }

}

package 学习草稿.面向对象高级.接口.接口练习二;

public class Basketball_player extends Basic_Info implements study {
    public Basketball_player() {
        super();
    }

    public Basketball_player(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println(getname() + "学打篮球");

    }

}

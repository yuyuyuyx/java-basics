package 学习草稿.面向对象高级.接口.接口练习二;

public class Basketball_coach extends Basic_Info implements teach{
    public Basketball_coach() {
        super();
    }

    public Basketball_coach(String name, int age) {
        super(name, age);
    }
    @Override
    public void teach() {
        System.out.println(getname()+"教打篮球");
    }

}

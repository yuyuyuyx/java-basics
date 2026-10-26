package 学习草稿.面向对象高级.接口.接口练习二;

public class Table_tennis_coach extends Basic_Info implements speakEnglish, teach {
    public Table_tennis_coach() {
        super();
    }

    public Table_tennis_coach(String name, int age) {
        super(name, age);
    }

   

    @Override
    public void teach() {
        System.out.println(getname() + "教乒乓球");

    }
    

}
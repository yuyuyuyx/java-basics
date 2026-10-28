package 第一阶段.面向对象高级.接口.接口练习二;

public class Table_tennis_player extends Basic_Info implements speakEnglish, study {
    public Table_tennis_player() {
        super();
    }

    public Table_tennis_player(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println(getname() + "学打乒乓球");

    }

   

}

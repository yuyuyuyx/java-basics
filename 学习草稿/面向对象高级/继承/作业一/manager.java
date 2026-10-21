package 学习草稿.面向对象高级.继承.作业一;

public class manager extends com {
    private double managerBonus;

    public manager() {
        super();
    }

    public manager(String name, int id, double salary, double managerBonus, String job) {
        super(id, name, salary, "经理");
        this.managerBonus = managerBonus;
    }

    public void manage() {
        System.out.println("管理其他人");
    }

    public void setmanagerBonus(double managerBonus) {
        this.managerBonus =managerBonus;

    }
    public double getmanagerBonus(){
        return managerBonus;
    }
}

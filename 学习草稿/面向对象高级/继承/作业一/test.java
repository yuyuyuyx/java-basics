package 学习草稿.面向对象高级.继承.作业一;

public class test {

    public static void main(String[] args) {
        // 创建角色
        cooker person1 = new cooker("老王", 223, 5000, null);
        System.out.println("工号：" + person1.getid() +
                "\n" + "名字：" + person1.getname() +
                "\n" + "工资：" + person1.getsalary() +
                "\n" + "职业：" + person1.getjob());
        System.out.print("技能：");
        person1.cook();
        System.out.print("现在在");
        person1.eat();
        System.out.println();
        manager person2 = new manager("王管", 203, 7000, 5000, null);
        System.out.println("工号：" + person2.getid() +
                "\n" + "名字：" + person2.getname() +
                "\n" + "工资：" + person2.getsalary() +
                "\n"+"管理奖金"+person2.getmanagerBonus()+
                "\n" + "职业：" + person2.getjob());
        System.out.print("技能：");
        person2.manage();
        System.out.print("现在在");
        person2.eat();

    }
}

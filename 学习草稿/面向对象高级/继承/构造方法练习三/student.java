package 学习草稿.面向对象高级.继承.构造方法练习三;

public class student extends com {
    private String grade;
    public student(){
        super();
    }
    public student(String name,int age,String grade){
        super(name, age);
        this.grade =grade;
    }

    public void setgrade(String grade) {
        this.grade = grade;
    }

    public String getgrade() {
        return grade;
    }

    public void study(){
        System.out.println("在学习");
    }

}

package 学习草稿.面向对象高级.继承;

public class student extends father{
    private String grade;

    public student() {

    }

    public student(String grade) {
        this.grade = grade;

    }

    public void setgrade(String grade) {
        this.grade = grade;
    }

    public String getgrade() {
        return grade;
    }
    //study
    public void study(){
        System.out.println("在学习");
    }
}

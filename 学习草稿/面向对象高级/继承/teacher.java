package 学习草稿.面向对象高级.继承;

public class teacher extends father {
    private String subject;

    public teacher() {

    }

    public teacher(String subject) {
        this.subject = subject;
    }

    public void setsubject() {
        this.subject = subject;
    }

    public String getsubject() {
        return subject;
    }
    public void teach(){
        System.out.println("在教书");
    }
}

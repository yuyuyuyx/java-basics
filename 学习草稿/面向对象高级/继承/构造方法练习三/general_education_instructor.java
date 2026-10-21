package 学习草稿.面向对象高级.继承.构造方法练习三;

public class general_education_instructor extends teacher {
    @Override
    public void teach() {
       System.out.println("正在教授通识课知识");
    }
    public general_education_instructor(){
        super();

    }
    public general_education_instructor(String name, int age){
        super(name, age);
    }
}

package 第一阶段.面向对象高级.接口.接口练习二;

public  class Basic_Info {
    private String name;
    private int age;

    public Basic_Info() {

    }

    public Basic_Info(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getname() {
        return name;

    }

    public void setage(int age) {
        this.age = age;
    }

    public int getage() {
        return age;

    }

    

}

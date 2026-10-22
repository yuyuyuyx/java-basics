package 学习草稿.面向对象高级.抽象.抽象练习一;

public abstract class com {
    private String name;
    private String color;

    public com() {

    }

    public com(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getname() {
        return name;
    }

    public void setcolor(String color) {
        this.color = color;

    }

    public String getcolor() {
        return color;

    }

    // 虽然eat和drink可以被纳入indoor_pet_activities
    // 但不想创建一个个体就触发三个行为
    public abstract void eat();

    public abstract void drink();

    public abstract void indoor_pet_activities();
}

package 学习草稿.面向对象高级.接口.接口练习一;

public abstract class animal {
    private String name, color;

    public animal() {

    }

    public animal(String name, String color) {
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

    public abstract void eat();
}

package 学习草稿.面向对象高级.抽象.抽象练习一;

public class test {
    public static void main(String[] args) {
        com []pet ={
        new cat("三三", "白色"),
        new dog("柯基", "黄白色")

    };
    for(com index : pet){
        System.out.println(index.getcolor()+"的"+index.getname());
        index.drink();
        index.eat();
        index.indoor_pet_activities();
    }
    }
    
}


package 学习草稿.对象.面向对象小细节.厨师;

public class test {
    // 每次新建一个测试类，永远先敲 main 方法的骨架，然后再在里面写逻辑：
    public static void main(String[] args) {
        Shuxing cookA = new Shuxing();
        cookA.name = "李厨子";
        cookA.age = 36;
        cookA.cooklevel = "优秀";
        Action cookAction = new Action();
        cookAction.cook();

    }

}

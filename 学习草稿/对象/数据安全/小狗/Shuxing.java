package 学习草稿.对象.数据安全.小狗;

public class Shuxing {
    private int age;

    public boolean setAge(int num) {// 储存年龄数据
        if (num < 0) {
            System.out.println("请重新输入,年龄最小为0");
            return false;

        } else {
            age = num;
            return true;
        }
    }

    public int getAge() {
        return age;

    }

    String name;

    public void panduan(String name) {

    }

}

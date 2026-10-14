package 学习草稿.面向对象;

public class campus_test {
    public static void main(String[] args) {

        campus one = new campus();
        one.setname("张三");
        one.setage(18);
        one.setweight(60);
        one.setheight(183);
        // 要求1
        System.out.println(
                "大一新生，"
                        + one.getname() + ","
                        + one.getage() + "岁,"
                        + (int)one.getheight() + "cm,"
                        + (int)one.getweight() + "kg");
        one.study();
        // 要求2
        double new_weight = one.getweight() + 10;
        // 要求3
        double new_height = one.getheight() + 2;
        double new_weight_02 = one.getweight() - 3;
        // 要求4
        double new_age = one.getage() + 4;
        System.out.println(
                one.getname() + ","
                        + new_age + "岁,"
                        + (int) new_height + "cm,"
                        + (int) new_weight + "kg,");

    }

}
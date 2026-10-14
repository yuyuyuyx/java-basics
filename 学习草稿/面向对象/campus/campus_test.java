package 学习草稿.面向对象.campus;


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

        // ============================================================
        // 【优化方向 ②】业务行为该由谁负责（避免"贫血模型"）  难度：★★★☆☆（中级）
        // 现状：体重 +10、身高 +2、年龄 +4 这些"对数据的加工"，全部
        //       散落在 main 测试代码里。
        // 思考方向：
        //   1. "长胖 10kg""长个 2cm""长大 4 岁"是业务行为，应该写在测试
        //      类里，还是写在 campus 自己身上？由谁提供方法更合理？
        //   2. 如果换个地方也要"长胖 10kg"，这段逻辑会不会被复制粘贴？
        //   3. 把这些行为封装进 campus 后，调用方还需要关心"体重存在哪个
        //      字段、怎么加"这类实现细节吗？
        //   4. 提醒：main 是"调用方/测试"，业务规则不该住在测试里。
        // ------------------------------------------------------------
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
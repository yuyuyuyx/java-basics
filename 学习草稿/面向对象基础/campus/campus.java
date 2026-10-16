package 学习草稿.面向对象基础.campus;

public class campus {
    private String name;
    private int age;
    private double height;
    private double weight;

    // ============================================================
    // 【优化方向 ③】魔法数字与硬编码输出        难度：★★★☆☆（中级）
    // 现状：文案 "刚进入大学努力学习" 写死在这里；测试代码里的
    //       18、60、183、+10、-3、+4 也是直接写在逻辑里的"魔法数字"。
    // 思考方向：
    //   1. 带业务含义的数值/文案，应该散落在代码各处，还是抽成有名字
    //      的常量？以后把年龄上限从 30 改成 35，需要改几个地方？
    //   2. 一个"数据对象"该不该自己负责"往控制台打印"？如果这份信息
    //      以后要显示到网页、写进日志或弹窗，study() 现在要改几处？
    //   3. 能不能让方法"返回结果"，把"怎么展示"的决定权交回调用方？
    // ------------------------------------------------------------
    public void study() {
        System.out.println("刚进入大学努力学习");

    }

    public void setname(String name) {
        this.name = name;

    }

    public String getname() {
        return name;

    }

    // ============================================================
    // 【优化方向 ①】参数校验的时机与手段        难度：★★☆☆☆（入门）
    // 现状：先 this.age = age 完成赋值，再判断 age 是否合法；
    //       而且不合法时只是打印一句提示，非法值其实已经进字段了。
    // 思考方向：
    //   1. 校验应该发生在"赋值之前"还是"赋值之后"？两种顺序，别的
    //      代码拿到这个对象后看到的数据会有什么不同？
    //   2. 真实业务里遇到非法入参，是"打印提示然后放行"，还是"拒绝
    //      这次操作"？Java 里用什么方式表达"拒绝并告知调用方原因"？
    //   3. 对象在 new 的那一刻（构造器）是不是也该走一遍同样的规则？
    //   4. 边界值 age==0 / age==30 到底算不算合法？这条规则若同时
    //      出现在多处，以后改上限要改几处？
    // ------------------------------------------------------------
    public void setage(int age) {
        this.age = age;
        if (age < 0 || age > 30) {
            System.out.println("请重新输入");

        }

    }

    public int getage() {
        return age;

    }

    public void setweight(double weight) {
        this.weight = weight;

    }

    public double getweight() {
        return weight;
    }

    public void setheight(double height) {
        this.height = height;
    }

    public double getheight() {
        return height;
    }
}

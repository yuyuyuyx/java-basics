package 学习草稿.面向对象进阶.枚举.电商;

public enum order {
    /*
     * 待支付：PENDING_PAYMENT （或 UNPAID）
     * 
     * 处理中：PROCESSING
     * 
     * 已发货：SHIPPED
     * 
     * 配送中：DELIVERING （或 IN_TRANSIT）
     * 
     * 已送达：DELIVERED
     * 
     * 已取消：CANCELLED （或 CANCELED）
     * 
     */
    UNPAID("待支付"), // 括号里面解释了变量的意思
    PROCESSING("处理中"),
    SHIPPED("已发货"),
    DELIVERING("配送中"),
    DELIVERED("已送达"),
    CANCELLED("已取消"),
    sky();// 无参构造

    private order() {
        System.out.println("这里是空参数");
        this.name = name;

    }// 无参构造

    // 全参数构造

    private String name;// 为枚举项赐名
    // 写一个get

    order(String name) {
        // 不写private也可以
        // 这里就是一个全参数方法
        // 枚举本质为常量
        // 不能算作变量加入全参
        System.out.println("这里是全参数");
        this.name = name;
    }

    public String getname() {
        return name;
    }

}

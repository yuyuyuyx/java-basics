package 学习草稿.面向对象进阶.枚举;

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
    UNPAID("待支付"),//括号里面解释了变量的意思
    PROCESSING("处理中"),
    SHIPPED("已发货"),
    DELIVERING("配送中"),
    DELIVERED("已送达"),
    CANCELLED("已取消");

    private String name;//为枚举项赐名
    //写一个get/set方法
    private order(String name){
        this.name =name;
    }
    public String getname(){
        return name;
    }

}

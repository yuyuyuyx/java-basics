package 学习草稿.面向对象高级.继承.方法练习二;

public class phone extends smart_device {

    /*
     * 父类 smart_device 中的 price 被定义成了 private（这是 Java 规范中推荐的做法），
     * 子类是无法直接访问的。你必须在父类中提供getPrice() 方法，在子类中调用它。
     */

    @Override
    public double compute_price() {
        /*
         * getprice();
         * /*
         * 修改父类的价格，不能直接用 this.price = ...，
         * 必须调用父类的 setPrice(新价格) 方法。
         */
        /*
         * if (getprice() < 1000 && getprice() > 0) {
         * setprice(getprice()*0.9);
         * } else if (getprice() >= 1000 && getprice() < 5000) {
         * setprice(getprice() * 0.9*0.9);
         * } else if (getprice() >= 5000 && getprice() < 10000) {
         * setprice(getprice() * 0.8*0.9);
         * } else {
         * setprice(getprice() * 0.7*0.9);
         * }
         */
    //第二种简便写法(需要修改父类类型)
        double result =super.compute_price()*0.9;
        return result;

        


        
    }

}

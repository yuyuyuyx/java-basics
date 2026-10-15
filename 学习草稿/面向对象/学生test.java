package 学习草稿.面向对象;

public class 学生test {
    public static void main(String[] args) {
        //空参调用方式
        学生 one = new 学生();
        //全参调用方式
        学生 two = new 学生("张三", 13, "male", 183);
        //即便填入了具体数据，但全参本身已经设置了打印”全参数调用“，所以不会打印传来的形参
        
        

        

    }
}

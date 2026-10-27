package 学习草稿.API.API练习八;

public class test {
    public static void main(String[] args) {
        String username = "abcde";
        // 数据脱敏
        // 截取
        // username.subSequence(0, 0);
        System.out.println(username.subSequence(0, 1));// 左闭右开区间
        System.out.println(username.substring(0));
        // 默认从头开始截取到尾，全封闭区间
        // 字符串创建就无法修改，所以不要截取之后直接在打印处写原字符型变量名

        //如何把用户名末尾打三个***
        System.out.println(username.substring(0, 1)+"***");//只保留第一个字符
        System.out.println(username.charAt(0)+"***");
    }
}

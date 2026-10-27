package 学习草稿.API.API练习二;

public class test {
    public static void main(String[] args) {
        // 创建字符串对象
        String s1 = new String();//空参构造
        System.out.println(s1);//打出来是啥也没有

        String s2 =new String(s1);//含参构造
        System.out.println(s2);//可以传参

        char[]chs={
            'a','b','c','d','e'
        };//字符数组
        String s3 =new String(chs);
        System.out.println(s3);//数组也能传

        byte[]h={//字节数组
            //1.输入是数字，但是返回的是对应ascll表的字母（倒置，利用数字找字符）
            //2.数字不要超过127，可能127以后没有对应字符了
            99,100,101,102,103
        };
        String s4 =new String(h);
        System.out.println(s4);//字节数组也行

        //直接赋值
        String a ="a";
        //直接赋值比new方法要省内存
    }
}

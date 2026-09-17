package 学习草稿;

public class dowhile输出helloworld {// 名字不能用-与空格
    public static void main(String[] args) {
        int i = 0;
        do{//至少执行一次，因为它是先执行再判断，所以有这个特性，哪怕这里是100也要执行一次
            System.out.println("hello world");

        }while(i<0);//条件成立继续循环，反之则停止
        //不要<=0（死循环），<0至少执行一次，不过应该没人这么写打招呼的代码吧
        //上述为死循环

    }

}

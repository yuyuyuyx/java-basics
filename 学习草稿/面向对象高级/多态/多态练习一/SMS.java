package 学习草稿.面向对象高级.多态.多态练习一;

public class SMS extends com {
    public SMS() {

    }

    public SMS(String name, int account, int cope,String job) {
        super(name, account, cope,job);
    }

    @Override
    public void work() {
        System.out.println(
                "姓名为" + getname() + 
                "的"+getjob()+"注册成功" +
                        "账号为" + getaccount() + "," + 
                        "密码为" + getcope());

    }

}

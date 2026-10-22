package 学习草稿.面向对象高级.多态.多态练习一;

public class test {
    public static void main(String[] args) {
        com[] person = {
                new student("李", 2025157322, 157322, null),
                new admin("管理张", 202534, 2534, null),
                new teacher("王老师", 156942, 56942, null)

        };
        for (com index : person) {
            System.out.println(
                    "姓名为" + index.getname() + "的" + index.getjob() + "注册成功"
                            + "，账号：" + index.getaccount()
                            + "，密码：" + index.getcope());

            // 多态：编译看左边(com)，运行看右边(实际 new 的子类)
            System.out.print("工作内容是：");
            index.work();
            // 想让每个子类的方法体现出来，直接按倒数两行的做法即可，不需要设置内层循环去遍历

        }
    }
}

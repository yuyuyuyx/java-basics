package 学习草稿.对象.数据安全.学生信息;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // 写一个可以交互的系统
        // 1.main这里让用户自己输入要查看的时期，然后触发对应时期的事件
        // 注意：（输入他自己的，看也是他自己看）
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的姓名，身高，体重");
        Character_student student = new Character_student();// 放前面，不然下面的四行没法用
        // 开始记录各项数据
        // 加一个判断，防止熊孩子乱输入
        while (true) {
            if (sc.hasNextLine() && sc.hasNextInt() && sc.hasNextDouble()) {// 是姓名，年龄，身高体重吗
                student.name = sc.nextLine();
                student.age = sc.nextInt();
                student.height = sc.nextDouble();
                student.weight = sc.nextDouble();
                break;//没问题就下一阶段

            }else if(!(student_name instanceof String) ||student_age<0 ||student_height<0||student_weight<0){
                System.out.println("请重新输入");
                sc.nextLine();//吃掉旧数据
                
        }else{
            System.out.println("");

        }


        /*Actions_student studentAction = new Actions_student();
        studentAction.study();// 打印张三大一啥情况
        System.out.println("大二期间,张三体重增加了10千克");
        System.out.println("大三期间张三减肥成功，身高增加2厘米，体重减少3千克");

        System.out.println(
                "大学毕业后，张三年龄为" + (student.age + 4) +
                        "身高为" + (student.height + 2) +
                        "厘米，体重为" + (student.weight + 7));*/

    }
}
}
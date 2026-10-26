package 学习草稿.面向对象高级.接口.接口练习二;

import java.util.ArrayList;//实现类
import java.util.List;//接口
//ArrayList、LinkedList、Vector、以及 List.of() 返回的不可变实现，都是它的实现者。

public class test {
    public static void main(String[] args) {
        // 名册只写一次，三个能力列表都由 collect 自动派生
        List<Basic_Info> roster = List.of(//
                new Table_tennis_coach("文", 24),
                new Table_tennis_player("小王", 20),
                new Basketball_coach("李", 25),
                new Basketball_player("小赵", 19));

        List<speakEnglish> 说英语的人 = collect(roster, speakEnglish.class);
        List<study> 学习者 = collect(roster, study.class);
        List<teach> 教练们 = collect(roster, teach.class);

        说英语的人.forEach(speakEnglish::speakEnglish);
        学习者.forEach(study::study);
        教练们.forEach(teach::teach);
    }

    // capability 作为类型令牌传入：T 由调用方的 Class 对象决定，方法体对具体接口一无所知
    static <T> List<T> collect(List<? extends Basic_Info> roster, Class<T> capability) {
        List<T> result = new ArrayList<>();
        for (Basic_Info member : roster) {
            if (capability.isInstance(member)) {
                result.add(capability.cast(member));
            }
        }
        return result;
    }
}

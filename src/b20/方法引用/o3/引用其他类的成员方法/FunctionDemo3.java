package b20.方法引用.o3.引用其他类的成员方法;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class FunctionDemo3 {
    public static void main(String[] args) {
        //方法引用:⭐⭐⭐
        // (引用成员方法)
        // 格式:
        //      其他类:其他类对象::方法名
        //      本类:this::方法名
        //      父类:super::方法名

        // 需求:集合中有一些名字，按照要求过滤数据
        // 数据:"张无忌","周芷若","赵敏","张强","张三丰"
        // 要求:只要以张开头，而且名字是3个字的

        //1.创建集合并添加元素
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰");

        //2.过滤数据(只要以张开头，而且名字是3个字的)
        list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(s -> System.out.println(s));

        System.out.println("------------------");
        list.stream()
                .filter(new Predicate<String>() {
                    @Override
                    public boolean test(String s) {
                        return s.startsWith("张") && s.length() == 3;
                    }
                }).forEach(s -> System.out.println(s));

        System.out.println("------------------");

        //调用其他类的方法⭐⭐
        list.stream()
                .filter(new StringOperation()::StringJudge)
                .forEach(s -> System.out.println(s));

        System.out.println("------------------");

        //调用本类的静态方法⭐⭐
        list.stream()
                .filter(FunctionDemo3::StringJudge2)
                .forEach(s -> System.out.println(s));

        System.out.println("------------------");

        //调用本类的方法⭐⭐
        list.stream()
                .filter(new FunctionDemo3()::StringJudge3)
                //注意:这里为什么不能是⭐⭐⭐
                //.filter(this::StringJudge3) 呢?
                //因为在静态方法中是没有this的
                .forEach(s -> System.out.println(s));
    }

    //如果在本来里创建方法
    public static boolean StringJudge2(String s) {
        return s.startsWith("张") && s.length() == 3;
    }

    public boolean StringJudge3(String s) {
        return s.startsWith("张") && s.length() == 3;
    }
}

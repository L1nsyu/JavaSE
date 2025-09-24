package b20.方法引用.o5.引用构造方法;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionDemo5 {
    public static void main(String[] args) {
        //方法引用(引用构造方法)
        // 格式:
        //      类名::new

        // 目的:
        //      创建这个类的对象

        //需求:
        //      集合里面存储姓名和年龄，要求封装成student对象并收集到List集合中

        //方法引用的规则:
        //1.需要有函数式接口
        //2.被引用的方法必须已经存在
        //3.被引用方法的形参和返回值，需要跟抽象方法的形参返回值保持一致
        //4.被引用方法的功能需要满足当前的需求


        //1.创建集合对象
        ArrayList<String> list = new ArrayList<>();

        //2.添加数据
        Collections.addAll(list, "张无忌,15", "周芷若,15", "赵敏,15", "张三丰,15", "张强,15", "张翠山,15", "张良,15");

        //3.封装成Student对象并收集到List集合中
        //String --> Student
        List<Student> StudentList = list.stream()
                .map(new Function<String, Student>() {
                    @Override
                    public Student apply(String s) {
                        String name = s.split(",")[0];
                        int age = Integer.parseInt(s.split(",")[1]);
                        return new Student(name, age);
                    }
                }).collect(Collectors.toList());
        System.out.println(StudentList);


        System.out.println("-----------------------");


        List<Student> StudentList2 = list.stream()
                .map(Student::new)
                .collect(Collectors.toList());
        System.out.println(StudentList2);

    }
}

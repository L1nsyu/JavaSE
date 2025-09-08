package a16.集合进阶.HashSet和LinkedHashSet详解;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo2 {
    public static void main(String[] args) {
        //需求:
        //创建一个存储学生对象的集合，存储多个学生对象。
        //使用程序实现在控制台遍历该集合。
        //要求:学生对象的成员变量值相同，我们就认为是同一个对象

        //1.创建三个学生对象
        Student s1 = new Student("zhangsan",21);
        Student s2 = new Student("zhangsan",21);
        Student s3 = new Student("wangwu",21);
        Student s4 = new Student("zhaosi",21);

        //2.创建集合用来添加学生
        HashSet<Student> list = new HashSet<>();

        //3.添加元素
        //如果此时学生类没有重写hashCode和 equals方法 ,那么集合中将出现四个对象信息
        //因为Student学生类是自定义对象,所以需要重写
        //如果是String ,Integer 的话, java内部已经重写好相应的类型了
        System.out.println(list.add(s1));//true
        System.out.println(list.add(s2));//false
        System.out.println(list.add(s3));//true
        System.out.println(list.add(s4));//true

        //4.打印集合
        System.out.println(list);
    }
}

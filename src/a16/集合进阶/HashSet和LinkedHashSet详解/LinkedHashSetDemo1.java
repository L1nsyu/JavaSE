package a16.集合进阶.HashSet和LinkedHashSet详解;


import java.util.LinkedHashSet;

public class LinkedHashSetDemo1 {
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
        LinkedHashSet<Student> lhs = new LinkedHashSet<>();

        //3.添加元素
        System.out.println(lhs.add(s1));//true
        System.out.println(lhs.add(s2));//false
        System.out.println(lhs.add(s3));//true
        System.out.println(lhs.add(s4));//true

        //4.打印集合
        System.out.println(lhs);
        //LinkedHashSet 是 HashSet 的儿子
        //和HashSet的差别是 :
        //此时打印集合输出的顺序就是从早到晚进入集合的顺序了
        //[Student{name='zhangsan', age=21}, Student{name='wangwu', age=21}, Student{name='zhaosi', age=21}]
    }
}

package a16.集合进阶.TreeSet第一种排列方式;

import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        //需求:创建Treeset集合，并添加3个学生对象
        // 学生对象属性:
        //      姓名，年龄。
        //      要求按照学生的年龄进行排序
        //      同年龄按照姓名字母排列(暂不考虑中文)
        //      同姓名，同年龄认为是同一个人

        //方式1:
        //      默认的排序规则/自然排序
        //      Student实现Comparable接口,重写里面的抽象方法,再指定比较规则





        //1.创建三个学生对象
        Student s1 = new Student(23, "zhangsan");
        Student s2 = new Student(24, "lisi");
        Student s3 = new Student(23, "wangwu");

        //2.创建集合对象
        TreeSet<Student> ts = new TreeSet<>();

        //3.添加元素
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);

        //4.打印集合
        System.out.println(ts);

        //hashCode 和 equals 方法: 哈希表有关的  需要重写
        //TreeSet 底层是红黑树 不要重写
    }
}

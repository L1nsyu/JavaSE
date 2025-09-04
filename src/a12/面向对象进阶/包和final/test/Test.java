package a12.面向对象进阶.包和final.test;

import a12.面向对象进阶.包和final.domain1.Teacher;

public class Test {
    public static void main(String[] args) {
        //创建对象
        //1.使用同一个包中的类时,不需要导包
        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(18);
        System.out.println(s1.getName() + ", " + s1.getAge());


        //2.使用java.lang包中的类时,不需要导包
        String s2 = "abc";
        System.out.println(s2);

        //3.其他情况都需要导包
        Teacher t = new Teacher(); // 当没有导包时报错

        //4.如果同时使用两个包中的同名类,需要用全类名
        a12.面向对象进阶.包和final.domain1.Teacher t1 = new a12.面向对象进阶.包和final.domain1.Teacher();
        a12.面向对象进阶.包和final.domain2.Teacher t2 = new a12.面向对象进阶.包和final.domain2.Teacher();
    }
}

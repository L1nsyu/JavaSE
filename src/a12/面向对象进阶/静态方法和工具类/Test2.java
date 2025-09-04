package a12.面向对象进阶.静态方法和工具类;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        //1.创建一个集合用来储存学生对象
        ArrayList<Student> list = new ArrayList<>();

        //2.创建三个学生对象
        Student s1 = new Student("zhangsan", 12, "男");
        Student s2 = new Student("lisi", 13, "女");
        Student s3 = new Student("wangwu", 14, "男");

        //3.把学生对象添加到集合当中
        list.add(s1);
        list.add(s2);
        list.add(s3);

        //4.调用工具类中的方法
        int maxAgeStudent = ArrayUtil.getMaxAgeOfStudent(list);
        System.out.println("年龄最大的是:" + maxAgeStudent + "岁");
    }
}

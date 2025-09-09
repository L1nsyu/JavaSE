package a16.集合进阶.TreeSet第二种排序方式和综合练习;

import java.util.TreeSet;

public class TreeSetDemo4 {
    public static void main(String[] args) {
        //需求:创建5个学生对象
        //属性:(姓名,年龄，语文成绩,数学成绩,英语成绩),
        // 按照总分从高到低输出到控制台
        // 如果总分一样，按照语文成绩排
        // 如果语文一样，按照数学成绩排
        // 如果数学成绩一样，按照英语成绩排
        // 如果英文成绩一样，按照年龄排
        // 如果年龄一样，按照姓名的字母顺序排
        // 如果都一样，认为是同一个学生，不存，

        //1.创建学生对象
        //默认排序:
        Student s1 = new Student("zhangsan", 21, 90, 90, 90);
        Student s2 = new Student("lisi", 22, 80, 80, 90);
        Student s3 = new Student("wangwu", 20, 70, 80, 90);
        Student s4 = new Student("zhaoliu", 25, 30, 50, 100);
        Student s5 = new Student("qianqi", 17, 100, 100, 100);


        //默认ArrayList
        //HashSet
        //TreeSet
        //2.创建集合
        TreeSet<Student> ts = new TreeSet<>();
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        //4.打印集合(遍历)
//        System.out.println(ts);

        for (Student t : ts) {
            System.out.println(t);
        }
    }
}

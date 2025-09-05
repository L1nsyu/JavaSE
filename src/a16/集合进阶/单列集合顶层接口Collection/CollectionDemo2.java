package a16.集合进阶.单列集合顶层接口Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo2 {
    public static void main(String[] args) {
        //1.创建集合的对象
        Collection<Student> coll = new ArrayList<>();

        //2.创建三个学生的对象
        Student s1 = new Student("zhangsan", 18);
        Student s2 = new Student("lisi", 19);
        Student s3 = new Student("wangwu", 20);

        //3.把学生对象添加到集合当中
        coll.add(s1);
        coll.add(s2);
        coll.add(s3);

        //4.判断集合中某一个学生对象是否包含
        Student s4 = new Student("zhangsan", 18);
        //因为contains方法在底层依赖equals方法判断对象是否一致的.
        //如果存的是自定义对象,没有重写equals方法,那么默认使用Object类中的equals方法进行判断,
        // 而Object类中equals方法,依赖地址值进行判断
        //需求:如果同姓名和同年龄,就认为是同一个学生
        System.out.println(coll.contains(s4));//true
    }
}

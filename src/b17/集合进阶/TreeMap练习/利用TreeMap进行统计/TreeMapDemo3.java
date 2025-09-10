package b17.集合进阶.TreeMap练习.利用TreeMap进行统计;

import java.util.TreeMap;

public class TreeMapDemo3 {
    public static void main(String[] args) {
        //代码书写两种排序规则:
        //实现Comparable接口,指定比较规则
        //创建集合时传递Comparator比较器对象,指定比较规则



        //TreeMap集合:基本应用
        //需求2:
        //     键:学生对象
        //      值:籍贯
        //      要求:按照学生年龄的升序排序,年龄一样按照姓名的字母排序,同姓名年龄视为同一个人


        //实现Comparable接口，指定比较规则.(Student类加接口 + 重写方法)
        //因为Student类是自定义的类

        //1.创建集合
        TreeMap<Student, String> tm = new TreeMap<>();

        //2.创建三个学生对象
        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("wangwu", 25);

        //3.添加元素
        tm.put(s1, "beijing");
        tm.put(s2, "shanghai");
        tm.put(s3, "jiangsu");

        //4.打印集合
        System.out.println(tm);

    }
}

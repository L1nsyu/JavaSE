package a07.面向对象.构造方法;

public class StudentTest {
    public static void main(String[] args) {
        //创建对象
        //调用的是空参构造
//        Student s = new Student();

        Student s = new Student("zhangsan", 18);
        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}

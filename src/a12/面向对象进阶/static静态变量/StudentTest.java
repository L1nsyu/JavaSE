package a12.面向对象进阶.static静态变量;

public class StudentTest {
    public static void main(String[] args) {
        //如果使用static静态变量
        //则多一种调用的方法 (用类名进行调用)
        Student.teacherName = "阿伟老师";
        //后面就不需要一个一个对象去赋值

        //1.创建第一个学生对象
        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(18);
        s1.setGender("男");

        //static 静态变量
//        s1.teacherName = "阿玮老师";
        //public static String teacherName; //这是Student类里面修饰的静态变量
        //如果只是public String teacherName; 所有Student类都有teacherName这一变量
        //需要每一个对象都赋值 , 但是加入static 则让 所有的对象都应用 这个值
        //则现在所有的teacherName全是 阿伟老师

        s1.study();
        s1.show();

        //2.创建第二个学生对象
        Student s2 = new Student();
        s2.setName("李四");
        s2.setAge(22);
        s2.setGender("男");

        s2.study();
        s2.show();
    }
}

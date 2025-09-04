package a12.面向对象进阶.static的注意事项;

public class StudentTest {
    public static void main(String[] args) {
        Student.teacherName = "阿伟老师";

        Student s1 = new Student();
        System.out.println("s1" + s1);
        s1.name = "zhangsan";
        s1.age = 18;
        s1.show1();

        System.out.println("==================");

        Student s2 = new Student();
        System.out.println("s2" + s2);
        s2.name = "lisi";
        s2.age = 19;
        s2.show1();
    }
}

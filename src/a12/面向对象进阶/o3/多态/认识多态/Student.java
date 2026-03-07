package a12.面向对象进阶.o3.多态.认识多态;

public class Student extends Person {
    @Override
    public void show() {
        System.out.println("学生的信息为:" + getName() + ", " + getAge());
    }
}

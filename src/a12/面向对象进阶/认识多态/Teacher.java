package a12.面向对象进阶.认识多态;

public class Teacher extends Person {
    @Override
    public void show() {
        System.out.println("老师的信息为" + getName() + ", " + getAge());
    }
}

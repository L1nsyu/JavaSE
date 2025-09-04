package a12.面向对象进阶.继承中的构造方法和thissuper关键字.Test;

public class Student extends Person {
    public Student() {
        //子类的构造方法中隐藏的super() 去访问父类的无参构造
        super();
        System.out.println("子类的无参构造");
    }

    public Student(String name,int age) {
        super(name,age);
    }
}

package a12.面向对象进阶.o2.继承.继承中的构造方法和thissuper关键字.Test;

public class Person {
    String name;
    int age;

    public Person() {
        System.out.println("父类的无参构造");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

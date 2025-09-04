package a12.面向对象进阶.抽象类和抽象方法.demo1;

public abstract class Person {
    public String name;
    public int age;

    //3.可以有构造方法
    //构造方法的作用:当创建子类对象时,给属性进行赋值的
    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //有抽象方法的类一定是抽象类 --> 删除抽象类的前缀会报错
    public abstract void work();

    //2.抽象类中不一定有抽象方法,有抽象方法的类一定是抽象类

    //抽象类中不一定有抽象方法
    public void sleep() {
        System.out.println("shuijiao");
    }
}

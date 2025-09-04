package a12.面向对象进阶.接口综合案例;
//因为现在我不想让外界去直接创造人的对象
//因为直接创造顶层父类人的对象此时是没有意义的
//所以我就把他设为抽象的
//目的是不让创建person的对象
public abstract class Person {
    private String name;
    private int age;

    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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


}

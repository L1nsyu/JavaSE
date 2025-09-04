package a12.面向对象进阶.接口综合案例;

public abstract class Sporter extends Person {
    public Sporter() {
    }

    public Sporter(String name , int age) {
        super(name,age);
    }

    public abstract void study();
}

package a12.面向对象进阶.o7.接口.接口和抽象类的综合案例;

public abstract class Coach extends Person{
    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }

    public abstract void teach();
}

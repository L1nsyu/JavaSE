package a12.面向对象进阶.抽象类和抽象方法.练习;

public class Frog extends Animal {
    public Frog() {

    }

    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("亲哇再吃虫子");
    }
}

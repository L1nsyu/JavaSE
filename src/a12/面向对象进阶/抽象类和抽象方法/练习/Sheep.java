package a12.面向对象进阶.抽象类和抽象方法.练习;

public class Sheep extends Animal {
    public Sheep() {
    }

    public Sheep(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("山羊再吃草");
    }
}

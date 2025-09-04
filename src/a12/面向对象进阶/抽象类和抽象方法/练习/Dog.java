package a12.面向对象进阶.抽象类和抽象方法.练习;

public class Dog extends Animal {
    public Dog() {

    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗再吃骨头");
    }
}

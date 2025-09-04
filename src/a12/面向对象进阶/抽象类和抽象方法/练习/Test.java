package a12.面向对象进阶.抽象类和抽象方法.练习;

public class Test {
    public static void main(String[] args) {
        //青蛙    frog
        //狗     Dog
        //山羊    Sheep
        //属性:名字，年龄      行为:吃虫子，喝水
        //属性:名字，年龄      行为:吃骨头，喝水
        //属性:名字，年龄      行为:吃艹，喝水

        //创建对象
        Frog fg = new Frog("小红", 12);
        System.out.println(fg.getName() + "," + fg.getAge());
        fg.drink();
        fg.eat();


    }
}

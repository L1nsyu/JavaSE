package a12.面向对象进阶.接口;

public class Test {
    public static void main(String[] args) {
        //创建对象
        Frog f = new Frog("xiaoqing", 2);
        System.out.println(f.getName() + "," + f.getAge());

        f.eat();
        f.swim();


        Rabbit r = new Rabbit("xiaobai", 1);
        System.out.println(r.getName() + "," + r.getAge());

        r.eat();


    }
}

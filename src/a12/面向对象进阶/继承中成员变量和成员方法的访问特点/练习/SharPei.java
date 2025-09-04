package a12.面向对象进阶.继承中成员变量和成员方法的访问特点.练习;

public class SharPei extends Dog{
    //因为沙皮狗吃的是狗粮和骨头
    //父类的方法不能满足我们的需求了,所以需要进行重写
    @Override
    public void eat() {
        System.out.println("狗啃骨头");
        super.eat();
    }
}

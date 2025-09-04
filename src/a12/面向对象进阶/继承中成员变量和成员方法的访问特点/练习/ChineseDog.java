package a12.面向对象进阶.继承中成员变量和成员方法的访问特点.练习;

public class ChineseDog extends Dog {
    //父类的方法不能满足我们的需求了,所以需要进行重写
    //而且中华田园犬完全用不到分类中的代码的,所以不需要通过super进行调用
    @Override
    public void eat() {
        System.out.println("吃剩饭");
    }
}

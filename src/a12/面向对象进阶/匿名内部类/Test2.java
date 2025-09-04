package a12.面向对象进阶.匿名内部类;

public class Test2 {
    public static void main(String[] args) {
        //拓展更好玩的东西
        //整体我们可以理解为Swim接口的实现类对象

        //既然匿名内部类 也就是右边部分实际上是实现了对象
        //那么我是否可以 让Swim s接收它呢?  可以
        //这就是接口多态
        Swim s = new Swim(){
            @Override
            public void swim(){
                System.out.println("重写之后的游泳方法");
            }
        };
        //编译看左边,运行看右边
        s.swim();


        new Swim(){
            @Override
            public void swim(){
                System.out.println("重写之后的游泳方法");
            }
        }.swim();//直接调用方法  可以调用自己类的所有方法
    }
}

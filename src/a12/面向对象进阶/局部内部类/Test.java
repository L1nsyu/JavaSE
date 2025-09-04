package a12.面向对象进阶.局部内部类;

public class Test {
    public static void main(String[] args) {
        //局部内部类
        //1.将内部类定义在方法里面就叫做局部内部类，类似于方法里面的局部变量
        // 2.外界是无法直接使用局部内部类，需要在方法内部创建对象并使用。
        // 3.该类可以直接访问外部类的成员，也可以访问方法内的局部变量。


        //外界是无法直接使用局部内部类
//        Outer o =  new Outer();
//        System.out.println(o.a);
        //Outer的对象无法访问到 局部变量a ,同理也访问不到 局部内部类

        //调用show方法, 让代码执行
        Outer o = new Outer();
        o.show();


    }
}

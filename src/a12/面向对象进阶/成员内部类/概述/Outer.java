package a12.面向对象进阶.成员内部类.概述;

public class Outer {
    //方式二:直接创建
    String name;

    //private 时候不能直接创建
    public class Inner {

    }

    //方式一:外部类编写方法，对外提供内部类对象
    public Inner getInstance() {
        return new Inner();
    }
}

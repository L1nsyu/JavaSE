package a12.面向对象进阶.成员内部类.概述;

public class Test {
    public static void main(String[] args) {
        //编写成员内部类的注意点:
        //1.成员内部类可以被一些修饰符所修饰，比如: private，默认，protected，public，static等
        //2.在成员内部类里面，JDK16之前不能定义静态变量，JDK 16开始才可以定义静态变量。
        //获取成员内部类对象的两种方式:
        //方式一:外部类编写方法，对外提供内部类对象
        //方式二:直接创建
        //格式:外部类名.内部类名对象名=外部类对象.内部类对象;
        // 范例:Outer.Inner oi=new Outer().new Inner();

        //方式二:直接创建
        //创建对象的格式:
        //类名 对象名 = new 类名();
        //Student s = new Student();

        //我要创建的是谁的对象?
        //内部类的对象
//        Outer.Inner oi = new Outer().new Inner();

        //推导过程:
        //因为name是一个成员变量,想要调用只能通过对象去调用
//        Outer o = new Outer();
//        System.out.println(o.name);
        //-->
//        System.out.println(new Outer().name);
        //在外部类中 成员变量和成员内部类的地位是一样的,所以
//        System.out.println(new Outer().Inner);
        //但是Inner不是一个变量而是一个类,所以需要new 一个对象给她
//        System.out.println(new Outer().new Inner());
        //所以
//        Outer.Inner oi = new Outer().new Inner();


        //方式一:外部类编写方法，对外提供内部类对象
        Outer o = new Outer();
        //无法知道inner的 类型 ,所以采用多态的方式, 使用父类Object
        Object inner = o.getInstance();
        System.out.println(inner);
    }
}

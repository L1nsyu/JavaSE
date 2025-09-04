package a12.面向对象进阶.局部内部类;

public class Outer {
    int b = 20;

    public void show() {
        int c = 10;
        //局部变量
        int a = 10;


        //局部内部类
        class Inner {
            String name;
            int age;

            public void method1() {
                //该类可以直接访问外部类的成员
                System.out.println(b);
                //也可以访问方法内的局部变量
                System.out.println(c);
                System.out.println("局部内部类中的method1方法");
            }

            public static void method2() {
                System.out.println("局部内部类中的method2静态方法");
            }
        }

        //需要在方法内部创建对象并使用
        //创建局部内部类的对象
        Inner i = new Inner();
        System.out.println(i.name);
        System.out.println(i.age);
        i.method1();
        Inner.method2();

    }
}

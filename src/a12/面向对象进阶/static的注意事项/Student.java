package a12.面向对象进阶.static的注意事项;

//静态方法中没有this关键字
//静态方法中,只能访问静态
//非静态方法可以访问所有

public class Student {
    String name;
    int age;
    static String teacherName;


    //this:表示当前方法调用者的地址值
    //这个this:是由虚拟机赋值的
    //下面展示了隐藏起来的this

    //3.非静态方法可以访问所有
    //静态调用由两种方式:1.对象调用 2.类名调用
    //所以this.teacherName是对的
    public void show1(Student this){
        System.out.println("this:"+this);
        System.out.println(this.name + "," +this.age + "," +this.teacherName);

        //调用其他方法
        this.show2();

        //3.非静态方法可以访问所有
        this.method();

    }

    //1.静态方法中没有this关键字
    //一般 非静态的 都与对象相关的
    //而 静态的 都是共享的 跟某一对象没有关系

    //2.静态方法中,只能访问静态
    public static void method(){
//        System.out.println(this.name);//报错
//        this.show1(); //报错
        System.out.println("静态方法");
        System.out.println(teacherName);
    }

    public void show2(){
        System.out.println("show2");
    }
}

package a12.面向对象进阶.接口多学三招.接口的静态方法;

public interface Inter {
    //接口中静态方法的定义格式:
    //格式:public static 返回值类型 方法名(参数列表){}
    // 范例:public static void show(){}
    //接口中静态方法的注意事项:
    //静态方法只能通过接口名调用，不能通过实现类名或者对象名调用
    // public可以省略，static不能省略

    //抽象方法
    public abstract void method();

    //静态方法
    public static void show(){
        System.out.println("Inter接口中的静态方法");
    }
}

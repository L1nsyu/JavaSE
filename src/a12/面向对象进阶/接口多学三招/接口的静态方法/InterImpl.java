package a12.面向对象进阶.接口多学三招.接口的静态方法;

public class InterImpl implements Inter {
    @Override
    public void method() {
        System.out.println("interimpl 重写的抽象方法");
    }

    //静态方法只能通过接口名调用，不能通过实现类名或者对象名调用
    //报错 static静态方法不能被重写
//    @Override
//    public void show() {
//        System.out.println("interimpl 重写的静态方法");
//    }

    //强行写一个静态方法
    //不叫重写 ,只是刚好跟接口中的静态方法方法名一样而已
    public static void show() {
        System.out.println("interimpl 重写的静态方法");
    }

}

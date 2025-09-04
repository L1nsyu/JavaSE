package a12.面向对象进阶.接口多学三招.接口的默认方法;

public class InterImpl implements InterA,InterB {
    @Override
    public void method() {
        System.out.println("<UNK> --- method");
    }

    //1.默认方法不是抽象方法，所以不强制被重写。但是如果被重写，重写的时候去掉default关键字
    //不强制重写 ,注释掉代码 ,系统并不会报错
    //但是一定要记得去掉 fault 关键字
//    @Override
//    public void show() {
//        System.out.println("<UNK> --- show");
//    }

    //3.如果实现了多个接口，多个接口中存在相同名字的默认方法，子类就必须对该方法进行重写
    //必须对该方法进行重写
    @Override
    public void show() {
        System.out.println("<UNK> --- show");
    }
}

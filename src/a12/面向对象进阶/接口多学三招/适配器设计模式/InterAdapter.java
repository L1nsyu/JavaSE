package a12.面向对象进阶.接口多学三招.适配器设计模式;

public abstract class InterAdapter implements Inter{
    //适配器设计思路 : 让方法空实现了 也就是空着不写
    //但是这个适配器类并没有任何意义
    //所以让这个类变成抽象类 就可以让别人不能访问它
    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void method3() {

    }

    @Override
    public void method4() {

    }

    @Override
    public void method5() {

    }

    @Override
    public void method6() {

    }

    @Override
    public void method7() {

    }

    @Override
    public void method8() {

    }

    @Override
    public void method9() {

    }

    @Override
    public void method10() {

    }
}

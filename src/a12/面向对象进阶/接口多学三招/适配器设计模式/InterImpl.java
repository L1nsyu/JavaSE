package a12.面向对象进阶.接口多学三招.适配器设计模式;

public class InterImpl extends InterAdapter {
    //实现类去继承适配器
    //我需要用到哪个方法就重写哪个方法就可以了

    @Override
    public void method5() {
        System.out.println("method5 <UNK>");
    }
}

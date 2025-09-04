package a12.面向对象进阶.成员内部类.练习题;

public class Test {
    public static void main(String[] args) {
        //创建内部类的对象,并且调用show方法
        Outer.Inner oi = new Outer().new Inner();
        oi.show();
    }
}

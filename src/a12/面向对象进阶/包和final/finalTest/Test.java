package a12.面向对象进阶.包和final.finalTest;

public class Test {
    public static void main(String[] args) {
        //final修饰方法:
        //1.表明该方法是最终方法,不能被重写
        //final修饰类:
        //2.表明该类是最终类,不能被继承
        //final修饰变量:
        //3.叫做常量,只能被赋值一次

        final int a = 10;
        System.out.println(a);//10
//        a = 20; //报错 不能被赋值
    }
}
/*
class Fu{
    public final void show(){
        System.out.println("父亲的show方法");
    }
}

class Zi extends Fu{
    @Override       //重写报错
    public void show(){
        System.out.println("子类的show方法");
    }
}
*/

/*
final class Fu {
    public void show() {
        System.out.println("父亲的show方法");
    }
}

class Zi extends Fu {    //无法继承 报错
    @Override
    public void show() {
        System.out.println("子类的show方法");
    }
}
*/

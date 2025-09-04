package a12.面向对象进阶.子类到底能继承父类中的哪些内容;
//目的: 子类无法继承父类的构造方法
//目的: 子类无法继承父类的构造方法
//目的: 子类无法继承父类的构造方法

//只能有一个类能被public修饰 ,因为public 要与 创建的java类类名相同
public class Test1 {
    public static void main(String[] args) {
        //利用空参构造创建子类对象
        Zi z1 = new Zi();

        //利用带参构造创建子类对象
//        Zi z2 = new Zi("张三",12);//报错
        //因为子类没有创建带参构造 而空参构造没有报错则是系统自带创建的空参构造
    }
}

class Fu{
    String name;
    int age;

    public Fu(){

    }
    public Fu(String name,int age){
        this.name=name;
        this.age=age;
    }
}

class Zi extends Fu{
    //如果一个类没有构造方法,虚拟机会自动的给你添加一个默认的空参构造
}

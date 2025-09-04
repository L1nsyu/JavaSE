package a12.面向对象进阶.初识内部类;

public class Car {
    //外部类
    String carName;
    int carAge;
    String carColor;

    //show()方法隐藏了 一个 (Car this)
    public void show(Car this){
        //是打印调用者车的名字:bingli
        System.out.println(carName);
        //???在代码中有没有发动机的对象?没有
        //所以要创建一个发动机的对象
        Engine e = new Engine();
        System.out.println(e.engineName);
        //在外部类直接访问是访问不到的
//        System.out.println(engineName);//baocuo
    }

    //内部类
    class Engine{
        String engineName;
        int engineAge;

        public void show(){
            System.out.println(engineName);
            //内部类可以直接访问外部类的成员.
            //包括私有
            System.out.println(carName);
        }
    }
}

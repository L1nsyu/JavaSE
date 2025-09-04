package a12.面向对象进阶.匿名内部类;

public class Test {
    public static void main(String[] args) {
        //需要大家理解匿名内部类的格式 ,而不是死记硬背
        // new 类名或者接口名(){
        //   重写方法;
        // };


        //编写匿名内部类的代码
        //实现关系 --接口
        new Swim(){
            @Override
            public void swim() {
                System.out.println("重写了游泳的全部方法");
            }
        };

        //按照解构来说 这其实是匿名内部类的对象


        //继承关系 --类
        new Animal(){
          @Override
            public void eat() {
                System.out.println("重写了动物类的全部方法");
            }
        };


        //在测试类中调用下面的 method方法?
        //以前的方式如何调用?
        //要自己写一个子类继承Animal类
        //再创建子类的对象,传递给method方法
//        Dog d = new Dog();
//        method(d);

        //匿名内部类的使用场景
        //如果Dog类我只要用一次,那么还需要单独定义一个类,这太麻烦了
        //这时候就可以用到 匿名内部类

        method(
                new Animal(){
                    @Override
                    public void eat() {
                        System.out.println("狗不吃包子");
                    }
                }
                //这就相当于创建了继承了Animal类的子类的对象
                //然后把这个对象直接给 下面的方法
        );
    }

    public static void method(Animal a){
        //对于方法来说 就相当于
        //Animal(父类) a = new 子类;
        //标准的多态
        //编译看左边,运行看右边
        a.eat();
    }
}

package a12.面向对象进阶.接口多学三招.私有方法;

public interface InterA {
    public default void show1() {
        System.out.println("show1 方法开始执行了");
//        System.out.println("记录程序在运行过程中的各种细节,这里有100行代码");
//        show3();
    }

    public static void show2() {
        System.out.println("show2 方法开始执行了");
//        System.out.println("记录程序在运行过程中的各种细节,这里有100行代码");
//        show4();
    }

    //jdk9以前的做法 ,缺点是外界可以访问到show3 ,但是此行为没有任何意义
//    public default void show3() {
//        System.out.println("记录程序在运行过程中的各种细节,这里有100行代码");
//    }

    //普通的私有方法,给默认方法服务的
//    private void show3(){
//        System.out.println("记录程序在运行过程中的各种细节,这里有100行代码");
//    }

    //普通的私有方法,给静态方法服务的
//    private static void show4(){
//        System.out.println("记录程序在运行过程中的各种细节,这里有100行代码");
//    }
}

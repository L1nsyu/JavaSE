package b24.多线程_JUC.o1.多线程的第一种实现方式;

public class ThreadDemo1 {
    public static void main(String[] args) {
        /*⭐⭐⭐
         * 多线程的第一种启动方式:
         *   1.自己定义一个类继承Thread
         *   2.重写run方法
         *   3.创建子类的对象,并启动线程
         * */


        //创建线程对象
        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();

        //为它们命名以作区分
        mt1.setName("线程1");
        mt2.setName("线程2");

        //开启线程
        mt1.start();
        mt2.start();
    }
}

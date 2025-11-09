package b24.多线程_JUC.o7.礼让线程;

public class ThreadDemo7 {
    public static void main(String[] args) {
        /*(了解即可,经常用不到)⭐
         * public static void yield()        出让线程/礼让线程
         *
         * */


        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("飞机");
        t2.setName("坦克");

        t1.start();
        t2.start();

    }
}

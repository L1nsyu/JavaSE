package b24.多线程_JUC.o5.线程的优先级;

public class ThreadDemo5 {
    public static void main(String[] args) {
        /*⭐⭐⭐
         * setPriority(int newPriority)          设置线程的优先级
         * final int getPriority()               设置线程的优先级
         *
         * */

        //创建线程要执行的参数对象
        MyRunnable mr = new MyRunnable();

        //创建线程对象
        Thread t1 = new Thread(mr, "tank");
        Thread t2 = new Thread(mr, "plant");


        t1.setPriority(1);
        t2.setPriority(10);

        t1.start();
        t2.start();

/*
        //输出两个线程对象的优先级(默认情况下)
        System.out.println(t1.getPriority());//5
        System.out.println(t2.getPriority());//5
        //细节:
        */
        /*
         * 优先级最小是1
         *       默认是5
         *       最大是10
         * *//*


        //输出main函数的优先级
        System.out.println(Thread.currentThread().getPriority());//5
*/


    }
}

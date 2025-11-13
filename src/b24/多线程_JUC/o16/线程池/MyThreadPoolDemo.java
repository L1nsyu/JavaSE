package b24.多线程_JUC.o16.线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThreadPoolDemo {
    public static void main(String[] args) throws InterruptedException {
        /*
        *   public static ExecutorService newCachedThreadPool()                 创建一个没有上限的线程池
            public static ExecutorService newFixedThreadPool (int nThreads)      创建有上限的线程池
        *
        * */


        //1.创建线程池对象
        ExecutorService pool1 = Executors.newCachedThreadPool();

        //创建有上限的线程池
//        ExecutorService pool2 = Executors.newFixedThreadPool(3);

        //2.提交任务
        //在这种情况下,每一个任务提交给线程池后,线程池里面如果没有多余的线程,就会创建一个新的线程
        /*
        * 例如:
        *   线程池的反应:
            pool1 收到任务.
            它检查池子里有没有空闲的线程.发现一个都没有.
            根据 newCachedThreadPool 的规则,它立即创建一个新的线程,我们称之为 线程1 (比如 pool-1-thread-1).
            pool1 把这个 MyRunnable1 任务交给 线程1 去执行.
            *
            动作:main 方法以极快的速度,连续提交了剩下的三个任务.
                线程池的反应:这个过程和上面完全一样.
                提交第3个任务时,发现 线程1 和 线程2 都在忙,于是创建 线程3.
                提交第4个任务时,发现 线程1、线程2、线程3 都在忙,于是创建 线程4.
                提交第5个任务时,发现前4个线程都还在忙,于是创建 线程5.
            结果:最终,线程池中创建了 5个线程,分别对应你提交的 5个任务.这5个线程会同时运行,都在执行各自的 run() 方法（从1数到100）.
        * */
//        pool1.submit(new MyRunnable1());
//        pool1.submit(new MyRunnable1());
//        pool1.submit(new MyRunnable1());
//        pool1.submit(new MyRunnable1());
//        pool1.submit(new MyRunnable1());



        //在这种情况下,第一个任务交给线程池后,他会创建第一个线程用于处理第一个任务
        //处理完后,休息,此时的意义在于有充足的时间让创建出来的线程1 返回线程池
        //休息结束后,第二个任务出现
        //此时线程1 已经成功返回线程池等待任务,线程1会继续执行新任务

        pool1.submit(new MyRunnable2());
        Thread.sleep(1000);
        pool1.submit(new MyRunnable2());
        //pool-1-thread-1---
        //pool-1-thread-1---


        //3.销毁线程池
        pool1.shutdown();
    }
}

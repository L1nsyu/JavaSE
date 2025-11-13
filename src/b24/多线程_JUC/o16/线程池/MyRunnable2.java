package b24.多线程_JUC.o16.线程池;

public class MyRunnable2 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "---");
    }
}

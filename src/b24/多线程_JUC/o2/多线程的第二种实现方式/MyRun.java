package b24.多线程_JUC.o2.多线程的第二种实现方式;

public class MyRun implements Runnable {
    @Override
    public void run() {
        //书写线程要执行的代码
        for (int i = 0; i < 100; i++) {
            Thread t = Thread.currentThread();
            System.out.println(t.getName() + " helloworld");
        }
    }
}

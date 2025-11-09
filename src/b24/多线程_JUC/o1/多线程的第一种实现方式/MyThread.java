package b24.多线程_JUC.o1.多线程的第一种实现方式;

public class MyThread extends Thread {
    @Override
    public void run() {
        //书写线程要执行代码
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + "HelloWorld");
        }
    }
}

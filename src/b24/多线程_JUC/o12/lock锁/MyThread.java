package b24.多线程_JUC.o12.lock锁;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread {

    //表示这个类所有的对象,都共享ticket数据
    static int ticket = 0; //0~99

    //注意:Lock是一个接口 ,创建对象要通过他的实现类对象 ReentrantLock
    static Lock lock = new ReentrantLock();

    @Override
    public void run() {
        //1.循环
        while (true) {
            //2.同步代码块
            lock.lock();
            try {
                //3.判断
                if (ticket == 100) {
                    break;
                } else {
                    //4.判断
                    Thread.sleep(10);
                    ticket++;
                    System.out.println(getName() + "正在卖第" + ticket + "张票");
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        }
    }
}

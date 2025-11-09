package b24.多线程_JUC.o10.同步代码块和两个小细节;

public class MyThread extends Thread {

    //表示这个类所有的对象,都共享ticket数据
    static int ticket = 0; //0~99

    //锁对象,一定要是唯一的
    //利用static 使对象唯一
    static Object obj = new Object();

    /*
    * 细节1:synchronized() 一定要写在while循环里面
    * 细节2:锁对象 一定要是唯一的,如果不唯一就相当于 各自拥有不同的锁,就没有任何的意义了
    *       此外,锁对象也可以用 MyThread.class表示 因为在一个类中,class是唯一的
    *
    * */

    @Override
    public void run() {
        while (true) {
            //同步代码块
            synchronized (obj) {
                if (ticket < 100) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    ticket++;
                    System.out.println(getName() + "正在卖第" + ticket + "张票");
                } else {
                    break;
                }
            }
        }
    }
}

package b24.多线程_JUC.o9.线程的安全问题;

public class MyThread extends Thread {

    //表示这个类所有的对象,都共享ticket数据
    static int ticket = 0; //0~99

    //没有static的情况下,每一个窗口都会独立计算,卖的就是300张票
    //int ticket = 0;
    @Override
    public void run() {
        while (true) {
            if (ticket < 100){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                ticket++;
                System.out.println(getName() +"正在卖第" + ticket +"张票");
            }else {
                break;
            }
        }
    }
}

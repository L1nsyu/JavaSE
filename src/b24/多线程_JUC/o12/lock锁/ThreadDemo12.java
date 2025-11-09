package b24.多线程_JUC.o12.lock锁;

public class ThreadDemo12 {
    public static void main(String[] args) {
        /*
         * 需求:
         *   某电影院目前正在上映国产大片,共有100张票,而它有3个窗口卖票，请设计一个程序模拟该电影院卖票
         * */

        //创建线程对象
        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();
        MyThread mt3 = new MyThread();

        //起名字
        mt1.setName("窗口1");
        mt2.setName("窗口2");
        mt3.setName("窗口3");

        //开启线程
        mt1.start();

        mt2.start();

        mt3.start();

        //目前的问题依然有些许错误,解决方法在下一P
    }
}

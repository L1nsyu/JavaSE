package b24.多线程_JUC.o7.礼让线程;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + "@" + i);

            //表示出让当前CPU的执行权
            //只是出让下一次的执行权,从而尽可能让结果均匀一点
            Thread.yield();


        }
    }
}

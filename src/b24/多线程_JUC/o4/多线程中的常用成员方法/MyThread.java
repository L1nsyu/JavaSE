package b24.多线程_JUC.o4.多线程中的常用成员方法;

public class MyThread extends Thread {

    //细节2:
    //父类的构造方法子类无法继承
    //需要自己调用super关键字来构建
    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(getName() + "hello");
        }
    }
}

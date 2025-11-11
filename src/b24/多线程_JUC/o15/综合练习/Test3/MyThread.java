package b24.多线程_JUC.o15.综合练习.Test3;

import java.util.ArrayList;
import java.util.Collections;

public class MyThread extends Thread {
    ArrayList<Integer> list;

    public MyThread(ArrayList<Integer> list) {
        this.list = list;
    }


    //线程1:
    static ArrayList<Integer> list1 = new ArrayList<>();
    //线程2:
    static ArrayList<Integer> list2 = new ArrayList<>();

    @Override
    public void run() {

        //1.循环
        while (true) {
            synchronized (MyThread.class) {
                //2.同步代码块
                if (list.isEmpty()) {
                    /*
                    *   break 的作用域：break 只对当前线程、当前循环有效.
                    *   线程的独立性：两个线程是并发执行的,一个线程的结束不代表另一个线程会立即停止.另一个线程必须自己走到循环的判断条件处,自己判断是否应该退出.
                    *   共享数据的状态：正是因为 list 是共享的,一个线程清空了它,另一个线程才能在下一次检查时发现它空了,从而触发自己的退出逻辑.
                    * */
                    if ("抽奖箱1".equals(getName())) {
                        System.out.println("抽奖箱1" + list1);
                    } else {
                        System.out.println("抽奖箱2" + list2);
                    }
                    //3.判断
                    break;
                } else {
                    //4.判断
                    //继续抽奖
                    Collections.shuffle(list);
                    Integer random = list.get(0);
                    list.remove(random);
                    if ("抽奖箱1".equals(getName())) {
                        list1.add(random);
                    } else {
                        list2.add(random);
                    }
                }
            }
            //在 同步代码块外 休眠
            //目的为了让两个箱子的数据均匀
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

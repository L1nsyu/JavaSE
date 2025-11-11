package b24.多线程_JUC.o15.综合练习.Test2;

import java.util.ArrayList;
import java.util.Collections;

public class MyThread extends Thread {
    ArrayList<Integer> list;

    public MyThread(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        //1.循环
        //2.同步代码块
        //3.判断
        //4.判断

        //1.循环
        while (true) {
            synchronized (MyThread.class) {
                //2.同步代码块
                if (list.isEmpty()) {
                    //3.判断
                    break;
                } else {
                    //4.判断
                    //继续抽奖
                    Collections.shuffle(list);
                    Integer random = list.get(0);
                    list.remove(random);
                    System.out.println(getName() + "产生了一个" + random + "元大奖");
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

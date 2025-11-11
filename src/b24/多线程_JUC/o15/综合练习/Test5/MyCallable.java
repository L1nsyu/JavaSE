package b24.多线程_JUC.o15.综合练习.Test5;

import b24.多线程_JUC.o15.综合练习.Test4.MyThread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {

    ArrayList<Integer> list;

    public MyCallable(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public Integer call() throws Exception {
        ArrayList<Integer> boxList = new ArrayList<>();

        //1.循环
        while (true) {
            synchronized (MyThread.class) {
                //2.同步代码块
                if (list.isEmpty()) {
                    System.out.println(Thread.currentThread().getName() + boxList);
                    //3.判断
                    break;
                } else {
                    //4.判断
                    //继续抽奖
                    Collections.shuffle(list);
                    Integer random = list.get(0);
                    list.remove(random);
                    boxList.add(random);
                }
            }
            Thread.sleep(10);
        }

        //把集合中的最大值返回
        if (boxList.size() == 0) {
            return null;
        } else {
            return Collections.max(boxList);
        }
    }
}

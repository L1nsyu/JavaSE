package b24.多线程_JUC.o15.综合练习.Test4;

import java.util.ArrayList;
import java.util.Collections;

public class MyThread extends Thread {
    ArrayList<Integer> list;

    public MyThread(ArrayList<Integer> list) {
        this.list = list;
    }


    //如果此时我不是只有两个线程呢?那代码该如何写? 我们难道要一个一个创建集合吗?
/*
    //线程1:
    static ArrayList<Integer> list1 = new ArrayList<>();
    //线程2:
    static ArrayList<Integer> list2 = new ArrayList<>();
*/


    @Override
    public void run() {

        //新思想:
        //在方法里面创建各自的集合
        /*
        * 简单理解:
        *   我们本身创建了几条线程 就会在底层生成 相应数量的 栈 ,每一个线程都有属于自己对应的栈,
        *   比如我们 创建了 三条线程 就会出现 三个对应的栈
        *   而且main函数他本省也有属于自己的main栈
        *
        *   所以相应的 ,当我们在方法内生成集合, 每一个线程 在他们的栈内生成的 集合也是 不同的
        * */
        ArrayList<Integer> boxList = new ArrayList<>();

        //1.循环
        while (true) {
            synchronized (MyThread.class) {
                //2.同步代码块
                if (list.isEmpty()) {
                    System.out.println(getName() + boxList);
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

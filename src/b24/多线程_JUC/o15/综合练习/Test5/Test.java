package b24.多线程_JUC.o15.综合练习.Test5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /*
         * 在上一题基础上继续完成如下需求:
         * 在此次抽奖过程中,抽奖箱1总共产生了6个奖项,分别为:10,20,100,500,2,300
         * 最高奖项为300元,总计额为932元
         * 在此次抽奖过程中,抽奖箱2总共产生了6个奖项,分别为:5,50,200,800,80,700
         * 最高奖项为800元,总计额为1835元
         * 在此次抽奖过程中,抽奖箱2中产生了最大奖项,该奖项金额为800元
         * 以上打印效果只是数据模拟,实际代码运行的效果会有差异
         * */

        //创建奖池
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 10, 5, 20, 50, 100, 200, 580, 880, 2, 80, 300, 700);

        //创建多线程要运行的参数对象
        MyCallable mc = new MyCallable(list);

        //创建多线程运行结果的管理者对象
        //线程1
        FutureTask<Integer> ft1 = new FutureTask<>(mc);
        //线程2
        FutureTask<Integer> ft2 = new FutureTask<>(mc);

        //创建线程对象
        Thread t1 = new Thread(ft1);
        Thread t2 = new Thread(ft2);

        //设置名字
        t1.setName("抽奖箱1");
        t2.setName("抽奖箱2");

        //开启线程
        t1.start();
        t2.start();

        Integer max1 = ft1.get();
        Integer max2 = ft2.get();

        System.out.println(max1);
        System.out.println(max2);


    }
}

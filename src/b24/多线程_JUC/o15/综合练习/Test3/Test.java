package b24.多线程_JUC.o15.综合练习.Test3;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        /*
         * 在上一题基础上继续完成如下需求:
         * 每次抽的过程中,不打印,抽完时一次性打印(随机)
         * 在此次抽奖过程中,抽奖箱1总共产生了6个奖项.
         * 分别为:10,20,100,500,2,300最高奖项为300元,总计额为932元
         * 在此次抽奖过程中,抽奖箱2总共产生了6个奖项.
         * 分别为:5,50,200,800,80,700最高奖项为800元,总计额为1835元
         * */

        //为什么使用集合而不用数组,
        //因为集合的长度不是固定的 想删就删 而数组反之
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 10, 5, 20, 50, 100, 200, 580, 880, 2, 80, 300, 700);

        //创建线程
        MyThread mt1 = new MyThread(list);
        MyThread mt2 = new MyThread(list);

        //设置名字
        mt1.setName("抽奖箱1");
        mt2.setName("抽奖箱2");

        //启动线程
        mt1.start();
        mt2.start();

    }
}

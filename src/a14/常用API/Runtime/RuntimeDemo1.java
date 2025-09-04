package a14.常用API.Runtime;

import java.io.IOException;

public class RuntimeDemo1 {
    public static void main(String[] args) throws IOException {
        //public static Runtime getRuntime()    当前系统的运行环境对象
        //public void   exit(int status)        停止虚拟机
        //public int    availableProcessors()   获得CPU的线程数
        //public long   maxMemory()             JVM能从系统中获取总内存大小(单位byte)
        //public long   totalMemory()           JVM已经从系统中获取总内存大小(单位byte)
        //public long   freeMemory()            JVM剩余内存大小(单位byte)
        //public Process exec(String command)   运行cmd命令

        //1.获取Runtime的对象 (虚拟机只允许有一个Runtime对象)
        //Runtime r1 = Runtime.getRuntime();

        //2.exit 停止虚拟机
        //Runtime r1 = Runtime.getRuntime();
        //r1.exit(1);
        //System.out.println("看看我执行了吗");

        //3.获得CPU的 线程数
        //System.out.println(Runtime.getRuntime().availableProcessors());//8

        //4.总内存大小,单位byte字节
        System.out.println(Runtime.getRuntime().maxMemory()/1024/1024);//4048

        //5.已经获取的总内存大小,单位byte字节
        System.out.println(Runtime.getRuntime().totalMemory()/1024/1024);//254

        //6.剩余内存大小
        System.out.println(Runtime.getRuntime().freeMemory()/1024/1024);//249

        //7.运行cmd命令
        //shutdown :关机
        //加上参数才能执行
        //-s : 默认在一分钟后关机
        //-s -t 指定时间 :指定时间关机
        //-a : 取消关机操作
        //-r : 关机并重启
        //shutdown -s -t 18000
        System.out.println(Runtime.getRuntime().exec("shutdown -a"));
    }
}

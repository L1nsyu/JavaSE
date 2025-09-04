package a14.常用API.JDK7时间.Date;

import java.util.Date;

public class DateDemo1 {
    public static void main(String[] args) {
        //public Date()                 创建Date对象，表示当前时间
        //public Date(long date)        创建Date对象，表示指定时间

        //public void setTime(long time)    设置/修改毫秒值
        //public long getTime()             获取时间对象的毫秒值

        //1.创建对象表示一个时间
        Date d = new Date();
        System.out.println(d);

        System.out.println("--------------------------------");
        //2.创建对象表示一个指定的时间
        Date d2 = new Date(0L);
        Date d3 = new Date(0L);
        System.out.println(d2);

        //3.setTime 修改时间
        //1000毫秒 = 1秒
        d2.setTime(0L);
        d3.setTime(1000L);
        System.out.println(d2);//Thu Jan 01 08:00:00 CST 1970
        System.out.println(d3);//Thu Jan 01 08:00:01 CST 1970
        System.out.println("--------------------------------");
        //4.getTime 获取当前时间的毫秒值
        long time = d3.getTime();
        System.out.println(time);//1000
    }
}

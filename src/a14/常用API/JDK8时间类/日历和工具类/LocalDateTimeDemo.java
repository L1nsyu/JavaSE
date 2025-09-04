package a14.常用API.JDK8时间类.日历和工具类;

import java.time.LocalTime;

public class LocalDateTimeDemo {
    public static void main(String[] args) {
        //获取本地时间的日历对象(包含 时分秒)
        LocalTime nowTime = LocalTime.now();
        System.out.println(nowTime);

        int hour = nowTime.getHour();//时
        System.out.println(hour);

        int minute = nowTime.getMinute();//分
        System.out.println(minute);

        int second = nowTime.getSecond();//秒
        System.out.println(second);

        int nano = nowTime.getNano();//纳秒
        System.out.println(nano);

        System.out.println("----------------------------------");
        System.out.println(LocalTime.of(8,20));//时分
        System.out.println(LocalTime.of(1,2,3));//时分秒
        System.out.println(LocalTime.of(1,2,3,4));//时分秒纳秒
        LocalTime mTime = LocalTime.of(8,20,30,150);

        //is系列的方法
        System.out.println(nowTime.isBefore(mTime));
        System.out.println(nowTime.isAfter(mTime));

        //with系列的方法,只能修改时分秒
        System.out.println(nowTime.withHour(10));

        //minus系列的方法,只能修改时分秒
        System.out.println(nowTime.minusHours(10));

        //plus系列的方法,只能修该时分秒
        System.out.println(nowTime.plusHours(10));
    }
}

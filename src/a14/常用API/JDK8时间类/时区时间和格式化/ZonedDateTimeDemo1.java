package a14.常用API.JDK8时间类.时区时间和格式化;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeDemo1 {
    public static void main(String[] args) {
        //static ZonedDateTime now()                获取当前时间的ZonedDateTime对象
        // static ZonedDateTime ofXxxx(。。。)         获取指定时间的ZonedDateTime对象
        // ZonedDateTime withXxx(时间)            修改时间系列的方法
        // ZonedDateTime minusXxx(时间)           减少时间系列的方法
        // ZonedDateTime plusXxx(时间)            增加时间系列的方法


        //1.获取当前时间对象(带时区)
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);//2025-08-27T19:49:31.248454500+08:00[Asia/Shanghai]

        //2.获取指定的时间对象(带时区)
        //年月日时分秒纳秒 方式指定
        ZonedDateTime time1 = ZonedDateTime.of(2023, 10, 1,
                11, 12, 12, 0, ZoneId.of("Asia/Shanghai"));
        System.out.println(time1);//2023-10-01T11:12:12+08:00[Asia/Shanghai]

        //通过Instant + 时区的方式指定获取时间对象
        Instant instant = Instant.ofEpochMilli(0L);
        ZoneId zoneId = ZoneId.of("Asia/Shanghai");
        ZonedDateTime time2 = ZonedDateTime.ofInstant(instant, zoneId);
        System.out.println(time2);//1970-01-01T08:00+08:00[Asia/Shanghai]

        //3.withXxx 修改时间系列的方法
        ZonedDateTime time3 = time2.withYear(2023);
        System.out.println(time3);//2023-01-01T08:00+08:00[Asia/Shanghai]

        //4.减少时间
        ZonedDateTime time4 = time3.minusYears(1);
        System.out.println(time4);//2022-01-01T08:00+08:00[Asia/Shanghai]

        //5.增加时间
        ZonedDateTime time5 = time4.plusYears(1);
        System.out.println(time5);//2023-01-01T08:00+08:00[Asia/Shanghai]

        //细节:
        //JDK8 新增的时间对象都是不可改变的
        //如果我们修改了,减少了,增加了时间
        //那么调用者是不会发生改变的,会产生一个新的时间
    }
}

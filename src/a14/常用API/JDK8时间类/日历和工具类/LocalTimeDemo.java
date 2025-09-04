package a14.常用API.JDK8时间类.日历和工具类;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalTimeDemo {
    public static void main(String[] args) {
        //当前时间的日历对象(包含 年月日时分秒)
        LocalDateTime nowDateTime = LocalDateTime.now();

        System.out.println("今天是:"+nowDateTime);
        System.out.println(nowDateTime.getYear());
        System.out.println(nowDateTime.getMonthValue());
        System.out.println(nowDateTime.getDayOfMonth());
        System.out.println(nowDateTime.getHour());
        System.out.println(nowDateTime.getMinute());
        System.out.println(nowDateTime.getSecond());
        System.out.println(nowDateTime.getNano());

        //日: 当年的第几天
        System.out.println(nowDateTime.getDayOfYear());

        //月份
        System.out.println(nowDateTime.getMonth());
        System.out.println(nowDateTime.getDayOfMonth());

        //星期
        System.out.println(nowDateTime.getDayOfWeek());
        System.out.println(nowDateTime.getDayOfWeek().getValue());

        LocalDate ld = nowDateTime.toLocalDate();
        System.out.println(ld);

        LocalTime lt = nowDateTime.toLocalTime();
        System.out.println(lt.getHour());
        System.out.println(lt.getMinute());
        System.out.println(lt.getSecond());
    }
}

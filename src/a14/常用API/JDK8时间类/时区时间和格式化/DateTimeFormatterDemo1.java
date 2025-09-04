package a14.常用API.JDK8时间类.时区时间和格式化;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterDemo1 {
    public static void main(String[] args) {
//    static DateTimeFormatter ofPattern(格式)          获取格式对象
//    String format(时间对象)                           按照指定方式格格式化

        //获取时间对象
        ZonedDateTime time = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));

        //解析/格式化器
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss EE a");

        //格式化
        System.out.println(dtf1.format(time));//2025-08-28 15:19:04 周四 下午
    }
}

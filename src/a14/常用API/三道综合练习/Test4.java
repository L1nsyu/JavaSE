package a14.常用API.三道综合练习;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Test4 {
    public static void main(String[] args) throws ParseException {
        //请使用代码实现计算你活了多少天,用JDK7和JDK8两种方式完成

        //JDK7
        //规则:只要对时间进行计算和判断,都需要先获取当前时间的毫秒值
        //1.计算出出生年月日的毫秒值
        String birthday = "2002年7月28日";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = sdf.parse(birthday);
        long birthdayTime = date.getTime();

        //2.获取当前时间的毫秒值
        long nowTime = System.currentTimeMillis();

        //3.计算间隔多少天
        long gapTime = nowTime - birthdayTime;

        System.out.println(gapTime / 1000 / 60 / 60 / 24);
        //当前时间
        System.out.println();//8432


        //JDK8
        LocalDate ld1 = LocalDate.of(2002, 7, 28);
        LocalDate ld2 = LocalDate.now();

        //参数计算的规则是第二个参数减去第一个参数
        System.out.println(ChronoUnit.DAYS.between(ld1, ld2));//8433
    }
}

package a14.常用API.三道综合练习;

import java.time.LocalDate;
import java.util.Calendar;

public class Test5 {
    public static void main(String[] args) {
        //判断任意的一个年份是闰年还是平年
        //要求: 用JDK7 和 JDK8 两种方式判断
        //提示:
        //二月右29天是闰年
        //一年有366天是闰年

        //JDk7
        //简化1:
        //我们可以把时间设置为2000年3月1日
        Calendar c1 = Calendar.getInstance();
        c1.set(2000, 2, 1);//月份的范围:0~11
        c1.add(Calendar.DAY_OF_MONTH, -1);
        int day = c1.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);//29

        Calendar c2 = Calendar.getInstance();
        c2.set(2001, 0, 1);
        c2.add(Calendar.DAY_OF_MONTH, -1);
        int day2 = c2.get(Calendar.DAY_OF_YEAR);
        System.out.println(day2);//366


        //JDk8
        //月份的范围:1~12
        //设定时间为2000年的3月1日
        LocalDate ld = LocalDate.of(2000, 3, 1);
        //把时间往前减一天
        LocalDate ld2 = ld.minusDays(1);
        //获取这一天是一个月中的几号
        int day1 = ld2.getDayOfMonth();
        System.out.println(day1);//29


        //true:闰年
        //false:平年
        System.out.println(ld.isLeapYear());//true
    }
}

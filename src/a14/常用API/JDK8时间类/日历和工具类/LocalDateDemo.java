package a14.常用API.JDK8时间类.日历和工具类;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;

public class LocalDateDemo {
    public static void main(String[] args) {
        //1.获取当前时间的日历对象 (包含年月日)
        LocalDate nowDate = LocalDate.now();
        System.out.println(nowDate);//2025-08-28

        //2.获取指定的时间的日历对象
        LocalDate ldDate = LocalDate.of(2023, 1, 1);
        System.out.println(ldDate);//2023-01-01
        System.out.println("-----------------------------");

        //3.get系列方法获取日历中的每一个属性值
        //获取年
        int year = ldDate.getYear();
        System.out.println(year);

        //获取月
        //方式1:
        Month m = ldDate.getMonth();
        System.out.println(m);//JANUARY
        System.out.println(m.getValue());//1
        //方式2:
        int month = ldDate.getMonthValue();
        System.out.println(month);//1

        //获取日
        int day = ldDate.getDayOfMonth();
        System.out.println(day);//1

        System.out.println("-----------------------------");

        //获取一年的第几天
        int dayOfYear = ldDate.getDayOfYear();
        System.out.println(dayOfYear);//1

        //获取星期
        DayOfWeek dayOfWeek = ldDate.getDayOfWeek();
        System.out.println(dayOfWeek);//SUNDAY
        System.out.println(dayOfWeek.getValue());//7
        System.out.println("-----------------------------");

        //is开头的方法表示判断
        System.out.println(ldDate.isBefore(nowDate));
        System.out.println(ldDate.isAfter(nowDate));

        System.out.println("-----------------------------");
        //with开头的方法表示修改 ,只能修改年月日
        LocalDate withLocalDate = ldDate.withYear(2000);
        System.out.println(withLocalDate);//2000-01-01

        //mius开头的方法表示减少,只能减少年月日
        LocalDate miusLocalDate = ldDate.minusYears(1);
        System.out.println(miusLocalDate);

        //plus开头的方法表示增加,只能增加年月日
        LocalDate plusLocalDate = ldDate.plusYears(1);
        System.out.println(plusLocalDate);

        System.out.println("-----------------------------");
        //判断今天是否是你的生日
        LocalDate birDate = LocalDate.of(1970, 8, 28);
        LocalDate nowDate1 = LocalDate.now();

        MonthDay birMD = MonthDay.of(birDate.getMonth(), birDate.getDayOfMonth());
        MonthDay nowMD = MonthDay.now();

        System.out.println("今天是你的生日吗?"+ birMD.equals(nowMD));
    }
}

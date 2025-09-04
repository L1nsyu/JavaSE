package a14.常用API.JDK7时间.Calender;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo1 {
    public static void main(String[] args) {
        //public static calendar getInstance()          获取当前时间的日历对象⭐

        //public final Date getTime()                   获取日期对象给
        //public final setTime(Date date)               日历设置日期对象

        //public long getTimeInMillis()                 拿到时间毫秒值
        //public void setTimenMillis(long millis)       给日历设置时间毫秒值

        //public int get(int field)                     给日历设置时间毫秒值⭐
        //public void set(int field int value)          取日期中的某个字段信息修改日历的某个字段信息⭐
        //public void add(int field,int amount)         为某个字段增加/减少指定的值⭐


        //1.获取日历对象⭐
        //细节:Calendar 是一个抽象类,不能直接new,而是通过一个静态方法获取到子类对象
        //底层原理:
        //会根据系统的不同时区来获取不同的日历对象,默认表示当前时间
        //会把时间中的纪元,年,月,日,时,分,秒,星期,等等的都放到一个数组当中
        //在Calendar 的对象c中其实 隐藏着一个数组
        //0 :纪元
        //1 :年
        //2 :月
        //3 :一年中的第几周
        //4 :一个月中的第几周
        //5 :一个月中的第几天(日期)
        //........


        //细节2:
        //月份:范围0~11 如果获取出来的是0,那么实际上是1月.
        //星期: 在老外的眼里,星期日是一周中的第一天
        //   1(星期日)   2(星期一)  3()   4()    5()    6()    7(星期六)
        Calendar c = Calendar.getInstance();
        System.out.println(c);

        //2.修改一下日历代表的时间
        Date d = new Date(0L);
        c.setTime(d);
        System.out.println(c);


        //public int get(int field)                     给日历设置时间毫秒值
        //public void set(int field int value)          取日期中的某个字段信息修改日历的某个字段信息
        //public void add(int field,int amount)         为某个字段增加/减少指定的值

        c.set(Calendar.YEAR, 2020);
        c.set(Calendar.MONTH, 11);
        //2020,12,1,星期二
/*        c.set(Calendar.MONTH, 999);//999
        //2104,4,1,星期六*/

        //调用方法在基础上增加一个月 参数也可以是负的 就是减少一个月
        c.add(Calendar.MONTH, 1);

        //java在Calendar这个类中,把索引对于的数字都定义成了常量
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int day = c.get(Calendar.DAY_OF_MONTH);
        int week = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(year + "," + month + "," + day + "," + getWeek(week));//1970,1,1,5?  1970,1,1,星期四
    }

    //查表法:⭐
    //表:容器
    //让数据跟索引产生对应关系
    //传入对应的数字:1~7
    //返回对应的星期
    public static String getWeek(int index) {
        //定义一个数组,让汉字星期几,跟1~7产生对应关系
        //   1(星期日)   2(星期一)  3()   4()    5()    6()    7(星期六)
        String[] arr = {"", "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
        //根据索引返回对应的星期
        return arr[index];
    }
}

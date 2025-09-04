package a14.常用API.JDK8时间类.时区时间和格式化;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdDemo1 {
    public static void main(String[] args) {
        //static set<string>getAvailableZoneIds()   获取Java中支持的所有时区
        //static ZoneId systemDefault()             获取系统默认时区
        //static ZoneId of(string zoneId)           获取一个指定时区


        //1.获取所有的时区名称
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(zoneIds);//Asia/Shanghai
        System.out.println(zoneIds.size());//600 :在ZoneId的数组内,有600个时区

        //2.获取当前系统的默认时区
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);//Asia/Shanghai

        //3.获取指定的时区
        ZoneId zoneId1 = ZoneId.of("Africa/Nairobi");
        System.out.println(zoneId1);//Africa/Nairobi


    }
}

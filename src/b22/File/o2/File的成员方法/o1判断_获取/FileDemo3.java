package b22.File.o2.File的成员方法.o1判断_获取;

import java.io.File;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class FileDemo3 {
    public static void main(String[] args) {
/*      public long length()                返回文件的大小(字节数量)
        public String getAbsolutePath()     返回文件的绝对路径
        public String getPath()             返回定义文件时使用的路径
        public String getName()             返回文件的名称,带后缀
        public long lastModified()          返回文件的最后修改时间(时间毫秒值)
        */

        //1.length  返回文件的大小(字节数量)
        //细节1:这个方法只能获取文件的大小,单位是字节
        //如果单位我们要是M,G ,可以不断除以1024;
        //细节2:这个方法无法获取文件夹的大小(输出4096的情况也是错误的)
        //如果我们要获取一个文件夹的大小,需要把这个文件夹里面的所有的文件大小都累加在一起

        File f1 = new File("C:\\Users\\lsy\\Desktop\\css\\heimaTest.txt");
        long len = f1.length();
        System.out.println(len);//0

        File f2 = new File("C:\\Users\\lsy\\Desktop\\css\\b站视频");
        long len2 = f2.length();
        System.out.println(len2);//4096


        System.out.println("-----------------------");

        //2.getAbsolutePath     返回文件的绝对路径
        File f3 = new File("JavaSE\\Test.txt");
        String path1 = f3.getAbsolutePath();
        System.out.println(path1);//F:\lsyCode\JavaCode\JavaSE\JavaSE\Test.txt

        System.out.println("-----------------------");

        //3.getPath            返回定义文件时使用的路径
        File f4 = new File("JavaSE\\Test.txt");
        String path2 = f4.getPath();
        System.out.println(path2);//JavaSE\Test.txt

        System.out.println("-----------------------");

        //4.getName             返回文件的名称,带后缀
        //细节1:
        //a.txt
        //      a 文件名
        //      txt 后缀名,扩展名
        //细节2:
        //文件夹:返回的就是文件夹的名字

        File f5 = new File("C:\\Users\\lsy\\Desktop\\css\\heimaTest.txt");
        String name1 = f5.getName();
        System.out.println(name1);//heimaTest.txt

        File f6 = new File("C:\\Users\\lsy\\Desktop\\css\\b站视频");
        String name2 = f6.getName();
        System.out.println(name2);//b站视频

        System.out.println("-----------------------");
        //5.lastModified       返回文件的最后修改时间(时间毫秒值)
        File f7 = new File("C:\\Users\\lsy\\Desktop\\css\\heimaTest.txt");
        long time = f7.lastModified();
        System.out.println(time);//1760262057083

        //如何把时间的毫秒值变成字符串表示的时间呢?
        //课堂练习:
        //yyyy年MM月dd日 HH:mm:ss
        System.out.println("毫秒值是:"+time);

        // --- 第1步: 将 long 毫秒值转换为 Instant 对象 ---
        Instant ins = Instant.ofEpochMilli(time);

        // --- 第2步: 确定目标时区 ---
        ZonedDateTime zone = ins.atZone(ZoneId.of("Asia/Shanghai"));

        //解析/格式化器
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");

        //格式化
        System.out.println(dtf1.format(zone));


    }
}

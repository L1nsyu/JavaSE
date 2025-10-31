package b23.IO流.o31.综合练习.o1.网络爬虫;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {
    public static void main(String[] args) throws IOException {
        /*
         * 制造假数据:
         *       获取姓氏:https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d
         *       获取男生名字:https://zhidao.baidu.com/question/1054067332199024699.html
         *       获取女生名字:http://www.haoming8.cn/baobao/7641.html
         * */

        //1.定义变量记录网址
        String familyNameNet = "https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d";
        String boyNameNet = "https://zhidao.baidu.com/question/1054067332199024699.html";
        String girlNameNet = "http://www.haoming8.cn/baobao/7641.html";

        //2.爬取数据,吧网址上所有的数据拼接成一个字符串
        String familyNameStr = webCrawler(familyNameNet);
        String boyNameStr = webCrawler(boyNameNet);
        String girlNameStr = webCrawler(girlNameNet);

        //3.通过正则表达式,把其中符合要求的数据获取出来
        //知识点:捕获分组
        //(.{4})(，|。) ---> (\\W{4})(，|。)  因为匹配问题的原因,需要跟换
        ArrayList<String> familyNameTempList = getData(familyNameStr, "(\\W{4})(，|。)", 1);
        System.out.println(familyNameTempList);
    }


    /*
     * 作用:根据正则表达式获取字符串中的数据
     * 参数1:
     *   完整的字符串
     * 参数2:
     *   正则表达式
     * 参数3:
     *   ???
     * 返回值:
     *   真正想要的数据
     * */
    private static ArrayList<String> getData(String str, String regex, int index) {
        //1.创建集合存放数据
        ArrayList<String> list = new ArrayList<>();


        //2.按照正则表达式的规则,去获取数据
        Pattern pattern = Pattern.compile(regex);
        //按照pattern的规则,到str当中获取数据
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            list.add(matcher.group(index));
        }
        return list;
    }

    /*
     * 作用:
     *       从网络中爬取数据,吧数据拼接成字符串返回
     * 形参:
     *       网址
     * 返回值:
     *       爬取到的所有数据
     * */
    public static String webCrawler(String net) throws IOException {
        //1.定义StringBuilder 拼接爬取到的数据
        StringBuilder sb = new StringBuilder();
        //2.创建一个URL对象
        URL url = new URL(net);
        //3.链接上这个网址
        URLConnection conn = url.openConnection();
        //4.读取数据
        //注意:getInputStream 是一个字节流 ,如果遇到中文的情况下 应该使用字符流,所以需要通过转换流转换
        InputStream is = conn.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);

        int ch;
        while ((ch = isr.read()) != -1) {
            sb.append((char) ch);
        }

        //5.释放资源
        isr.close();
        //6.把读取到的数据返回
        return sb.toString();
    }
}

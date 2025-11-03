package b23.IO流.o31.综合练习.o1.网络爬虫;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
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
        String boyNameNet = "http://www.haoming8.cn/baobao/91450.html";
        String girlNameNet = "http://www.haoming8.cn/baobao/7641.html";

        //2.爬取数据,吧网址上所有的数据拼接成一个字符串
        String familyNameStr = webCrawler(familyNameNet);
        String boyNameStr = webCrawler(boyNameNet);
        String girlNameStr = webCrawler(girlNameNet);

        //3.通过正则表达式,把其中符合要求的数据获取出来
        //知识点:捕获分组
        //(.{4})(，|。) ---> (\\W{4})(，|。)  因为匹配问题的原因,需要跟换
        ArrayList<String> familyNameTempList = getData(familyNameStr, "(\\W{4})(，|。)", 1);
        ArrayList<String> girlNameTempList = getData(girlNameStr, "(.. ){4}..", 0);
        ArrayList<String> boyNameTempList = getData(boyNameStr, "(..、){3}..", 0);


        //4.处理数据
        //familyNameTempList(姓氏)
        //处理方案:把每一个姓氏拆开并添加到一个新的集合当中
        ArrayList<String> familyNameList = new ArrayList<>();
        for (String str : familyNameTempList) {
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                familyNameList.add(c + "");
            }
        }

        //boyNameTempList(男生的名字)
        //处理方案:去除其中的重复元素
        ArrayList<String> boyNameList = new ArrayList<>();
        for (String str : boyNameTempList) {
            //str --> 宇新、颂霖、艺杰、泽森, 明乐、欢超、锐涵、开鸿
            String[] arr = str.split("、");
            for (int i = 0; i < arr.length; i++) {
                if (!boyNameList.contains(arr[i])) {
                    boyNameList.add(arr[i]);
                }
            }
        }

        //girlNameTempList(女生的名字)
        ArrayList<String> girlNameList = new ArrayList<>();
        for (String str : girlNameTempList) {
            //str -->彤舞 芊静 艾丝 惠蕙 语月, 依莹 瑶馨 曼珍 逸云 微婉,
            String[] arr = str.split(" ");
            for (int i = 0; i < arr.length; i++) {
                if (!girlNameList.contains(arr[i])) {
                    girlNameList.add(arr[i]);
                }
            }
        }

        //5.生成数据
        //姓名(唯一) - 性别 - 年龄
        ArrayList<String> list = getInfos(familyNameList, boyNameList, girlNameList, 10, 10);

        Collections.sort(list);
        System.out.println(list);


        //6.写出数据
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\lsy\\Desktop\\NewFileTest\\pachong.txt"));
        for (String str : list) {
            bw.write(str);
            bw.newLine();
        }
        bw.close();

    }

    /*
     * 作用:
     *       获取男生和女生的信息:张三-男-23
     *
     * 形参:
     *       参数1:装着姓氏的集合
     *       参数2:装着男生名字的集合
     *       参数3:装着女生名字的集合
     *       参数4:男生的个数
     *       参数5:女生的个数
     * */

    public static ArrayList<String> getInfos(ArrayList<String> familyNameList, ArrayList<String> boyNameList, ArrayList<String> girlNameList, int boyCount, int girlCount) {
        //1.生成不重复的男生的名字
        //张三-男-23
        HashSet<String> boyhs = new HashSet<>();
        while (true) {
            if (boyhs.size() == boyCount) {
                break;
            }

            //打乱集合,以获取随机值
            Collections.shuffle(familyNameList);
            Collections.shuffle(boyNameList);
            boyhs.add(familyNameList.get(0) + boyNameList.get(0));
        }


        //2.生成不重复的女生的名字
        HashSet<String> girlhs = new HashSet<>();
        while (true) {
            if (girlhs.size() == girlCount) {
                break;
            }

            //打乱集合,以获取随机值
            Collections.shuffle(familyNameList);
            Collections.shuffle(girlNameList);
            girlhs.add(familyNameList.get(0) + girlNameList.get(0));
        }


        //先生成一个集合用来存储男女的数据
        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();
        //3.生成男生的信息并添加到集合当中
        //张三-男-23
        //[18 - 27] ---> -18 ---> [0 - 9] ----> +1 ----> [0 - 10]
        for (String boyName : boyhs) {
            int i = r.nextInt(10) + 18;
            list.add(boyName + "-男-" + i);
        }
        //4.生成女生的信息并添加到集合当中
        //[18 - 27] ---> -18 ---> [0 - 9] ----> +1 ----> [0 - 10]
        for (String girlName : girlhs) {
            int i = r.nextInt(10) + 18;
            list.add(girlName + "-女-" + i);
        }

        return list;
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

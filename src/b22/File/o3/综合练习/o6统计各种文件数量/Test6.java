package b22.File.o3.综合练习.o6统计各种文件数量;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test6 {
    public static void main(String[] args) {
        //需求:统计一个文件夹中每种文件的个数并打印.(考虑子文件夹)
        //打印格式如下:
        //txt:3个        doc:4个      jpg:6个

        File f = new File("C:\\Users\\lsy\\Desktop\\FileTest");
        HashMap<String, Integer> count = getCount(f);
        System.out.println(count);

    }

    /*
    作用:统计一个文件夹中每种文件的个数
    参数:要统计的那个文件夹
    返回值:用来统计map集合
            键:后缀名   值:次数
    */

    public static HashMap<String, Integer> getCount(File src) {
        //1.定义HashMap集合用来统计
        HashMap<String, Integer> map = new HashMap<>();

        //2.先进入src文件
        File[] files = src.listFiles();
        //遍历数组获取所有文件
        for (File file : files) {
            if (file.isFile()) {//a.txt
                //3.判断如果file 是 文件的情况
                String name = file.getName();
                //因为只要后缀部分所以从.开始切割,但是 . 是有意义的,代表所有类型的符号,所以需要转义字符
                String[] arr = name.split("\\.");
                if (arr.length >= 2) {
                    String endName = arr[arr.length - 1];
                    if (map.containsKey(endName)) {
                        //如果集合内已经包含该后缀的情况
                        int count = map.get(endName);
                        count++;
                        map.put(endName, count);
                    } else {
                        //如果集合内不包含该后缀的情况
                        map.put(endName, 1);
                    }
                }


            } else {
                //4.判断如果file 是 文件夹的情况 -->递归
                //sonMap里面是子文件中每一种文件的个数
                HashMap<String, Integer> sonMap = getCount(file);
                //eg: txt=1  doc=2  jpg=4
                //sonMap" txt=3  jpg=1

                //遍历sonMap把里面的值累加到map当中
                Set<Map.Entry<String, Integer>> entries = sonMap.entrySet();
                for (Map.Entry<String, Integer> entry : entries) {
                    String key = entry.getKey();
                    int value = entry.getValue();
                    if (map.containsKey(key)) {
                        //存在
                        int count = map.get(key);
                        count = count + value;
                        map.put(key, count);
                    } else {
                        //不存在
                        map.put(key, value);
                    }
                }
            }
        }
        return map;
    }
}

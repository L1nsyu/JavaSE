package b17.集合进阶.综合练习.集合嵌套;

import java.util.*;

public class Test4 {
    public static void main(String[] args) {
        //需求
        //定义一个Map集合，键用表示省份名称province，值表示市city，但是市会有多个。
        // 添加完毕后，遍历结果格式如下:
        // 江苏省  =    南京市，扬州市，苏州市，无锡市，常州市
        // 湖北省  =    武汉市，孝感市，十堰市，宜昌市，鄂州市
        // 河北省  =    石家庄市，唐山市，邢台市，保定市，张家口市

        //1.创建Map的集合
        //没有要求排序也没有要求顺序,所以使用效率最高的HashMap
        HashMap<String, ArrayList<String>> map = new HashMap<>();

        //2.创建值(市)的集合
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "南京市", "扬州市", "苏州市", "无锡市", "常州市");
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "武汉市", "孝感市", "十堰市", "宜昌市", "鄂州市");
        ArrayList<String> list3 = new ArrayList<>();
        Collections.addAll(list3, "石家庄市", "唐山市", "邢台市", "保定市", "张家口市");

        //3.把省份和市区都添加进map集合
        map.put("江苏省", list1);
        map.put("湖北省", list2);
        map.put("河北省", list3);

        //4.依靠键值对的方法遍历集合
        Set<Map.Entry<String, ArrayList<String>>> entries = map.entrySet();
        for (Map.Entry<String, ArrayList<String>> entry : entries) {
            //entry依次表示每一个键值对对象
            String key = entry.getKey();
            ArrayList<String> value = entry.getValue();
            StringJoiner sj = new StringJoiner(",","","");
            for (String s : value) {
                sj.add(s);
            }
            System.out.println(key + " = " + sj);
        }
    }
}

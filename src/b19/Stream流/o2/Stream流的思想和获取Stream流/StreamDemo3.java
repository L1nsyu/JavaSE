package b19.Stream流.o2.Stream流的思想和获取Stream流;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StreamDemo3 {
    public static void main(String[] args) {
        //双列集合          无              无法直接使用stream流

        //1.创建一个双列集合⭐⭐
        HashMap<String, Integer> map = new HashMap<>();

        //2.添加数据
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        map.put("e", 5);

        //3.获取到一条流水线,并把集合当中的数据放到流水线上
        map.keySet().stream().forEach(s -> System.out.println(s));

        System.out.println("-------------------------------");

        map.entrySet().stream().forEach(s -> System.out.println(s));

    }
}

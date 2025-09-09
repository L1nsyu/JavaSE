package b17.集合进阶.Map集合的第一种遍历方式;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class MapDemo2 {
    public static void main(String[] args) {
        //Map集合的第一种遍历方式

        //1.创建Map集合的对象
        //因为Map是一个接口,所以要实现他的对象需要利用多态的方式以及他的实现类HashMap.
        Map<String, String> m = new HashMap<>();

        //2.添加元素
        m.put("尹志平", "小龙女");
        m.put("郭靖", "穆念慈");
        m.put("欧阳克", "穆念慈");

        //3.通过键找值
        //3.1获取所有的键,把这些键放到一个单列集合当中
        Set<String> keys = m.keySet();
        //3.2遍历单列集合,得到每一个键
//        增强for:
        for (String key : keys) {
//            System.out.println(key);
            //3.3利用map集合中的键获取对应的值 get
            String value = m.get(key);
            System.out.println(key + " = " + value);


/*        迭代器:
        Iterator<String> it = keys.iterator();
        while (it.hasNext()) {
            String next = it.next();
//            System.out.println(next);
            String value = m.get(next);
//            System.out.println(value);
            System.out.println(next + " = " + value);
        }
        */


/*
        lambda表达式
        keys.forEach(k -> {
//                System.out.println(k);
                    String value = m.get(k);
                    System.out.println(k + " : " + value);
                }
        );
*/

        }
    }
}

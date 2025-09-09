package b17.集合进阶.Map集合常用的API;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        //V put(K key,V value)                      添加元素
        //V remove(Object key)                      根据键删除键值对元素
        //void clear()                              移除所有的键值对元素
        //boolean containsKey(Object key)           判断集合是否包含指定的键
        //boolean containsValue(Object value)       判断集合是否包含指定的值
        //boolean isEmpty()                         判断集合是否为空
        //int size()                                集合的长度，也就是集合中键值对的个数


        //1.创建Map集合的对象
        Map<String, String> m = new HashMap<>();

        //2.添加元素
        //put方法的细节:
        // (添加/覆盖)
        //在添加数据的时候,如果键不存在,那么直接把键值对对象添加到map集合当中,方法返回null
        //在添加数据的时候,如果键是存在的,那么会把原有的键值对对象覆盖,会把被覆盖的值进行返回
/*        String value1 = m.put("郭靖", "黄蓉");
        System.out.println(value1);//null        */
        m.put("郭靖", "黄蓉");
        m.put("韦小宝", "沐剑屏");
        m.put("小龙女", "杨过");
/*        String value2 = m.put("小龙女", "尹志平");
        System.out.println(value2);//杨过         */


        //(删除)
/*        String result = m.remove("郭靖");//黄蓉
        System.out.println(result);//{韦小宝=沐剑屏, 小龙女=杨过}          */


        //清空
        /*      m.clear();//{}            */


/*      //判断是否包含
        boolean keyResult = m.containsKey("郭靖");
        System.out.println(keyResult);//true

        boolean valueResult = m.containsValue("杨过");
        System.out.println(valueResult);//true          */


/*        //判断集合是否为空
        boolean empty = m.isEmpty();
        System.out.println(empty);//false             */

/*        //集合的长度，也就是集合中键值对的个数
        int size = m.size();
        System.out.println(size);//3                */

        //3.打印集合
        System.out.println(m);
    }
}

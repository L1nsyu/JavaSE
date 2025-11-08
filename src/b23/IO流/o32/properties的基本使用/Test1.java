package b23.IO流.o32.properties的基本使用;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) {
        //properties 作为 Map 集合的操作


        //1.创建集合的对象
        Properties prop = new Properties();

        //2.添加数据
        //细节:虽然我们可以往properties当中添加任意的数据类型,但是一般只会往里面添加字符串类型的数据
        prop.put("aaa", "111");
        prop.put("bbb", "222");
        prop.put("ccc", "333");
        prop.put("ddd", "444");

        //3.遍历集合
/*        Set<Object> keys = prop.keySet();
        for (Object key : keys) {
            Object value = prop.get(key);
            System.out.println(key + "=" + value);
        }*/

/*        Set<Map.Entry<Object, Object>> entries = prop.entrySet();
        for (Map.Entry<Object, Object> entry : entries) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(key + "=" + value);
        }*/
    }
}

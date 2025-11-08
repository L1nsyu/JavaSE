package b23.IO流.o32.properties的基本使用;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) throws IOException {
        //Properties 跟IO流结合的操作

        //1.创建集合
        Properties prop = new Properties();

        //2.添加数据
        prop.put("aaa", "bbb");
        prop.put("ccc", "ddd");
        prop.put("eee", "fff");
        prop.put("ggg", "iii");

        //3.把集合中的数据以键值对的形式写到本地文件当中
        FileOutputStream fos = new FileOutputStream("C:\\Users\\lsy\\Desktop\\NewFileTest\\Properties.txt");
        prop.store(fos, "test");
        fos.close();



        /*BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\lsy\\Desktop\\NewFileTest\\Properties.txt"));
        Set<Map.Entry<Object, Object>> entries = prop.entrySet();
        for (Map.Entry<Object, Object> entry : entries) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            bw.write(key + " = " + value);
            bw.newLine();
        }
        bw.close();*/
    }
}

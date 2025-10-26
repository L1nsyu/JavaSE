package b23.IO流.o19.综合练习.o2.恢复出师表的顺序;

import java.io.*;
import java.util.*;

public class Test5_2 {
    public static void main(String[] args) throws IOException {
        //需求:把出师表的文章顺序进行恢复到一个新文件中

        //1.读取数据
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\lsy\\Desktop\\csb.txt"));

        //TreeMap 会根据键来调整顺序
        TreeMap<Integer, String> map = new TreeMap<>();
        String line;
        while ((line = br.readLine()) != null) {
            String[] arr = line.split("\\.");
            //参数1是键 ,参数2是值
            map.put(Integer.parseInt(arr[0]), arr[1]);
            //如果想要在文档呈现数字的情况,则可以更改参数2 -->变为 line
        }
        br.close();

        //2.排序,写出
        //排序规则:按照每一行前面的序号进行排序
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\lsy\\Desktop\\FileTest\\NewFileTest\\csb2.txt"));
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            String value = entry.getValue();
            bw.write(value);
            bw.newLine();
        }
        bw.close();


    }
}

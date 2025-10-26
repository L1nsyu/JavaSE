package b23.IO流.o19.综合练习.o2.恢复出师表的顺序;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test5_1 {
    public static void main(String[] args) throws IOException {
        //需求:把出师表的文章顺序进行恢复到一个新文件中

        //1.读取数据
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\lsy\\Desktop\\csb.txt"));

        ArrayList<String> list = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            list.add(line);
        }
        br.close();

        //2.排序
        //排序规则:按照每一行前面的序号进行排序
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int i1 = Integer.parseInt(o1.split("\\.")[0]);
                int i2 = Integer.parseInt(o2.split("\\.")[0]);
                return i1 - i2;
            }
        });


        //3.写出
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\lsy\\Desktop\\FileTest\\NewFileTest\\csb.txt"));
        for (String str : list) {
            bw.write(str);
            bw.newLine();
        }
        bw.close();


    }
}

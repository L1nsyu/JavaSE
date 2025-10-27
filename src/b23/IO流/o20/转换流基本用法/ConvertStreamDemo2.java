package b23.IO流.o20.转换流基本用法;

import java.io.*;
import java.nio.charset.Charset;

public class ConvertStreamDemo2 {
    public static void main(String[] args) throws IOException {

        //利用转换流按照字符指定编码写出⭐⭐

        //1.创建转换流的对象(被淘汰了)
/*        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("C:\\Users\\lsy\\Desktop\\FileTest\\NewFileTest\\Stream.txt"), "GBK");

        osw.write("你好你好");

        osw.close();*/

        FileWriter fw = new FileWriter("C:\\Users\\lsy\\Desktop\\FileTest\\NewFileTest\\Stream.txt", Charset.forName("UTF-8"));
        fw.write("你不好");
        fw.close();


    }
}

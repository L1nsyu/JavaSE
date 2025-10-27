package b23.IO流.o20.转换流基本用法;

import java.io.*;
import java.nio.charset.Charset;

public class ConvertStreamDemo3 {
    public static void main(String[] args) throws IOException {
        //将文件中的GBK文件,转成UTF-8⭐⭐⭐

        //1.JDK以前的方案
/*        InputStreamReader isr = new InputStreamReader(new FileInputStream("C:\\Users\\lsy\\Desktop\\FileTest\\NewFileTest\\Convert1.txt"), "GBK");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("C:\\Users\\lsy\\Desktop\\FileTest\\NewFileTest\\Convert2.txt"), "UTF-8");

        int b;
        while ((b = isr.read()) != -1) {
            osw.write(b);
        }

        osw.close();
        isr.close();*/

        //2.替代方案
        FileReader fr = new FileReader("C:\\Users\\lsy\\Desktop\\FileTest\\NewFileTest\\Convert1.txt",Charset.forName("GBK"));
        FileWriter fw = new FileWriter("C:\\Users\\lsy\\Desktop\\FileTest\\NewFileTest\\Convert3.txt",Charset.forName("UTF-8"));

        int ch;
        while ((ch = fr.read()) != -1) {
            fw.write(ch);
        }
        fr.close();
        fw.close();
    }
}

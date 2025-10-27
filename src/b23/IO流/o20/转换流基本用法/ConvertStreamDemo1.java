package b23.IO流.o20.转换流基本用法;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class ConvertStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //利用转换流按照指定字符编码读取⭐⭐


        //1.创建对象并指定字符编码
        //因为在JDK11 这种方法被淘汰了,替代方案(掌握)
        //要注意GBK写的位置
/*        InputStreamReader isr = new InputStreamReader(new FileInputStream("C:\\Users\\lsy\\Desktop\\FileTest\\NewFileTest\\csb.txt"),"GBK");

        //2.读取数据
        int ch;
        while((ch = isr.read())!= -1){
            System.out.print((char)ch);
        }

        //3.释放资源
        isr.close();
        */


        FileReader fr = new FileReader("C:\\Users\\lsy\\Desktop\\FileTest\\NewFileTest\\csb.txt", Charset.forName("GBK"));
        //2.读取数据
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch);
        }

        //3.释放资源
        fr.close();
    }
}

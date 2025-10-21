package b23.IO流.o5.字节输入流的基本用法;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo5 {
    public static void main(String[] args) throws IOException {
/*      ⭐⭐
        演示:字节输入流FileInputStream
        实现需求:读取文件中的数据。(暂时不写中文)
        实现步骤:
        1.创建对象
        2.读取数据
        3.释放资源
*/

        //1.创建对象
        FileInputStream fis = new FileInputStream("C:\\Users\\lsy\\Desktop\\FileTest\\b.txt");

        //2.读取数据    ---> abc
        int read1 = fis.read();
        System.out.println(read1);
        int read2 = fis.read();
        System.out.println((char) read2);
        int read3 = fis.read();
        System.out.println((char) read3);
        //如果后面没有了，读出来的就是-1
        int read4 = fis.read();
        System.out.println(read4);

        //3.释放数据
        fis.close();
    }
}

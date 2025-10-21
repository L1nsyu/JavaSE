package b23.IO流.o7.字节输入流循环读取;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo7 {
    public static void main(String[] args) throws IOException {
        //字节输入流循环读取

        //1.创建对象
        FileInputStream fis = new FileInputStream("C:\\Users\\lsy\\Desktop\\FileTest\\b.txt");

        //2.循环读取
        int b;
        while ((b = fis.read()) != -1) {
            System.out.print((char) b);
        }

        //3.释放数据
        fis.close();

    }
}

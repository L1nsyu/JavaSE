package b23.IO流.o9.文件拷贝的弊端和解决方案;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo9 {
    public static void main(String[] args) throws IOException {
        //public int read(byte[] buffer)        一次读一个字节数组数据 ⭐⭐

        //1.创建对象
        FileInputStream fis = new FileInputStream("C:\\Users\\lsy\\Desktop\\FileTest\\b.txt");

        //2.读取数据
        byte[] bytes = new byte[2];

        int len1 = fis.read(bytes);//2
        String str1 = new String(bytes, 0, len1);
        System.out.println(str1);//ab

        int len2 = fis.read(bytes);//1
        String str2 = new String(bytes, 0, len2);
        System.out.println(str2);//c

        //3.释放资源
        fis.close();
    }
}

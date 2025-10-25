package b23.IO流.o17.字节缓冲流拷贝文件.o1.一次读写一个字节;

import java.io.*;

public class BufferedStreamDemo1 {
    public static void main(String[] args) throws IOException {
        /*⭐
         * 需求:
         *       利用字节缓冲流拷贝文件
         *
         * 字节缓冲输入流的构造方法:
         *       public BufferedInputStream(InputStream is)
         *
         * 字节缓冲输出流的构造方法:
         *       public BufferedOutputStream(OutputStream is)
         * */


        //1.创建缓冲流的对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\lsy\\Desktop\\copyTest\\ramdom.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\lsy\\Desktop\\copyTest\\copy.txt"));

        //2.循环读取并写到目的地
        int b;
        while ((b = bis.read()) != -1) {
            bos.write(b);
        }

        //3.释放数据
        bos.close();
        bis.close();

    }
}

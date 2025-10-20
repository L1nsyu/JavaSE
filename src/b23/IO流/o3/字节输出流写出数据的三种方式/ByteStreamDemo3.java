package b23.IO流.o3.字节输出流写出数据的三种方式;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo3 {
    public static void main(String[] args) throws IOException {
/*
        void write(int b)           一次写一个字节数据
        void write(byte[] b)        一次写一个字节数组数据
        void write(byte[] b,int off,int len)    一次写一个字节数组的部分数据
            参数1:数组
            参数2:起始索引
            参数3:个数
            eg: 从起始索引 0 开始 --> 个数是 3 个 --> 就得到从起始索引开始一共写三个
            byte[] bytes ={97,98,99,100,101};
            --> 97,98,99 --> abc
*/

        //1.创建对象
        FileOutputStream fos = new FileOutputStream("C:\\Users\\lsy\\Desktop\\FileTest\\b.txt");

        //2.写出数据
        //2.1   void write(int b)           一次写一个字节数据
//        fos.write(98);

        //2.2   void write(byte[] b)        一次写一个字节数组数据
        byte[] bytes ={97,98,99,100,101};
//        fos.write(bytes);

        //2.3   void write(byte[] b,int off,int len)    一次写一个字节数组的部分数据
        fos.write(bytes,0,3);

        //3.释放数据
        fos.close();
    }
}

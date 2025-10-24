package b23.IO流.o15.字符输出流写出数据;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamDemo3 {
    public static void main(String[] args) throws IOException {

/*      ⭐⭐
        第一步:创建对象
        public FileWriter(File file)                        创建字符输出流关联本地文件
        public FileWriter(String pathname)                  创建字符输出流关联本地文件
        public FileWriter(File file,boolean append)         创建字符输出流关联本地文件，续写
        public FileWriter(String pathname, boolean append)  创建字符输出流关联本地文件，续写

        第二步:读取数据
        void write(int c)                                   写出一个字符
        void write(String str)                              写出一个字符串
        void write(String str,int off, int len)             写出一个字符串的一部分
        void write(Char[] cbuf)                             写出一个字符数组
        void write(Char[] cbuf, int off, int len)           写出字符数组的一部分


        第三步:释放资源
        public void close()                        释放资源/关流

        */

        //1.创建对象
        FileWriter fw = new FileWriter("C:\\Users\\lsy\\Desktop\\FileTest\\qwer.txt");

        //2.读取数据
        //2.1   fw.write(20105); --->我
        //2.2   fw.write("你好"); --->你好
        //2.3
        char[] chars = {'a', 'b', 'c', '我'};
        fw.write(chars); //--->abc我

        //3.释放资源
        fw.close();
    }
}

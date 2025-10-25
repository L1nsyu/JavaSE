package b23.IO流.o18.字符缓冲流;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStreamDemo4 {
    public static void main(String[] args) throws IOException {
        /*⭐⭐
         * 字符缓冲输出流
         *       构造方法:
         *           public BufferedWriter(Writer r)
         *
         *       特有方法:
         *           public void newLine()       跨平台的换行
         *
         * */

        //1.创建字符缓冲流的对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\lsy\\Desktop\\NewFileTest\\b.txt", true));

        //2.写出数据
        bw.write("123");
        bw.newLine();//BufferedWriter独有的方法
        bw.write("234");
        bw.newLine();

        //3.释放资源
        bw.close();
    }
}

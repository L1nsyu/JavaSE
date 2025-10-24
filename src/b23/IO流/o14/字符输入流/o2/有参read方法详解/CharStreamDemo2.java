package b23.IO流.o14.字符输入流.o2.有参read方法详解;

import java.io.FileReader;
import java.io.IOException;

public class CharStreamDemo2 {
    public static void main(String[] args) throws IOException {
/*      ⭐⭐
        第一步:创建对象
        public FileReader(File file)            创建字符输入流关联本地文件
        public FileReader(String pathname)      创建字符输入流关联本地文件

        第二步:读取数据
        public int read()                       读取数据，读到末尾返回-1
        public int read(char[] buffer)          读取多个数据，读到末尾返回-1

        第三步:释放资源
        public void close()                     释放资源/关流
*/

        //1.创建对象
        FileReader fr = new FileReader("C:\\Users\\lsy\\Desktop\\FileTest\\ramdom.txt");

        //2.读取数据
        char[] chars = new char[2];
        int len;
        while ((len = fr.read(chars)) != -1) {
            System.out.print(new String(chars, 0, len));
        }

        //3.释放数据
        fr.close();
    }
}

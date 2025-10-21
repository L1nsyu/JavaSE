package b23.IO流.o10.文件拷贝改写;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo10 {
    public static void main(String[] args) throws IOException {
/*
        练习:
            文件拷贝改写改进⭐⭐⭐
*/

        long start = System.currentTimeMillis();

        //1.创建对象
        FileInputStream fis = new FileInputStream("C:\\Users\\lsy\\Desktop\\css\\b站视频\\故湘风(浏阳河).mp4");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\lsy\\Desktop\\FileTest\\copy2.mp4");

        //2.拷贝
        int len;
        byte[] bytes = new byte[1024 * 1024 * 5];
        //--> 1024B ---> 1024Kb ---> 5Mb
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }

        //3.释放资源
        fos.close();
        fis.close();

        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}

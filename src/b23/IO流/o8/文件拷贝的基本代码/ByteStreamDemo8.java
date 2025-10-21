package b23.IO流.o8.文件拷贝的基本代码;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo8 {
    public static void main(String[] args) throws IOException {
/*      练习:
            文件拷贝⭐⭐

        注意:
            选择一个比较小的文件,不要太大.大文件拷贝我们下一个视频会说.
*/

        //1.创建对象
        FileInputStream fis = new FileInputStream("C:\\Users\\lsy\\Desktop\\css\\b站视频\\夏之禹-姐姐.mp4");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\lsy\\Desktop\\FileTest\\copy.mp4");

        //2.拷贝
        //核心思想:边读边写.
        int b;
        while ((b = fis.read()) != -1) {
            fos.write(b);
        }

        //3.释放资源
        //规则:先开的最后关闭
        fos.close();
        fis.close();
    }
}

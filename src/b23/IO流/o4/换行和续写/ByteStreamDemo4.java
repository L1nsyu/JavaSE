package b23.IO流.o4.换行和续写;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteStreamDemo4 {
    public static void main(String[] args) throws IOException {
/*      ⭐⭐
       换行写:
            再次写出一个换行符就可以了
            windows: \r\n
            Linux :  \n
            Mac:     \r
       细节:
            在window操作系统当中,JAVA对回车换行进行了优化
            虽然完整的是\r\n,但是我们写其中一个\r或者\n
            java也可以实现换行,因为java在底层会补全
       建议:
            不要省略,还是写全
*/

/*      ⭐⭐
        续写:
            如果想要续写,打开续写开关即可
            开关位置:创建对象的第二个参数
            默认false:表示关闭续写,此时创建对象会清空文件
            手动传递true:表示打开续写,此时创建对象不会

            eg:
            FileOutputStream fos = new FileOutputStream("C:\\Users\\lsy\\Desktop\\FileTest\\c.txt",true);
*/


        //1.创建对象
        FileOutputStream fos = new FileOutputStream("C:\\Users\\lsy\\Desktop\\FileTest\\c.txt",true);

        //2.写出数据
        String str1 = "heimachengxuyuan123";
        byte[] bytes1 = str1.getBytes();
        System.out.println(Arrays.toString(bytes1));
        //[104, 101, 105, 109, 97, 99, 104, 101, 110, 103, 120, 117, 121, 117, 97, 110, 49, 50, 51]
        fos.write(bytes1);

        String wrap = "\r\n";
        byte[] bytes2 = wrap.getBytes();
        fos.write(bytes2);


        String str2 = "1234567890";
        byte[] bytes3 = str2.getBytes();
        fos.write(bytes3);


        //3.释放数据
        fos.close();
    }
}

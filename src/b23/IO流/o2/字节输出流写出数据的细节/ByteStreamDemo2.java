package b23.IO流.o2.字节输出流写出数据的细节;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo2 {
    public static void main(String[] args) throws IOException {

/*
      字节输出流的细节:⭐⭐⭐
        1.创建字节输出流的对象
            细节1:参数是字符串表示的路径或者是File对象都是可以的
            细节2:如果文件不存在会创建一个新的文件,但是要保证父级路径是存在的
            细节3:如果文件已经存在的话,则会清空原来文件的内容,且重新覆盖成新的内容

        2.写数据
            细节:write方法的参数是整数,但是实际上写到本地文件中的是整数在ASCII上对应的字符
            97 --> a
            100 --> d

            如果要输出的就是97怎么办呢? --> 那么就把97分成 字符 '9' 和 '7'
            然后分别输出字符 '9' 和 '7' 就可以了
            eg: fos.write(57);
                fos.write(55);

        3.释放资源
            每次使用完流后都要释放资源(如果不释放资源的话,内存会显示一直占用文件)
*/
        //1.创建对象
        FileOutputStream fos = new FileOutputStream("C:\\Users\\lsy\\Desktop\\FileTest\\a.txt");

        //细节1:参数是字符串表示的路径或者是File对象都是可以的
        FileOutputStream fos1 = new FileOutputStream(new File("C:\\Users\\lsy\\Desktop\\FileTest\\b.txt"));

        //2.写出数据
        fos.write(97);

        //3.释放资源
        fos.close();
    }
}

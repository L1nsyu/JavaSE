package b22.File.o3.综合练习.o4删除文件夹;

import java.io.File;

public class Test4 {
    public static void main(String[] args) {
/*
        删除一个多级文件夹
        如果我们要删除一个有内容的文件夹
        1. 先删除文件夹里面所有的内容
        2. 再删除自己
*/

        File f = new File("C:\\Users\\lsy\\Desktop\\FileTest\\aaa");
        delete(f);

    }

    public static void delete(File src) {
        //1. 先删除文件夹里面所有的内容
        //进入src
        File[] files = src.listFiles();
        for (File file : files) {
            //判断,如果是文件,删除
            if (file.isFile()) {
                file.delete();
            } else {
                //判断,如果是文件夹,递归
                delete(file);
            }
        }
        src.delete();
        //删除成功
    }
}

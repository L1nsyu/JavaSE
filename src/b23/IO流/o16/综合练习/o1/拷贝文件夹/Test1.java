package b23.IO流.o16.综合练习.o1.拷贝文件夹;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {
        //拷贝一个文件,考虑子文件

        //1.创建对象表示数据源
        File src = new File("C:\\Users\\lsy\\Desktop\\FileTest");

        //2.创建对象表示要拷贝的地址
        File dest =new File("C:\\Users\\lsy\\Desktop\\copyTest");

        //3.调用方法开始拷贝
        copydir(src,dest);
    }


    /*
        作用:拷贝文件夹
        参数1:数据源
        参数2:目的地
    */
    private static void copydir(File src, File dest) throws IOException {
        dest.mkdirs();
        //1.进入数据源
        File[] files = src.listFiles();
        //2.遍历数组
        for (File file : files) {
            if (file.isFile()){
                //3.判断是否拷贝的对象是文件,拷贝
                FileInputStream fis = new FileInputStream(file);
                FileOutputStream fos = new FileOutputStream(new File(dest,file.getName()));
                byte[] bytes = new byte[1024];
                int len;
                while((len = fis.read(bytes)) != -1){
                    fos.write(bytes,0,len);
                }
                fos.close();
                fis.close();

            }else if (file.isDirectory()){
                //4.判断是否拷贝的对象是文件夹,递归
                copydir(file,new File(dest,file.getName()));

            }

        }






    }
}

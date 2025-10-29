package b23.IO流.o29.压缩流.o1.压缩单个文件;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class ZipStreamDemo2 {
    public static void main(String[] args) throws IOException {
        /*⭐⭐⭐⭐
         * 需求:
         *       把C:\Users\lsy\Desktop\NewFileTest 打包成一个压缩包
         *
         * */

        //1.创建File对象表示要压缩的文件
        File src = new File("C:\\Users\\lsy\\Desktop\\NewFileTest\\csb2.txt");

        //2.创建File对象表示压缩包的位置
        File dest = new File("C:\\Users\\lsy\\Desktop");

        toZip(src, dest);
    }

    private static void toZip(File src, File dest) throws IOException {
        //1.创建压缩流关键压缩包
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(new File(dest, "csb2.zip")));

        //2.创建ZipEntry对象,表示压缩包里面的每一个文件和文件夹
        ZipEntry entry = new ZipEntry("csb2.txt");

        //3.把ZipEntry对象放到压缩包当中
        zos.putNextEntry(entry);

        //4.把src文件中的数据写到压缩包当中
        FileInputStream fis = new FileInputStream(src);
        int b;
        while ((b = fis.read()) != -1) {
            zos.write(b);
        }

        zos.closeEntry();
        zos.close();
    }
}

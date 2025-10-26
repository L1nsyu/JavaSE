package b23.IO流.o19.综合练习.o1.四种拷贝方式效率对比;

import java.io.*;

public class Test4 {
    public static void main(String[] args) throws IOException {
        //四种方式拷贝文件,并统计各自用时

        long start = System.currentTimeMillis();

//        method1();//太慢了
//        method2();//2.236秒
//        method3();//14.702秒
//        method4();//1.463秒
        long end = System.currentTimeMillis();
        System.out.println((end - start) / 1000.0 + "秒");


    }

    //字节流的基本流:一次读写一个字节
    public static void method1() throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\lsy\\Desktop\\css\\b站视频\\徐佳莹.mp4");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\lsy\\Desktop\\FileTest\\copy.mp4");

        int b;
        while ((b = fis.read()) != -1) {
            fos.write(b);
        }
        fos.close();
        fis.close();
    }


    //字节流的基本流:一次读写一个字节数组
    public static void method2() throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\lsy\\Desktop\\css\\b站视频\\徐佳莹.mp4");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\lsy\\Desktop\\FileTest\\copy.mp4");
        byte[] bytes = new byte[8192];
        int len;
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }
        fos.close();
        fis.close();
    }

    //字节流的缓冲:一次读写一个字节
    public static void method3() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\lsy\\Desktop\\css\\b站视频\\徐佳莹.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\lsy\\Desktop\\FileTest\\copy.mp4"));

        int b;
        while ((b = bis.read()) != -1) {
            bos.write(b);
        }

        bos.close();
        bis.close();
    }

    //字节流的缓冲:一次读写一个字节数组
    public static void method4() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\lsy\\Desktop\\css\\b站视频\\徐佳莹.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\lsy\\Desktop\\FileTest\\copy.mp4"));
        byte[] bytes = new byte[8192];
        int len;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }
        bos.close();
        bis.close();
    }
}

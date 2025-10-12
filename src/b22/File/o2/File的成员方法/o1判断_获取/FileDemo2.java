package b22.File.o2.File的成员方法.o1判断_获取;

import java.io.File;

public class FileDemo2 {
    public static void main(String[] args) {
/*      public boolean isDirectory()            判断此路径名表示的File是否为文件夹
        public boolean isFile()                 判断此路径名表示的File是否为文件
        public boolean exists()                  判断此路径名表示的File是否存在
        */


        //1.对一个文件夹的路径进行判断
        File f1 = new File("C:\\Users\\lsy\\Desktop\\css");
        System.out.println(f1.isDirectory());//true
        System.out.println(f1.isFile());//false
        System.out.println(f1.exists());//true

        System.out.println("----------------");
        //2.对一个文件的路径进行判断
        File f2 = new File("C:\\Users\\lsy\\Desktop\\css\\heimaTest.txt");
        System.out.println(f2.isDirectory());//false
        System.out.println(f2.isFile());//true
        System.out.println(f2.exists());//true
    }
}

package b22.File.o2.File的成员方法.o4所有获取并遍历的方法;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class FileDemo7 {
    public static void main(String[] args) {
/*          (了解)public Static File[] listRoots()                    列出可用的文件系统根
            (了解)public String[] list()                              获取当前该路径下所有内容
            (了解)public String[] list(FilenameFilter filter)         利用文件名过滤器获取当前该路径下所有内容

        */

        //1.listRoots       获取系统中所有的盘符
        File[] arr = File.listRoots();
        System.out.println(Arrays.toString(arr));

        System.out.println("--------------");
        //2.list()       获取当前该路径下所有内容(仅仅能获取名字)
        File f1 = new File("C:\\Users\\lsy\\Desktop\\FileTest");
        String[] arr2 = f1.list();
        for (String s : arr2) {
            System.out.println(s);
        }
        System.out.println("--------------");

        //3.list(FilenameFilter filter)         利用文件名过滤器获取当前该路径下所有内容
        //需求:我现在要获取C:\Users\lsy\Desktop\FileTest文件夹里面所有的txt文件
        File f2 = new File("C:\\Users\\lsy\\Desktop\\FileTest");
        String[] arr3 = f2.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File src = new File(dir, name);
                return src.isFile() && name.endsWith(".txt");
            }
        });
        System.out.println(Arrays.toString(arr3));
    }
}

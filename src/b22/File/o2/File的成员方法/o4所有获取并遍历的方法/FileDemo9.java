package b22.File.o2.File的成员方法.o4所有获取并遍历的方法;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Arrays;

public class FileDemo9 {
    public static void main(String[] args) {
/*      (了解)public File[] listFiles(FileFilter filter)          利用文件名过滤器获取当前该路径下所有内容
        (了解)public File[] listFiles(FilenameFilter filter)      利用文件名过滤器获取当前该路径下所有内容
        */

        //创建File对象
        File f = new File("C:\\Users\\lsy\\Desktop\\FileTest");


        //1.listFiles(FileFilter filter)          利用文件名过滤器获取当前该路径下所有内容
        //调用listFiles(FileFilter filter)
        File[] arr = f.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isFile() && pathname.getName().endsWith(".txt");
            }
        });
        System.out.println(Arrays.toString(arr));

        System.out.println("-----------");


        //2.listFiles(FilenameFilter filter)      利用文件名过滤器获取当前该路径下所有内容
        //调用listFiles(FilenameFilter filter)
        File[] arr1 = f.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File src = new File(dir, name);
                return src.isFile() && src.getName().endsWith(".txt");
            }
        });
        System.out.println(Arrays.toString(arr1));
    }


}

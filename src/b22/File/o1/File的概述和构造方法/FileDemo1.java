package b22.File.o1.File的概述和构造方法;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
/*      public File(String pathname)                   根据文件路径创建文件对象⭐
        public File(String parent,String child)        根据父路径名字符串和子路径名字符串创建文件对象⭐
        public File(File parent,String child)          根据父路径对应文件对象和子路径名字符串创建文件对象⭐

        C:\User\lsy\Desktop

        \:转移字符

        */

        //1.根据字符串表示的路径,变成File对象
        String str = "C:\\User\\lsy\\Desktop\\a.txt";
        File f1 = new File(str);
        System.out.println(f1);

        //2.1   父级路径:C:\User\lsy\Desktop
        //2.2   子级路径:a.txt
        String parent = "C:\\User\\lsy\\Desktop";
        String child = "a.txt";
        File f2 = new File(parent, child);
        System.out.println(f2);

        //3.把一个File表示的路径和String表示路径进行拼接
        File parent1 = new File("C:\\User\\lsy\\Desktop");
        String child1 = "a.txt";
        File f3 = new File(parent1, child1);
        System.out.println(f3);
    }
}

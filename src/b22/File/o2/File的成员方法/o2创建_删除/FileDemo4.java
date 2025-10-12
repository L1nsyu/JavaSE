package b22.File.o2.File的成员方法.o2创建_删除;

import java.io.File;
import java.io.IOException;

public class FileDemo4 {
    public static void main(String[] args) throws IOException {
/*      public boolean createNewFile()      创建一个新的空的文件夹⭐
        public boolean mkdir()              创建单极文件夹⭐
        public boolean mkdirs()             创建多级文件夹⭐
        */

        //1.createNewFile       创建一个新的空的文件夹
        //⭐⭐细节1:如果当前路径表示的文件是不存在的,则创建成功,方法返回true
        //      如果当前路径表示的文件是存在的,则创建失败,方法返回false

        //⭐⭐细节2:如果创建文件夹时,例如 "C:\\Users\\lsy\\a.txt",
        //但实际情况下lsy这个父级路径是不存在的,那么方法会有异常IOException

        //⭐⭐细节3:createNewFile方法创建的一定是文件,如果路径中不包含后缀名,
        //实际情况下lsy这个父级路径是不存在的
        //例如:"C:\\Users\\lsy"   则创建一个没有后缀的文件 --> lsy

        File f1 = new File("C:\\Users\\lsy\\Desktop\\FileTest\\abc.txt");
        boolean b1 = f1.createNewFile();
        System.out.println(b1);

        //2.mkdir   --> make Directory 文件夹(目录)  创建单极文件夹
        //⭐⭐细节1: windows当中路径是唯一的,如果当前路径已经存在,则创建失败,返回false
        //⭐⭐细节2:mkdir方法只能创建单极文件夹,无法创建多级文件夹
        File f2 = new File("C:\\Users\\lsy\\Desktop\\FileTest\\aaa");
        boolean b2 = f2.mkdir();
        System.out.println(b2);

        //3.mkdirs  创建多级文件夹
        //⭐⭐⭐细节:既可以创建单极的,也可以创建多级的文件夹
        //实际上以后只需要用mkdirs , 但mkdirs的底层逻辑包含了mkdir
        File f3 = new File("C:\\Users\\lsy\\Desktop\\FileTest\\aaa\\bbb\\ccc");
        boolean b3 = f3.mkdir();
        System.out.println(b3);

    }
}

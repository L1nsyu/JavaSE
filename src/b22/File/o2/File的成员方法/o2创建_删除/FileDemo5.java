package b22.File.o2.File的成员方法.o2创建_删除;

import java.io.File;

public class FileDemo5 {
    public static void main(String[] args) {
        //public boolean delete()             删除文件,空文件夹⭐
        //细节:⭐⭐
        //1.如果删除的是文件,则直接删除,不走回收站
        //2.如果删除的是文件夹,则直接删除,不走回收站
        //3.如果删除的是有内容的文件夹,删除失败

        //1.创建File对象
        File f1 =new File("C:\\Users\\lsy\\Desktop\\FileTest\\abc.txt");
        boolean b = f1.delete();
        System.out.println(b);
    }
}

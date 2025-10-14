package b22.File.o2.File的成员方法.o4所有获取并遍历的方法;

import java.io.File;

public class FileDemo8 {
    public static void main(String[] args) {
/*       ⭐⭐(掌据)public File[] listFiles()                     获取当前该路径下所有内容

        */

        //1.创建File对象
        File f = new File("C:\\Users\\lsy\\Desktop\\FileTest");
        //2.需求:打印里面所有的txt文件
        File[] arr = f.listFiles();
        for (File file : arr) {
            //file依次表示C:\Users\lsy\Desktop\FileTest文件夹里面每一个文件或者文件夹的路径
            if (file.isFile() && file.getName().endsWith(".txt")) {
                System.out.println(file);
            }
        }
    }
}

package b22.File.o2.File的成员方法.o3获取并遍历;

import java.io.File;

public class FileDemo6 {
    public static void main(String[] args) {
        //public File[] listFiles()     获取当前该路径下的所有内容

        //细节:
        //当调用者File表示的路径不存在时,返回null
        //当调用者File表示的路径是文件时,返回null
        //当调用者File表示的路径是一个空文件夹时,返回一个长度为0的数组
        //当调用者File表示的路径是一个有内容的文件夹时,将里面所有文件和文件夹的路径放在File数组中返回
        //当调用者File表示的路径是一个有隐藏文件的文件夹时,将里面所有文件和文件夹的路径放在File数组中返回,包含隐藏文件
        //当调用者File表示的路径是需要权限才能访问的文件夹时,返回null

        //1.创建File对象
        File f = new File("C:\\Users\\lsy\\Desktop\\FileTest");
        //2.listFiles 方法
        //作用:获取FileTest文件夹里面的所有内容,把所有的内容放到数组中返回
        File[] files = f.listFiles();
        for (File file : files) {
            //file 依次表示FileTest 文件夹里面的每一个文件或者文件夹
            System.out.println(file);
        }
    }
}

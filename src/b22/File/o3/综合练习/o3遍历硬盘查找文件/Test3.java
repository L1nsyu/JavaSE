package b22.File.o3.综合练习.o3遍历硬盘查找文件;

import java.io.File;

public class Test3 {
    public static void main(String[] args) {
        //需求:找到电脑中所有和avi结尾的电影(需要考虑子文件夹)

        //找到电脑中所有的文件的常用套路:
        //1.进入文件夹
        //2.遍历数组
        //3.判断
        //4.判断


        findAVI();

    }

    public static void findAVI() {
        //遍历本系统的所有盘符
        File[] files = File.listRoots();
        for (File f : files) {
            findAVI(f);
        }
    }


    public static void findAVI(File src) {
        //1.进入文件夹
        File[] files = src.listFiles();

        //2.遍历数组,得到src里面每一个文件和文件夹
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    //3.判断:如果src是文件的情况
                    if (file.getName().endsWith(".avi")) {
                        System.out.println(file);
                    }
                } else {
                    //4.判断:如果src是文件夹的情况,就可以递归
                    //细节:再次调节本方法的时候,参数一定要是src的次一级路径
                    findAVI(file);
                }
            }
        }

    }
}

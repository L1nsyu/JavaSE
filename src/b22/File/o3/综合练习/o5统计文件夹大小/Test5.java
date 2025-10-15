package b22.File.o3.综合练习.o5统计文件夹大小;

import java.io.File;

public class Test5 {
    public static void main(String[] args) {
        //需求:统计一个文件夹的总大小

        File f = new File("C:\\Users\\lsy\\Desktop\\FileTest");
        System.out.println(getLen(f));

    }

    /*
    作用:统计一个文件夹的总大小
    参数:表示要统计的那个文件夹
    返回值:统计之后的结果

    文件夹的总大小:
        说白了,文件夹里面所有的文件的大小
    */

    public static long getLen(File src) {
        //1.定义变量进行累加
        long len = 0;
        //2.进入src文件夹
        File[] files = src.listFiles();
        //3.遍历数组
        for (File file : files) {
            //4.判断
            if (file.isFile()) {
                //我们就把当前文件的大小累加到len当中
                len += file.length();
            } else {
                //判断,如果是文件夹就递归
                len += getLen(file);
            }
        }
        return len;
    }
}

package b22.File.o3.综合练习.o2单个文件夹查找文件;

import java.io.File;

public class Test2 {
    public static void main(String[] args) {
        //需求:
        //定义一个方法找某一个文件夹中,是否有以avi结尾的电影.(暂时不考虑子文件夹)
        File f = new File("F:\\aaa\\FileTest");
        boolean b = haveAVI(f);
        System.out.println(b);
    }

    /*    作用:用来查找每一个文件夹中,是否有以avi结尾的电影
    新参:要查找的文件夹
    返回值:查找的结果   存在true  不存在false    */
    public static boolean haveAVI(File file) {
        //1.进入aaa文件夹,而且要获取里面所有的内容
        File[] files = file.listFiles();
        //2.遍历数组获取里面的每一个元素
        for (File f : files) {
            if (f.isFile() && f.getName().endsWith(".avi")) {
                return true;
            }
        }
        //3.如果循环结束之后还没有找到,直接返回
        return false;
    }
}



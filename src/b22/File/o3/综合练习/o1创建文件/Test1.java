package b22.File.o3.综合练习.o1创建文件;

import java.io.File;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {
        //在当前模块下的aaa文件夹中创建一个a.txt文件夹

        //1.创建a.txt的父级路径
        File f = new File("F:\\aaa\\FileTest");
        //2.创建父级路径
        //如果aaa是存在的,那么此时创建失败
        //如果aaa是不存在的,那么此时创建成功
        boolean b = f.mkdirs();

        //3.拼接父级路径和子级路径
        File src = new File(f,"a.txt");
        boolean b1 = src.createNewFile();
//        boolean b1 = src.mkdirs();
        System.out.println(src);
        if(b1){
            System.out.println("创建成功");
        }else {
            System.out.println("创建失败");
        }
    }
}

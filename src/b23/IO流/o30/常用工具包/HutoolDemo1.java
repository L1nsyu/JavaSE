package b23.IO流.o30.常用工具包;

import cn.hutool.core.io.FileUtil;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class HutoolDemo1 {
    public static void main(String[] args) {
        /*⭐⭐⭐
         * FileUtil类:
         * file:根据参数创建一个file对象
         * touch:根据参数创建文件
         *
         * writeLines:把集合中的数据写出到文件中,覆盖模式.
         * appendLines:把集合中的数据写出到文件中,续写式.
         * eadLines:指定字符编码,把文件中的数据,读到集合中.
         * readUtf8Lines:按照UTF-8的形式,把文件中的数据,读到集合中
         *
         * copy:号贝文件或者文件夹
         * */

        File aaa = FileUtil.file("C:\\Users\\lsy\\Desktop", "aaa", "a.txt");
        System.out.println(aaa);

        File touch = FileUtil.touch(aaa);
        System.out.println(touch);

        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //writeLines:把集合中的数据写出到文件中,覆盖模式.
        File file1 = FileUtil.writeLines(list, "C:\\Users\\lsy\\Desktop\\aaa\\a.txt", "UTF-8");
        System.out.println(file1);
        /*
         * aaa
         * bbb
         * ccc
         * */

        //appendLines:把集合中的数据写出到文件中,续写式.
        File file2 = FileUtil.appendLines(list, "C:\\Users\\lsy\\Desktop\\aaa\\a.txt", "UTF-8");
        System.out.println(file2);
        /*
         * aaa
         * bbb
         * ccc
         * aaa
         * bbb
         * ccc
         * */

        //会默认帮我们创建一个集合用于展示数据
        List<String> list1 = FileUtil.readLines("C:\\Users\\lsy\\Desktop\\aaa\\a.txt", "UTF-8");
        System.out.println(list1);//[aaa, bbb, ccc, aaa, bbb, ccc]



    }
}

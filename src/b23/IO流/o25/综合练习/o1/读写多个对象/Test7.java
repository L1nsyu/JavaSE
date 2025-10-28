package b23.IO流.o25.综合练习.o1.读写多个对象;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Test7 {
    public static void main(String[] args) throws IOException {
        /*
         * 需求:
         *       将多个自定义对象序列化到文件中,但是对象的个数不确定,该如何操作呢?
         *
         * */

        //1.序列化多个对象
        Student stu1 = new Student("zhangsan", 21, "beijing");
        Student stu2 = new Student("lisi", 22, "guangzhou");
        Student stu3 = new Student("wangwu", 23, "sichuan");

        ArrayList<Student> list = new ArrayList<>();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);


        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream
                ("C:\\Users\\lsy\\Desktop\\FileTest\\NewFileTest\\Object2.txt"));

        oos.writeObject(list);

        oos.close();

    }
}

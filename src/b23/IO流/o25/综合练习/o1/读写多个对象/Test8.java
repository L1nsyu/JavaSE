package b23.IO流.o25.综合练习.o1.读写多个对象;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Test8 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /*
         * 需求:
         *       将多个自定义对象序列化到文件中,但是对象的个数不确定,该如何操作呢?
         *
         * */

        //1.创建反序列化流的对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream
                ("C:\\Users\\lsy\\Desktop\\FileTest\\NewFileTest\\Object2.txt"));

        ArrayList<Student> list = (ArrayList<Student>) ois.readObject();

        for (Student student : list) {
            System.out.println(student);
        }

        ois.close();


    }
}

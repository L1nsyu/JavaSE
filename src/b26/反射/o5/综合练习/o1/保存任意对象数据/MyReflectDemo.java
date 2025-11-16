package b26.反射.o5.综合练习.o1.保存任意对象数据;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

public class MyReflectDemo {
    public static void main(String[] args) throws IOException, IllegalAccessException {
        /*
         * 对于任意一个对象,都可以把对象所有的字段名和值,保存到文件中去
         * */

        Student s = new Student("小A", 23, '女', 167.5, "睡觉");
        Teacher t = new Teacher("波妞", 8000);

        saveObject(t);

    }

    //把对象里面所有的成员变量名和值保存到本地文件中
    private static void saveObject(Object obj) throws IllegalAccessException, IOException {
        //1.获取字节码文件的对象
        Class clazz = obj.getClass();

        //创建IO流
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\lsy\\Desktop\\NewFileTest\\reflect.txt"));

        //2.获取所有的成员变量
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            //获取成员变量的名字
            String name = field.getName();
            //获取成员变量的值
            Object value = field.get(obj);
            //写出数据
            bw.write(name + "=" + value);
            bw.newLine();
        }
        bw.close();

    }
}

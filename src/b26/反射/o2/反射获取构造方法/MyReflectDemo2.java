package b26.反射.o2.反射获取构造方法;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;

public class MyReflectDemo2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //Class类中用于获取构造方法的方法
        //  Constructor<?>[] getConstructors()                               返回所有公共构造方法对象的数组
        //  Constructor<?>[] getDeclaredConstructors()                         返回所有构造方法对象的数组
        //  Constructor<T> getConstructor(Class<?>... parameterTypes)         返回单个公共构造方法对象
        //  Constructor<T> getDeclaredConstructor(Class<?>.. parameterTypes)    返回单个构造方法对象

        //Constructor类中用于创建对象的方法
        //  T newInstance(Object... initargs)                              根据指定的构造方法创建对象
        //  setAccessible(boolean flag)                                   设置为true,表示取消访问检查


        //1.获取class字节码文件对象
        Class clazz = Class.forName("b26.反射.o2.反射获取构造方法.Student");

        /*//2.获取构造方法
        Constructor[] cons1 = clazz.getConstructors();
        for (Constructor con : cons1) {
            System.out.println(con);
        }
        //public b26.反射.o2.反射获取构造方法.Student()
        //public b26.反射.o2.反射获取构造方法.Student(java.lang.String)

        System.out.println("------------------");

        Constructor[] cons2 = clazz.getDeclaredConstructors();
        for (Constructor con : cons2) {
            System.out.println(con);
        }
        //public b26.反射.o2.反射获取构造方法.Student()
        //public b26.反射.o2.反射获取构造方法.Student(java.lang.String)
        //protected b26.反射.o2.反射获取构造方法.Student(int)
        //private b26.反射.o2.反射获取构造方法.Student(java.lang.String,int)
*/


        Constructor con1 = clazz.getDeclaredConstructor();
        System.out.println(con1);
        //public b26.反射.o2.反射获取构造方法.Student()
        System.out.println("------------------");

        Constructor con2 = clazz.getDeclaredConstructor(String.class);
        System.out.println(con2);
        //public b26.反射.o2.反射获取构造方法.Student(java.lang.String)
        System.out.println("------------------");

        Constructor con3 = clazz.getDeclaredConstructor(int.class);
        System.out.println(con3);
        //protected b26.反射.o2.反射获取构造方法.Student(int)
        System.out.println("------------------");

        Constructor con4 = clazz.getDeclaredConstructor(String.class, int.class);
        System.out.println(con4);
        //private b26.反射.o2.反射获取构造方法.Student(java.lang.String,int)
        System.out.println("------------------");

        //获取权限修饰符
        int modifiers = con4.getModifiers();
        System.out.println(modifiers); //2

        Parameter[] parameters = con4.getParameters();
        for (Parameter parameter : parameters) {
            System.out.println(parameter);
        }
        //java.lang.String arg0
        //int arg1

        //暴力反射:表示临时取消权限安检
        con4.setAccessible(true);
        Student stu = (Student) con4.newInstance("zhangsan", 23);

        System.out.println(stu);
        //Student{name = zhangsan, age = 23}
    }
}

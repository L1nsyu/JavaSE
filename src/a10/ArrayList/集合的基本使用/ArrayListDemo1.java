package a10.ArrayList.集合的基本使用;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //1.创建集合的对象
        //泛型:限定集合中存储数据的类型
        //ArrayList<String> list = new ArrayList<String>();
        //JDK7以后:
//        ArrayList<String> list = new ArrayList();
//        此时我们创建的是ArrayList的对象,而ArrayList是java已经写好的一个类
//        这个类在底层做了一些处理
//        打印对象不是地址值,而是集合中存储数据内容
//        在展示的时候会拿[]把所有的数据进行包裹
        ArrayList<String> list = new ArrayList();
        System.out.println(list);   //[]
    }
}

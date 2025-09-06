package a16.集合进阶.Ⅰ泛型类Ⅱ泛型方法Ⅲ泛型接口;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsDemo1 {
    public static void main(String[] args) {
        //没有泛型的时候,集合如何存储数据
        //结论:
        //如果我们没有给集合指定类型,默认认为所有的数据类型都是Object类型
        //此时可以往集合添加任意的数据类型
        //带来一个坏处:我们在回去数据的时候,无法使用他的特有的行为

        //此时推出了泛型,可以在添加数据的时候就把类型进行统一
        //而且我们在获取数据的时候,也省的强转了,非常的方便

        //1.创建集合的对象
        ArrayList<String> list = new ArrayList<>();

        //2.添加数据
//        list.add(123);
        list.add("aaa");
//        list.add(new Student("zhangsan",21));


        //3.遍历集合获取里面的每一个元素
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
//            Student str = (Student) it.next();
            String s = it.next();
            //多态的弊端是不能访问子类的特有功能
            //obj.length();
            //str.length();
            System.out.println(s);
        }
    }
}

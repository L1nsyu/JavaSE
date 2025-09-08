package a16.集合进阶.HashSet和LinkedHashSet详解;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class SetDemo1 {
    public static void main(String[] args) {
        //利用Set系列的集合,添加字符串,并用多种方式遍历
        //迭代器
        //增强for
        //Lambda表达式


        //1.创建一个Set集合的对象
        Set<String> set = new HashSet<String>();

        //2.添加元素
        //如果当前元素是第一次添加,那么可以添加成功,返回true
        //如果当前元素是第二次添加,那么添加失败,返回false
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");

        //3.打印集合
        //无序
        System.out.println(set);//[a, b, c, d]


        //迭代器遍历
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);
        }

        System.out.println("-----------------------------");
        //增强for
        for (String s : set) {
            System.out.println(s);
        }

        System.out.println("-----------------------------");
        //lambda表达式
        set.forEach(s -> System.out.println(s));
    }
}

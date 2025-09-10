package a16.集合进阶.List中常见的方法和五种遍历方式;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {
        //List 系列集合中的两个删除的方法
        //1.直接删除元素
        //2.通过索引进行删除

        //1.创建集合并添加元素
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        //2.删除元素
        //请问:此时删除的是 1 这个元素,还是 1 索引上的元素?
        //为什么?
        //因为在调用方法的时候,如果方法出现了重载现象
        //优先调用,实参和形参类型一致的那个方法

        //eg: list.remove(1); ----> 删除的是索引 1,因为1是int类型的

        //手动装箱,手动把基本数据类型的1 ,变成了Integer类型
        Integer i = Integer.valueOf(1);
        //此时删除的是元素 1 , 因为现在是Integer类型的
        list.remove(i);

        System.out.println(list);//[2, 3]
    }
}

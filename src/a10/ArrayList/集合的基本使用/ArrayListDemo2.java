package a10.ArrayList.集合的基本使用;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        //说明
        //boolean add(E e)          添加元素，返回值表示是否添加成功
        //boolean remove(E e)       删除指定元素,返回值表示是否删除成功
        //E remove(int index)       删除指定索引的元素,返回被删除元素
        //E set(int index,E e)      修改指定索引下的元素,返回原来的元素
        //E get(int index)          获取指定索引的元素
        //int size()                集合的长度，也就是集合中元素的个数

        //1.创建一个集合
        ArrayList<String> list = new ArrayList<String>();

        //2.添加元素
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        System.out.println(list);//[aaa, bbb, ccc, ddd]

        //3.删除元素
        boolean result1 = list.remove("aaa");
        System.out.println(result1);//true
        System.out.println(list);//[bbb, ccc, ddd]

        String result2 = list.remove(0);
        System.out.println(result2);//bbb
        System.out.println(list);//[ccc, ddd]

        //4.修改元素
        String result3 = list.set(0, "eee");
        System.out.println(result3);//ccc
        System.out.println(list);//[eee, ddd]

        //5.查询元素
        String result4 = list.get(1);
        System.out.println(result4);//ddd
        System.out.println(list);//[eee, ddd]

        //6.遍历
        for (int i = 0; i < list.size(); i++) {
            String result = list.get(i);
            System.out.println(result);
        }

    }
}

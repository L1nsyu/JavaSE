package a10.ArrayList.练习添加字符串和整数并遍历;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        //byte      --->Byte
        //short     --->Short
        //char      --->Character
        //int       --->Integer
        //long      --->Long
        //float     --->Float
        //double    --->Double
        //boolean   --->Boolean

        //1.创建集合
        ArrayList<Integer> list1 = new ArrayList<Integer>();

        //2.添加元素
        //JDk5 以后int Integer 之间是可以互相转化的
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        //3.遍历
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }


        ArrayList<Character> list2 = new ArrayList<>();
        list2.add('a');
        list2.add('b');
        list2.add('c');

        System.out.println(list2);

    }
}

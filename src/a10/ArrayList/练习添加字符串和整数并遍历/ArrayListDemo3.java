package a10.ArrayList.练习添加字符串和整数并遍历;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        //1.创建集合
        ArrayList<String> list = new ArrayList<String>();

        //2.添加元素
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");

        //3.遍历
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.println(list.get(i));
            } else {
                System.out.println(list.get(i) + ",");
            }
        }
        System.out.println(list);
    }
}

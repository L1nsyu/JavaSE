package b17.集合进阶.TreeMap的基本使用和基础练习;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo2 {
    public static void main(String[] args) {
        //要求2:按照id的降序排列

        //因为默认排序已经满足不了需求了,所以需要 创建集合时传递Comparator比较器对象,指定比较规则。

        //1.创建集合对象
        //Integer , Double  默认情况下都是按照升序排列的
        //String 按照ASCII码表中对应的数组升序进行排列
        //eg: abcdefg.....
        TreeMap<Integer, String> tm = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //o1:当前要添加的元素
                //o2:表示已经在红黑树中存在的元素
                return o2 - o1;
            }
        });


        //2.添加元素
        tm.put(4, "康师傅");
        tm.put(1, "奥利奥");
        tm.put(3, "可乐");
        tm.put(5, "六个核桃");
        tm.put(2, "雪碧");


        //3.打印集合
        System.out.println(tm);

    }
}

package b17.集合进阶.TreeMap的基本使用和基础练习;

import java.util.TreeMap;

public class TreeMapDemo1 {
    public static void main(String[] args) {
        //需求1:
        //      键:整数表示id
        //      值:字符串表示商品名称
        //      要求1:按照id的升序排列
        //      要求2:按照id的降序排列


        //要求1:按照id的升序排列(TreeMap的 自然排序/默认排序):
        //1.创建集合对象
        TreeMap<Integer, String> tm = new TreeMap<>();

        //2.添加元素
        tm.put(4, "康师傅");
        tm.put(1, "奥利奥");
        tm.put(3, "可乐");
        tm.put(5, "六个核桃");
        tm.put(2, "雪碧");

        //3.打印集合
        System.out.println(tm);//{1=奥利奥, 2=雪碧, 3=可乐, 4=康师傅, 5=六个核桃}



    }
}

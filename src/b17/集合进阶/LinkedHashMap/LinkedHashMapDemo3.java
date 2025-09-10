package b17.集合进阶.LinkedHashMap;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo3 {
    public static void main(String[] args) {
        //LinkedHashMap:
        //  由键决定:
        //      有序,不重复,无索引
        //  有序:
        //      保证存储和取出的顺序一致
        //  原理:
        //      底层数据结构依然是哈希表,只是每一键值对元素又额外的多了一个双链表的机制记录存储的顺序


        //1.创建集合
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();

        //2.添加元素
/*        lhm.put("c",789);
        lhm.put("c",789);
        lhm.put("d",456);
        lhm.put("e",789);
        */


        //3.打印集合
//        System.out.println(lhm);//{c=789, d=456, e=789}

        lhm.put("c",789);
        lhm.put("c",123);
        lhm.put("d",456);
        lhm.put("e",789);

        //3.打印集合
        System.out.println(lhm);//{c=123, d=456, e=789}

    }
}

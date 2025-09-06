package a16.集合进阶.Ⅰ泛型类Ⅱ泛型方法Ⅲ泛型接口;

import java.util.ArrayList;

public class GenericsDemo3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        ListUtil.addAll(list, "aaa", "bbb", "ccc", "ddd");

        System.out.println(list);//[aaa, bbb, ccc, ddd]

        System.out.println("-----------------------");
        ArrayList<Integer> list2 = new ArrayList<>();

//        ListUtil.addAll(list2,1,2,3,4);

//        System.out.println(list2);//[1, 2, 3, 4]

        //那现在我有一个小问题,当我连我需要加几个元素都不知道的情况下,
        //我该怎么办呢?
        //小拓展(后面会教,认识即可)
        ListUtil.addAll2(list2, 1, 2);
        System.out.println(list2);//[1, 2]

    }
}

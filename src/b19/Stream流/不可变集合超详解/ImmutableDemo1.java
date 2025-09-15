package b19.Stream流.不可变集合超详解;

import java.util.Iterator;
import java.util.List;

public class ImmutableDemo1 {
    public static void main(String[] args) {
        //创建不可变的list集合
        //一旦创建完毕之后,是无法进行修改的,在下面的代码中,只能进行查询操作
        List<String> list = List.of("a", "b", "c");

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));


        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("--------------------------");

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("--------------------------");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

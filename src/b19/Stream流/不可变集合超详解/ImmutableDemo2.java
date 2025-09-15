package b19.Stream流.不可变集合超详解;

import java.util.Iterator;
import java.util.Set;

public class ImmutableDemo2 {
    public static void main(String[] args) {
        //创建不可变的Set集合
        //一旦创建完毕之后,是无法进行修改的,在下面的代码中,只能进行查询操作

        //细节:
        //1.当我们要获取一个不可变的Set集合时,里面的参数一定要保证唯一性

        Set<String> list = Set.of("a", "b", "c");

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("--------------------------");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }


    }
}

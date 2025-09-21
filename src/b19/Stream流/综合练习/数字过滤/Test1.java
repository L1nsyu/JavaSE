package b19.Stream流.综合练习.数字过滤;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {
    public static void main(String[] args) {
/*       定义一个集合,并添加一些整数
         1,2,3,4,5,6,7,8,9,10
         过滤奇数,只留下偶数
         并将结果保存起来
        */

        //1.创建一个集合
        ArrayList<Integer> list = new ArrayList<>();

        //2.添加元素
        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //3.过滤奇数,只留下偶数
        //创建一个Stream流,用来过滤奇数
        List<Integer> collect = list.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(collect);

    }
}

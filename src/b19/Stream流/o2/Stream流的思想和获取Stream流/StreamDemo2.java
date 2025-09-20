package b19.Stream流.o2.Stream流的思想和获取Stream流;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {
        //单列集合          default Stream<E> stream()                          Collection中的默认方法
        //双列集合          无                                                   无法直接使用stream流
        //数组             public static <T> Stream<T> stream(T[] array)       Arrays工具类中的静态方法
        //一堆零散数据      public static<T> Stream<T> of(T... values)            Stream接口中的静态方法


        //1.单列集合获取Stream流⭐⭐
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "a", "b", "c", "d", "e", "f");

        //2.获取到一条流水线,并把集合当中的数据放到流水线上
        Stream<String> stream = list.stream();
        //使用终结方法打印一下流水线上的所有数据
        //forEach 的底部的参数是一个函数式接口 参数需要写对应的实现类对象
        //匿名内部类
        stream.forEach(new Consumer<String>() {
            @Override
            public void accept(String t) {
                System.out.println(t);
            }
        });

        System.out.println("-------------------------------");

        list.stream().forEach(t -> System.out.println(t));

    }
}

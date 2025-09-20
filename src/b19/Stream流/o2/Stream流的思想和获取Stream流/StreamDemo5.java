package b19.Stream流.o2.Stream流的思想和获取Stream流;

import java.util.stream.Stream;

public class StreamDemo5 {
    public static void main(String[] args) {
        //一堆零散数据      public static<T> Stream<T> of(T... values)            Stream接口中的静态方法


        Stream.of("a", "b", "c", "d", "e", "f").forEach(name -> System.out.println(name));

        System.out.println("-------------------------------");

        Stream.of(1, 2, 3, 4, 5, 6).forEach(name -> System.out.println(name));
    }
}

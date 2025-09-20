package b19.Stream流.o2.Stream流的思想和获取Stream流;

import java.util.Arrays;

public class StreamDemo4 {
    public static void main(String[] args) {
        //数组             public static <T> Stream<T> stream(T[] array)       Arrays工具类中的静态方法

        //1.创建一个数组⭐⭐
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};

        String[] arr2 = {"a", "b", "c", "d", "e", "f"};

        //2.获取stream流
        Arrays.stream(arr1).forEach(s -> System.out.println(s));

        System.out.println("-------------------------------");

        Arrays.stream(arr2).forEach(s -> System.out.println(s));

        //注意:⭐⭐
        //Stream接口中静态方法of的细节
        //方法的形参是一个可变参数,可以传递一堆零散的数据,也可以传递数组
        //但是数组必须是应用数据类型,如果传递基本数据类型,是会吧整个数组当作一个元素,放到Stream当中.

    }
}

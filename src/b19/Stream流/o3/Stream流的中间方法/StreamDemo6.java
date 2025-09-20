package b19.Stream流.o3.Stream流的中间方法;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class StreamDemo6 {
    public static void main(String[] args) {
/*      filter 过滤
        limit 获取前几个元素
        skip 跳过前几个元素

        注意1:⭐⭐
        中间方法, 返回新的Stream流, 原来的Stream流只能使用一次, 建议使用链式编程
        eg:例如流经过了第一个filter之后,到达了第二个filter,此时再想获取第一个filter的流的信息,是不允许的
        原来的Stream流只能使用一次, 所以建议使用链式编程

        注意2:⭐⭐
        修改Stream流中的数据, 不会影响原来集合或者数组中的数据     */

        //1.创建单列数组
        ArrayList<String> list = new ArrayList<String>();

        //2.添加元素
        Collections.addAll(list, "张无忌", "赵敏", "周芷若", "张三丰", "张杰", "张飞");

/*      ⭐⭐
        list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                //如果返回值为True,表示当前数据留下
                //如果返回值为false,表示当前数据舍弃不要
                return s.startsWith("张");
            }
        }).forEach(s -> System.out.println(s));
*/

        list.stream().filter(s -> s.startsWith("张")).forEach(s -> System.out.println(s));

        System.out.println("--------------------------------");

        //        limit 获取前几个元素

        list.stream().limit(3).forEach(s -> System.out.println(s));

        System.out.println("--------------------------------");
        //        skip 跳过前几个元素
        list.stream().skip(3).forEach(s -> System.out.println(s));

    }
}

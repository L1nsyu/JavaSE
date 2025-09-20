package b19.Stream流.o3.Stream流的中间方法;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class StreamDemo7 {
    public static void main(String[] args) {
/*      distinct 元素去重, 依赖 (hashCode和equals方法)⭐⭐
            细节:idea 已经帮我们重写了关于String类型的 hashCode和equals方法 ,
            但是如果类型是自己创建的引用数据类型的话,需要重写hashCode和equals方法


        concat      合并a和b两个流为一个流⭐⭐

        注意1:⭐⭐
        中间方法, 返回新的Stream流, 原来的Stream流只能使用一次, 建议使用链式编程
        eg:
        例如流经过了第一个filter之后, 到达了第二个filter, 此时再想获取第一个filter的流的信息, 是不允许的
        原来的Stream流只能使用一次, 所以建议使用链式编程

        注意2:⭐⭐
        修改Stream流中的数据, 不会影响原来集合或者数组中的数据*/

        ArrayList<String> list1 = new ArrayList<String>();
        Collections.addAll(list1, "张无忌","张无忌","张无忌", "赵敏", "周芷若", "张三丰", "张杰", "张飞");

        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "关羽", "刘备");

        list1.stream().distinct().forEach(s -> System.out.println(s));

        System.out.println("-----------------------");

        Stream.concat(list1.stream(), list2.stream()).forEach(s -> System.out.println(s));

    }
}

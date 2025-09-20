package b19.Stream流.o3.Stream流的中间方法;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class StreamDemo8 {
    public static void main(String[] args) {
        //map           转换流中的数据类型

        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "张无忌-15", "赵敏-14", "周芷若-18", "张三丰-60", "张杰-23", "张飞-35");
        //需求:只获取里面的年龄并进行打印
        //String -> int

        //第一个类型:流中原本的数据类型
        //第二个类型:要转成之后的类型

        //apply的形参s:依次表示流里面的每一个数据
        //返回值:表示转换之后的数据

        //当map方法执行完毕之后,流上的数据就变成了整数
        //所以在下面forEach当中,s依次表示流里面的每一个数据,这个数据现在就是整数了
        list.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                //将一个字符串分割成两个字符串
                String[] arr = s.split("-");
                String ageString = arr[1];
                int age = Integer.parseInt(ageString);
                return age;
            }
        }).forEach(s -> System.out.println(s));


        System.out.println("----------------------------");
        //"张无忌-15"
        list.stream()
                .map(s -> Integer.parseInt(s.split("-")[1]))
                .forEach(s -> System.out.println(s));
    }
}

package b17.集合进阶.集合工具类Collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo1 {
    public static void main(String[] args) {
        //public static <T> boolean addAll(collection<T>c, T... elements)       批量添加元素
        // public static void shuffle(List<?> list)                             打乱List集合元素的顺序


        //addAll   批量添加方法
        //1.创建集合对象
        ArrayList<String> list = new ArrayList<>();


        //2.批量添加方法
        //因为Colletions是工具类 ,因为工具类本身没有意义,所以工具类的构造方法是私有化的
        //而且工具类的方法都是静态方法,方便直接调用

        Collections.addAll(list, "a", "b", "c", "adc", "adc", "gdf", "FSc", "adcfd", "353");


        //3.打印集合
        System.out.println(list);//[a, b, c, adc, adc, gdf, FSc, adcfd, 353]

        //4.打乱集合
        Collections.shuffle(list);
        System.out.println(list);


    }
}

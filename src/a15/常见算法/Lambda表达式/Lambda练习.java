package a15.常见算法.Lambda表达式;

import java.util.Arrays;
import java.util.Comparator;

public class Lambda练习 {
    public static void main(String[] args) {
        //定义数组并存储一些字符串，利用Arrays中的sort方法进行排序
        // 要求:
        //按照字符串的长度进行排序，短的在前面，长的在后面。
        // (暂时不比较字符串里面的内容)

        String[] arr = {"a", "aaaa", "aaa", "aa"};

        //如果以后我们要把数组中的数据按照指定的方式进行排序,就需要用到sort方法,而且要指定排序的规则
        Arrays.sort(arr, (o1, o2) ->
                //字符串的长度进行排序
                //简单理解:
                //o1-o2 :升序排序
                //o2-o1 :降序排序
                o1.length() - o2.length()

        );

        //打印数组
        System.out.println(Arrays.toString(arr));//[a, aa, aaa, aaaa]
    }
}

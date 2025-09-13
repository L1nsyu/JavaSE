package b17.集合进阶.集合工具类Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsDemo2 {
    public static void main(String[] args) {
        //public static <T> void sort(List<T> list)                         排序
        //public static <T> void sort(List<T> list, comparator<T> c)        根据指定的规则进行排序
        //public static <T> int binarySearch(List<T> list, T key)           以二分查找法查找元素
        //public static <T> void copy(List<T> dest, List<T> src)            拷贝集合中的元素
        //public static <T> int fill(List<T> list,T obj)                    使用指定的元素填充集合
        //public static <T>void max/min(collection<T> col1)                 根据默认的自然排序获取最大/小值
        //public static <T> void swap(List<?> list, int i, int j)           交换集合中指定位置的元素


        System.out.println("-------------sort默认规则-----------------");
        //排序:

        //默认规则,需要重写Comparable接口compareTo方法,Integer已经实现,按照从小到大的顺序排列
        //如果是自定义对象,需要自己指定时间
        ArrayList<Integer> list1 = new ArrayList<>();
        //批量添加元素
        Collections.addAll(list1, 10, 23, 36, 42, 5, 6, 17, 8);
        //排序
        Collections.sort(list1);
        System.out.println(list1);//[5, 6, 8, 10, 17, 23, 36, 42]

        System.out.println("-------------sort自己指定规则-----------------");
        //根据指定的规则进行排序:

        Collections.sort(list1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(list1);//[42, 36, 23, 17, 10, 8, 6, 5]


        System.out.println("-------------binarySearch-----------------");
        //以二分查找法查找元素:

        //需要元素有序
        ArrayList<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(Collections.binarySearch(list2, 9));//8
        System.out.println(Collections.binarySearch(list2, 1));//0
        System.out.println(Collections.binarySearch(list2, 20));//-11

        System.out.println("-------------copy-----------------");
        //拷贝集合中的元素

        //把list3中的元素拷贝到list4中
        //会覆盖原来的元素
        //注意点:如果list3的长度>list4的长度,方法会报错
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();
        Collections.addAll(list3, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Collections.addAll(list4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        Collections.copy(list4, list3);
        System.out.println(list3);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        System.out.println(list4);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]


        System.out.println("-------------fill---------------");
        //使用指定的元素填充集合

        //把集合中现有的所有数据,都修改为指定数据
        ArrayList<Integer> list5 = new ArrayList<>();
        Collections.addAll(list5, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Collections.fill(list5, 10);
        System.out.println(list5);//[10, 10, 10, 10, 10, 10, 10, 10, 10, 10]


        System.out.println("-------------max/min---------------");
        //根据默认的自然排序获取最大/小值

        //求最大值和最小值
        ArrayList<Integer> list6 = new ArrayList<>();
        ArrayList<Integer> list7 = new ArrayList<>();
        Collections.addAll(list6, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Collections.addAll(list7, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(Collections.max(list6));//10
        System.out.println(Collections.min(list7));//1


        System.out.println("-------------max/min指定规则---------------");
        //String中默认是按照字母的abcdefg顺序进行排列的
        //现在我要 求最长的字符串
        //默认的规则无法满足,可以自己指定规则
        //求指定规则的最大值和最小值
        ArrayList<String> list8 = new ArrayList<>();
        Collections.addAll(list8, "a", "aa", "aaa", "aaaa", "bbb", "ddddd");
        String ruleMax = Collections.max(list8, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        System.out.println(ruleMax);//ddddd


        System.out.println("-------------swap---------------");
        //交换集合中指定位置的元素

        ArrayList<Integer> list9 = new ArrayList<>();
        Collections.addAll(list9, 1, 2, 3);
        Collections.swap(list9, 0, 1);
        System.out.println(list9);//[2, 1, 3]
    }
}

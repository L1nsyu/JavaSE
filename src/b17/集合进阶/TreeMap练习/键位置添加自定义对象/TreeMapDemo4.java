package b17.集合进阶.TreeMap练习.键位置添加自定义对象;

import java.util.TreeMap;
import java.util.function.BiConsumer;

public class TreeMapDemo4 {
    public static void main(String[] args) {
        //需求:
        //字符串“aababcabcdabcde”
        //请统计字符串中每一个字符出现的次数，并按照以下格式输出
        //输出结果:
        //a(5)b(4)c(3)d(2)e(1)

        //新的统计思想:利用map集合进行统计

        //如果题目中没有要求对结果进行排序，默认使用HashMap
        // 如果题目中要求对结果进行排序，请使用TreeMap

        //键:表示要统计的内容
        // 值:表示次数


        //1.定义字符串
        String s = "aababcabcdabcde";


        //2.创建TreeMap集合
        TreeMap<Character, Integer> tm = new TreeMap<>();

        //2.遍历字符串得到里面的每一个字符
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            //拿着c 到集合当中判断是否存在
            //存在,表示当前字符又出现了一次
            //不存在,表示当前字符是第一次出现
            if (tm.containsKey(c)) {
                //存在
                //先把已经出现的次数拿出来
                Integer count = tm.get(c);
                //当前字符有出现了一次
                count++;
                //把自增后的结果再添加到集合当中
                tm.put(c, count);
            } else {
                //不存在
                tm.put(c, 1);
            }
        }

        //4.打印集合
        System.out.println(tm);


        //5.遍历集合,并按照指定的格式进行拼接
        //输出结果:
        //a(5)b(4)c(3)d(2)e(1)

        StringBuilder sb = new StringBuilder();
        tm.forEach(new BiConsumer<Character, Integer>() {
            @Override
            public void accept(Character key, Integer value) {
                sb.append(key).append("(").append(value).append(")");
            }
        });
        System.out.println(sb);
    }
}

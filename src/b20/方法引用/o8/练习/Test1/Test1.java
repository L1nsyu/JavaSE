package b20.方法引用.o8.练习.Test1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;

public class Test1 {
    public static void main(String[] args) {
        //需求:
        //  集合中存储一些字符串的数据,比如:张三,23
        //  收集到Student类型的数组当中

        //1.创建集合并添加元素
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌,15", "周芷若,14", "赵敏,13", "张三丰,20", "张强,100", "张翠山,40", "张良,35");

        //2.收集到Student类型的数组当中 -->
        //2.1 先把字符串变成Student对象,
        //2.2 然后再把Student对象收集起来.

        Student[] arr = list.stream()
                //提示:map(Student::new) 需要在Student类中加上形参唯一的构造方法
                .map(Student::new).toArray(Student[]::new);
        System.out.println(Arrays.toString(arr));


    }
}

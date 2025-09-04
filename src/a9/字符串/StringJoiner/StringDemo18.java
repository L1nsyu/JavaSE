package a9.字符串.StringJoiner;

import java.util.StringJoiner;

public class StringDemo18 {
    public static void main(String[] args) {
        //1.创建一个对象,并指向中间的间隔符号
        StringJoiner sj = new StringJoiner("---");

        //2.添加元素
        sj.add("aaa").add("bbb").add("ccc");

        //3.打印结果
        System.out.println(sj);
    }
}

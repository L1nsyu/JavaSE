package a14.常用API.正则表达式;

import com.google.gson.internal.bind.util.ISO8601Utils;

public class RegexDemo3 {
    public static void main(String[] args) {
        // \ : 表示转义字符 ;改变后面那个字符原本的含义
        //练习: 以字符串的形式打印一个双引号
        //" 在java中 表示字符串的开头或者结尾

        //此时这里的 \ 表示转义字符,改变后面那个字符原本的含义
        //把他变成了一个普普通通的双引号而已
        System.out.println("\""); // "

        //  \ : 表示转义字符
        //  \\前面的\是一个转义字符,改变了后面\原本的含义,把他变成了一个普普通通的\而已
        //eg: System.out.println("yunsuanfu\\src\\a14\\常用API\\正则表达式\\RegexDemo1.java");

        // . :表示任意一个字符
        System.out.println("你".matches("."));//true
        System.out.println("你a".matches(".."));//true

        // \\d: 表示任意的一个数字
        //简单来记一下: 两个\ 表示一个\
        System.out.println("a".matches("\\d"));//false
        System.out.println("3".matches("\\d"));//true
        System.out.println("333".matches("\\d\\d\\d"));//true

        // \\w : 表示只能是一个单词字符 [a-zA-Z_0-9]
        System.out.println("a".matches("\\w"));//true
        System.out.println("2".matches("\\w"));//true
        System.out.println("21".matches("\\w"));//false
        System.out.println("你".matches("\\w"));//false
        System.out.println("_".matches("\\w"));//true


        //非单词字符
        System.out.println("你".matches("\\W"));//true

        System.out.println("-------------以上的正则表达式只能验证单个字符---------------");

        //必须是数字, 字母, 下划线 至少6位
        System.out.println("2442fsfsf".matches("\\w{6,}"));//true
        System.out.println("244f".matches("\\w{6,}"));//false

        //必须是数字和字符, 必须是4位
        System.out.println("23dF".matches("[a-zA-Z0-9]{4}"));//true
        System.out.println("23_F".matches("[a-zA-Z0-9]{4}"));//false
        System.out.println("23dF".matches("[\\w&&[^_]]{4}"));//true
        System.out.println("23_F".matches("[\\w&&[^_]]{4}"));//false


    }
}

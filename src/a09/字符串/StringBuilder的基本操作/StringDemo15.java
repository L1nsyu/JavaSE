package a09.字符串.StringBuilder的基本操作;

import java.util.Scanner;

public class StringDemo15 {
    public static void main(String[] args) {
        //链式编程:
        //当我们在调用一个方法的时候,不需要用变量接收他的结果,可以继续调用其他方法
        //eg: String s  = getString();
        //      int len = s.length();

        int length = getString().substring(1).replace("A", "Q").length();
        System.out.println(length);
    }

    public static String getString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输出一个字符串");
        String str = sc.next();
        return str;
    }
}

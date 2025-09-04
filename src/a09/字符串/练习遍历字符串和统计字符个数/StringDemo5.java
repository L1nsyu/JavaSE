package a09.字符串.练习遍历字符串和统计字符个数;

import java.util.Scanner;

public class StringDemo5 {
    public static void main(String[] args) {
        //1.键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str1 = sc.next();

        //2.遍历
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            System.out.println(c);
        }
    }
}

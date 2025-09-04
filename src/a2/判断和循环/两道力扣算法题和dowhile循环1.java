package a2.判断和循环;

import java.util.Scanner;

public class 两道力扣算法题和dowhile循环1 {
    public static void main(String[] args) {
        //给你一个整数 x需求:
        //如果x是一个回文整数，打印 true，
        // 否则，返回 false
        // 回文数是指正序(从左向右)和倒序(从右向左)读都是一样的整数解释:
        // 例如，121 是回文，而 123 不是。

        //需求:给你一个整数x。
        //如果x是一个回文整数，打印 true，否则，返回 false 。
        //解释:回文数是指正序(从左向右)和倒序(从右向左)读都是一样的整数。
        //例如，121 是回文，而 123 不是。

        Scanner sc = new Scanner(System.in);
        System.out.println("请你键盘录入一个整数x:");
        int x = sc.nextInt();
        int temp = x;
        int num = 0;
        while (x > 0) {
            int ge = x % 10;
            x = x / 10;
            num = num * 10 + ge;
        }
        if (temp == num) {
            System.out.println(temp +"是回文数");
        }else  {
            System.out.println(temp +"不是回文数");
        }
    }
}

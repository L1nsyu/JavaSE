package a1.运算符;

import java.util.Scanner;

public class 短路逻辑运算符 {
    public static void main(String[] args) {
        //需求:
        //数字6是一个真正伟大的数字，键盘录入两个整数。
        //如果其中一个为 6，最终结果输出true。
        //如果它们的和为 6的倍数。最终结果输出true。
        //其他情况都是false。

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int a = sc.nextInt();
        System.out.println("请输入一个整数");
        int b = sc.nextInt();

        boolean c = a == 6 || b == 6 || (a + b) % 6 == 0;
        System.out.println(c);
    }
}

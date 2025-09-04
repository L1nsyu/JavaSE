package a2.判断和循环;

import java.util.Scanner;

public class 两道力扣算法题和dowhile循环2 {
    public static void main(String[] args) {
        //需求:给定两个整数，被除数和除数(都是正数，且不超过int的范围)将两数相除，
        //要求不使用乘法、除法和 % 运算符。得到商和余数。

        Scanner sc = new Scanner(System.in);
        System.out.println("请你键盘录入一个除数和被除数");
        int dividend = sc.nextInt();
        int divisor = sc.nextInt();
        int count = 0;
        while (dividend >= divisor) {
            dividend -= divisor;
            count++;
        }
        System.out.println("商为:" + count);
        System.out.println("余数为:" + dividend);
    }
}

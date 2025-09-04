package a1.运算符;

import java.util.Scanner;

public class 三元运算符2 {
    public static void main(String[] args) {
        //需求:动物园里有两只老虎，体重分别为通过键盘录入获得请用程序实现判断两只老虎的体重是否相同。

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        String result = a == b ? "相同" : "不同";
        System.out.println(result);
    }
}

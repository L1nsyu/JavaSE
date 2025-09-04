package a1.运算符;

import java.util.Scanner;

public class 算术运算符详情Test {
    public static void main(String[] args) {
        //键盘录入一个三位数,获取其中的个十百位

        //1.键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int num = sc.nextInt();

        //2.获取个位,十位,百位
        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 100 % 10;
        System.out.println(ge);
        System.out.println(shi);
        System.out.println(bai);
    }
}

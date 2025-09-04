package a03.循环高级综合练习;

import java.util.Scanner;

public class 求平方根 {
    public static void main(String[] args) {
        //需求:键盘录入一个大于等于2的整数x，计算并返回x的平方根结果只保留整数部分，小数部分将被舍去。

        Scanner sc = new Scanner(System.in);
        System.out.println("请输出一个整数");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if (i * i == num) {
                System.out.println(i + "就是" + num + "的平方根");
                break;
            } else if (i * i > num) {
                System.out.println((i - 1) + "就是" + num + "平方根的整数部分");
                break;
            }
        }
    }
}

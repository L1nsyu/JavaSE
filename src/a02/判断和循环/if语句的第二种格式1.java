package a02.判断和循环;

import java.util.Scanner;

public class if语句的第二种格式1 {
    public static void main(String[] args) {
        //if语句的第二种格式
        /*if (关系表达式){
            语句体1;
        }else{
            语句体2;
        }
        */

        //需求:键盘录入一个整数，表示身上的钱。
        //如果大于等于100块，就是网红餐厅。
        //否则，就吃经济实惠的沙县小吃。

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数作为你的钱");
        int money = sc.nextInt();
        if (money > 100) {
            System.out.println("吃网红餐厅");
        }else{
            System.out.println("吃沙县小吃");
        }
    }
}

package a02.判断和循环;

import java.util.Scanner;

public class if语句的第二种格式2 {
    public static void main(String[] args) {
        //需求:
        //假设，用户在超市实际购买，商品总价为:600元。
        //键盘录入一个整数表示用户实际支付的钱。
        //如果付款大于等于600，表示付款成功。否则付款失败。

        Scanner sc = new Scanner(System.in);
        System.out.println("请输出一个整数作为你支付的钱");
        int pay = sc.nextInt();
        if(pay>=600){
            System.out.println("付款成功");
        }else{
            System.out.println("付款失败");
        }
    }
}

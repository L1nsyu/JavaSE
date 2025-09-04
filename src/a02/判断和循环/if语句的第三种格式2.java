package a02.判断和循环;

import java.util.Scanner;

public class if语句的第三种格式2 {
    public static void main(String[] args) {
        //在实际开发中，多种情况判断时，会用到if的第三种格式
        //需求:
        //商场都会有VIP的会员制，根据不同的会员会有不同的折扣。
        // 假设商品总价为1000，
        //键盘录入会员级别，并计算出实际支付的钱。
        //会员1级:打9折。
        //会员2级:打8折。
        //会员3级:打7折。
        //非会员:不打折，要打也是打骨折。

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的会员等级:");
        int VIPgarde = sc.nextInt();
        int price = 1000;
        if (VIPgarde == 1) {
            System.out.println("实际支付的钱为:" + (price * 0.9));
        } else if (VIPgarde == 2) {
            System.out.println("实际支付的钱为:" + (price * 0.8));
        } else if (VIPgarde == 3) {
            System.out.println("实际支付的钱为:" + (price * 0.7));
        } else {
            System.out.println("实际支付的钱为:" + price);
        }
    }
}

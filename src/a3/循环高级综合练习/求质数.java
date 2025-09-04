package a3.循环高级综合练习;

import java.util.Scanner;

public class 求质数 {
    public static void main(String[] args) {
        //要求:键盘录入一个整数x,判断该整数是否为一个质数.

        Scanner sc = new Scanner(System.in);
        System.out.println("请键盘录入一个整数:");
        int x = sc.nextInt();

        //定义一个变量,表示标记
        //标记着x是否为一个质数
        //true:是一个质数
        //false:不是一个质数

        //表示最初x就是一个质数
        boolean flag = true;

        for (int i = 2; i <= x - 1; i++) {
            if (x % i == 0) {
                flag = false;
//                System.out.println("这个数" + x + "不是质数");
                break;
//            } else {
//                System.out.println("这个数" + x + "是质数");
            }
        }

        //只有当这个循环结束了,表示这个范围之内所有的数字都判断完毕了
        //此时才能断定x是一个质数

        if (flag) {
            System.out.println("这个数" + x + "是质数");
        }else {
            System.out.println("这个数" + x + "不是质数");
        }


        //100000
        //2-99999
        //循环的次数高达10万次

        //推荐一个简化的思路
        //eg:81
        //1*81
        //3*27
        //9*9

        //以81的平方根9为中心
//        假设a*b=81;
//        那么a和b中,其中有一个数必定是小于9的;
//        另一个是大于等于9的;
//        int x = 81;
//        81 =9*9
//        如果这个范围(2,3,4,5,6,7,8,9)之内,所有的数字都不能被x整除(9不能在被拆分出来);
//        那么x就一定是一个质数;
//        for (int i = 2; i <= x的平方根; i++) {
//
//        }

    }
}

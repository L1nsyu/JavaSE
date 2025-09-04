package a03.循环高级综合练习;

import java.util.Random;
import java.util.Scanner;

public class 猜数字小游戏 {
    public static void main(String[] args) {
        //生成随机数:
        //在小括号中,书写的是生成随机数的范围
        //这个范围一定是从0开始的
        //到 这个数-1 结束
        //口诀:包头不包尾,包左不包右
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println(number);

        int count = 0;

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输出你要猜的数字:");
            int guess = sc.nextInt();
            count++;

            if (count == 3) {
                System.out.println("对了");
                break;
            }

            if (guess == number) {
                System.out.println("对了");
                break;
            } else if (guess > number) {
                System.out.println("大了");
            } else {
                System.out.println("小了");
            }
        }


        //秘诀:
//        用来生成任意数到任意数之间的随机数 eg:7-15,
//        1.让这个范围头尾都减去一个值,让这个范围从0开始,  -7  --> 0-8,
//        2.尾巴+1      8+1 =9,
//        3.最终的结果,再加上第一步减去的值.

//        Random random = new Random();
//        int number = random.nextInt(9)+ 7 ;
//        System.out.println(number);
    }
}

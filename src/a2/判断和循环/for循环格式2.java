package a2.判断和循环;

import java.util.Scanner;

public class for循环格式2 {
    public static void main(String[] args) {
        //求和


/*        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println(sum);
        */


        //扩展小点:
        //1.求和的变量不能定义在循环的里面,因为变量只在所属的大括号中有效
        //2.如果我们把变量定义在循环的里面,那么当前变量只能在本次循环中有效
        //当本次循环结束后,变量就会从内存消失
        //结论:如果以后我们要写累加求和的变量,可以把变量定义在循环的外面

        //需求:在实际开发中，如果要获取一个范围中的每一个数据时，会用到循环但是此时，
        // 大多情况下，不会获取所有的数据，
        // 而是获取其中符合要求的数据此时就需要循环和其他语句结合使用了
        // 比如:求1-100之间的偶数和

        /*
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println("从1-100的所有偶数和为:" + sum);
        */

        //键盘录入两个数字,表示一个范围,统计这个范围中,
        //既能被3整除,又能被5整除的数字有多少个

        Scanner sc = new Scanner(System.in);
        System.out.println("请你录入第一个数字:");
        int start = sc.nextInt();
        System.out.println("请你录入第二个数字:");
        int end = sc.nextInt();

        int sum = 0;
        int number = 0;
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum = sum + i;
                number += 1;
                System.out.println(i);
            }
        }

        System.out.println("这些数的总和为:" + sum);
        System.out.println("这些数的总个数为:" + number);
    }
}

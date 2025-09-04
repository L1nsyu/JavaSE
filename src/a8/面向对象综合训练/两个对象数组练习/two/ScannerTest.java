package a8.面向对象综合训练.两个对象数组练习.two;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        //键盘录入:
        //第一套体系:
        //nextInt() ; 接受整数
        //nextDouble() ; 接收小数
        //next() ;接受字符串
        //注意:遇到空格,制表符,回车就停止接受.这些符号后面的数据就不会接受了

        //第二套体系:
        //nextLine()  ;接受字符串
        //可以接受空格 , 制表符 ,遇到回车才会停止接受数据
        //键盘录入的两套体系不能混用

        Scanner sc = new Scanner(System.in);

/*        System.out.println("请输出一个整数");
        int num1 = sc.nextInt();//123 123
        System.out.println(num1);//123
        System.out.println("请输出第二个整数");
        int num2 = sc.nextInt();
        System.out.println(num2);//123
        */

/*        System.out.println("请输出一个字符串");
        String str1 = sc.next();//avc sfa
        System.out.println(str1);//avc
        System.out.println("请输出第二个字符串");
        String str2 = sc.next();
        System.out.println(str2);//sfa
        */

/*        System.out.println("请输出一个字符串");
        String line1 = sc.nextLine();//123 abc
        System.out.println(line1);//123 abc
        System.out.println("请输出第二个字符串");
        String line2 = sc.nextLine();//abc bcd
        System.out.println(line2);//abc bcd
        */


    }
}

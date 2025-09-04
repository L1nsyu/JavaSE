package a1.运算符;

import java.util.Scanner;

public class 赋值运算符和关系运算符2 {
    public static void main(String[] args) {
//    需求:
//    您和您的约会对象在餐厅里面正在约会。
//    键盘录入两个整数，表示你和你约会对象衣服的时髦度。
//    (手动录入0~10之间的整数，不能录其他)
//    如果你的时髦程度大于你对象的时髦程度，相亲就成功，输出true。否则输出false。

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入我们自己衣服的时髦度");
        int myFashion = sc.nextInt();
        System.out.println("请输入相亲对象衣服的时髦度");
        int girlFashion = sc.nextInt();

        boolean result = myFashion > girlFashion;

        System.out.println(result);
    }
}

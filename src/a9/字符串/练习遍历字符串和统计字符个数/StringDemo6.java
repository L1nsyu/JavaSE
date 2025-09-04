package a9.字符串.练习遍历字符串和统计字符个数;

import java.util.Scanner;

public class StringDemo6 {
    public static void main(String[] args) {
        //键盘录入一个字符串,统计该字符串中大写字母字符,小写字母字符,数字字符出现的次数

        //1.键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();

        //2.统计
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                smallCount++;
                //char类型的变量在参与计算的时候自动类型提升为int 查询ASCII码表
            } else if (c >= 'A' && c <= 'Z') {
                bigCount++;
            } else if (c >= '0' && c <= '9') {
                //注意此时的数字0和9要以字符的形式写,因为数字0和9也有对应的ASCII码
                numberCount++;
            }
        }
        //3.输出打印
        System.out.println("小写字母有:" + smallCount + "个");
        System.out.println("大写字母有:" + bigCount + "个");
        System.out.println("数字有:" + numberCount + "个");
    }
}

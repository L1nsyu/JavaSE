package a9.字符串.练习用户登录;

import java.util.Scanner;

public class StringDemo4 {
    public static void main(String[] args) {
        //需求:
        //已知正确的用户名和密码，请用程序实现模拟用户登录。
        //总共给三次机会，登录之后，给出相应的提示

        //1.定义两个变量记录正确的用户名和密码
        String rightUsername = "zhangsan";
        String rightPassword = "123456";

        //2.键盘录入用户名和密码
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名");
            String username = sc.next();
            System.out.println("请输入密码");
            String password = sc.next();

            //3.比较
            if (username.equals(rightUsername) && password.equals(rightPassword)) {
                System.out.println("用户登录成功");
                break;
            } else {
                if (i == 2) {
                    System.out.println("账号被锁定,请联系黑马官方客服:xxxxx");
                } else {
                    System.out.println("用户登录失败,用户名或密码有误,您还剩下" + (2 - i) + "次机会");
                }
            }
        }
    }
}

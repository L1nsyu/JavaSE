package a02.判断和循环;

import java.util.Scanner;

public class if语句的第三种格式1 {
    public static void main(String[] args) {
        //if语句的第三种格式:
//        if (关系表达式1) {
//            语句体1;
//        } else if (关系表达式2) {
//            语句体2;
//        }
//        .....
//        }else{
//        语句体n+1;
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("请录入一个整数输出小明的成绩:");
        int grade = sc.nextInt();
        if (grade > 0 && grade <= 100) {
            if (grade >= 95 && grade <= 100) {
                System.out.println("送自行车一辆");
            } else if (grade >= 90 && grade <= 94) {
                System.out.println("游乐场玩一天");
            } else if (grade >= 80 && grade <= 89) {
                System.out.println("游乐场玩一天");
            } else {
                System.out.println("揍一顿");
            }
        }else{
            System.out.println("当前的成绩不合法");
        }

    }
}

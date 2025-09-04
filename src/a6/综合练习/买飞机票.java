package a6.综合练习;

import java.util.Scanner;

public class 买飞机票 {
    public static void main(String[] args) {
        //需求:
        //机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱
        //按照如下规则计算机票价格:旺季(5-10月)头等舱9折，经济舱8.5折，淡季(11月到来年4月)头等舱7折，经济舱6.5折。

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票的原价:");
        double ticket = sc.nextInt();
        System.out.println("请输入当前的月份:");
        int month = sc.nextInt();
        System.out.println("请输入你选择的舱位(0:头等舱,1:经济舱):");
        int seat = sc.nextInt();


        //CTRL + ALT + M   自动抽取方法
        if (month >= 5 && month <= 10) {
            ticket = getTicket(seat, ticket, 0.9, 0.85);
//            ticket = getPrice(ticket, seat, 0.9, 0.85);
        } else if ((month >= 11 && month <= 12) || (month >= 1 && month <= 4)) {
            ticket = getTicket(seat, ticket, 0.7, 0.65);
//            ticket = getPrice(ticket, seat, 0.7, 0.65);
        } else {
            System.out.println("没有这个月份");
        }
        System.out.println("你的机票价格为:" + ticket);
    }

    public static double getTicket(int seat, double ticket, double x, double x1) {
        if (seat == 0) {
            ticket = ticket * x;
        } else if (seat == 1) {
            ticket = ticket * x1;
        } else {
            System.out.println("没有这个舱位");
        }
        return ticket;
    }

/*    public static double getPrice(double ticket, int seat, double v0, double v1) {
        if (seat == 0) {
            ticket = ticket * v0;
        } else if (seat == 1) {
            ticket = ticket * v1;
        } else {
            System.out.println("没有这个舱位");
        }
        return ticket;
    }*/
}

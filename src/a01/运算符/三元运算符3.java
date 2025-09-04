package a01.运算符;

public class 三元运算符3 {
    public static void main(String[] args) {
        //需求:一座寺庙里住着三个和尚，已知他们的身高分别为150cm、210cm、165cm请用程序实现获取这三个和尚的最高身高。

        int a = 150;
        int b = 210;
        int c = 165;

        int temparary = a > b ? a : b;
        int max = temparary > c ? temparary : c;
        System.out.println(max);
    }
}

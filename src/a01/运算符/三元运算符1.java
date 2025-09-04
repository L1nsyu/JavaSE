package a01.运算符;

public class 三元运算符1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int max = a > b ? a : b;
        System.out.println(max);

        System.out.println(a > b ? a : b);
    }
}

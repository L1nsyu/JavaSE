package a01.运算符;

public class 赋值运算符和关系运算符1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        a += b;
        //等同于a = (int)(a+b)
        System.out.println(a);//30
        System.out.println(b);//20


        //细节:
        //+=.-=,*=,/=,%= 底层都隐藏了一个强制转换类型
        short s = 1;
        s += 1;
        //等同于:s = (short)(s + 1)
        System.out.println(s);
    }
}

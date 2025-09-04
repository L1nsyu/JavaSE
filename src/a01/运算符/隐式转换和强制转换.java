package a01.运算符;

public class 隐式转换和强制转换 {
   public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 20;
        byte result = (byte)(b1+b2);
        System.out.println(result);//30

       //如果把b1 b2的值变成100,结果会发生错误,因为要转换的数据过大
    }
}

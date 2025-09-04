package a14.常用API.BigInteger基本使用和原理解析;

import java.math.BigInteger;

public class BigIntegerDemo2 {
    public static void main(String[] args) {
        //⭐public BigInteger add(BigInteger val)         加法
        //⭐public BigInteger subtract(BigInteger val)    减法
        //⭐public BigInteger multiply(BigInteger val)    乘法
        //⭐public BigInteger divide(BigInteger val)     除法，获取商
        //⭐public BigInteger[] divideAndRemainder(BigInteger val)        除法，获取商和余数
        //⭐public boolean equals(object x)               比较是否相同
        //⭐public BigInteger pow(int exponent)            次幂
        //⭐public BigInteger max/min(BigInteger val)     返回较大值/较小值
        //⭐public int intValue(BigInteger val)           转为int类型整数，超出范围数据有误


        //1. 创建两个BigInteger对象
        BigInteger bd1 = BigInteger.valueOf(10);
        BigInteger bd2 = BigInteger.valueOf(5);

        //2.加法 (加减乘除是一样的)
        BigInteger bd3 = bd1.add(bd2);
        System.out.println(bd3);

        System.out.println("------------------------------");
        //3.除法,获取商和余数
        BigInteger[] arr = bd1.divideAndRemainder(bd2);
        System.out.println(arr.length);
        System.out.println(arr[0]);
        System.out.println(arr[1]);

        System.out.println("------------------------------");
        //4.比较是否相同
        boolean result = bd1.equals(bd2);
        System.out.println(result);

        System.out.println("------------------------------");
        //5.次幂
        BigInteger bd4 = bd1.pow(2);
        System.out.println(bd4);

        System.out.println("------------------------------");

        //6.max / min
        BigInteger bd5 = bd1.max(bd2);
        System.out.println(bd5);
        BigInteger bd6 = bd1.min(bd2);
        System.out.println(bd6);

        //7.转为int类型整数，超出范围数据有误          (double long)一样
        BigInteger bd7 = BigInteger.valueOf(1000);
        int i = bd7.intValue();
        System.out.println(i);



    }
}

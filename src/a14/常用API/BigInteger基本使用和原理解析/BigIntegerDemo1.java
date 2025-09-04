package a14.常用API.BigInteger基本使用和原理解析;

import java.math.BigInteger;
import java.util.Random;

public class BigIntegerDemo1 {
    public static void main(String[] args) {
        //public BigInteger(int num,Random rnd)         获取随机大整数，范围:[0~2的num次方-1]
        //⭐public BigInteger(string val)                 获取指定的大整数
        //public BigInteger(string val,int radix)       获取指定进制的大整数
        //⭐public static BigInteger value0f(long val)    静态方法获取BigInteger的对象，内部有优化
        //细节:对象一旦创建里面的数据不能发生改变，

        //1.获取一个随机的大整数
        Random r = new Random();
        BigInteger bd1 = new BigInteger(4, r);
        System.out.println(bd1);//2  [0~15]

        //2.获取一个指定的大整数
        //细节:
        //字符串中必须是整数,不然报错
        BigInteger bd2 = new BigInteger("100");
        System.out.println(bd2);

        //3.获取指定进制的大整数
        //细节:
        //1.字符串中的数字必须是整数
        //2.字符串中的数字必须要跟进制吻合
        //比如二进制中,那么只能写0和1 ,写其他的会报错
        BigInteger bd3 = new BigInteger("111", 2);
        //二进制的一百 --> 4
        //二进制的111 ---> 7
        System.out.println(bd3);

        //4.静态方法获取BigInteger的对象,内部有优化
        //细节:
        //1.能表示的范围比较小,在long的范围之内,超出long的范围就不行了.
        //2.在内部对常用的数字: -16 ~ 16 进行了比较
        //   提前把 -16 ~ 16先创建好BigInteger的对象,如果多次获取不会重写创建新的
        BigInteger bd4 = BigInteger.valueOf(100);
        System.out.println(bd4);//100

        System.out.println(Long.MAX_VALUE);//9223372036854775807

        BigInteger bd5 = BigInteger.valueOf(16);
        BigInteger bd6 = BigInteger.valueOf(16);
        System.out.println(bd5 == bd6);//true

        BigInteger bd7 = BigInteger.valueOf(17);
        BigInteger bd8 = BigInteger.valueOf(17);
        System.out.println(bd7 == bd8);//false

        //5.对象一旦创建,内部的数据不能发生改变
        BigInteger bd9 = BigInteger.valueOf(1);
        BigInteger bd10 = BigInteger.valueOf(2);
        BigInteger result = bd9.add(bd10);
        System.out.println(result);//3
        //此时,不会修改参与计算的BigInteger对象中的值,而是产生了一个新的BigInteger对象记录 3


    }
}

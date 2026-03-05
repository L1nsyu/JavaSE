package a05.方法.o2.带参数的方法定义和调用;

public class Method3 {
    public static void main(String[] args) {
        //需求:求长方形的周长.
        getLength(5.2,1.3);
    }

    //方法:
    public static void getLength(double len, double width) {
        double result = (len + width) * 2;
        System.out.println(result);
    }
}

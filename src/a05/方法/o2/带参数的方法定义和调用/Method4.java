package a05.方法.o2.带参数的方法定义和调用;

public class Method4 {
    public static void main(String[] args) {
        //需求:定义一个方法,求圆的面积,将结果再方法中进行打印
        getArea(2);
    }

    //方法:
    public static void getArea(double radius) {
        double result = radius * radius * 3.14;
        System.out.println(result);
    }
}

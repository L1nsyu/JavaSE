package a05.方法;

public class 带参数的方法定义和调用2 {
/*    public static void main(String[] args) {
        //需求:求长方形的周长.
        getLength(5.2,1.3);
    }

    public static void getLength(double len, double width) {
        double result = (len + width) * 2;
        System.out.println(result);
    }
    */

    public static void main(String[] args) {
        //需求:定义一个方法,求圆的面积,将结果再方法中进行打印
        getArea(2);
    }

    public static void getArea(double radius) {
        double result = radius * radius * 3.14;
        System.out.println(result);
    }
}

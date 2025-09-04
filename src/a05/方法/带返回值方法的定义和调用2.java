package a05.方法;

public class 带返回值方法的定义和调用2 {
    public static void main(String[] args) {
        //需求:定义方法,比较两个长方形的面积
        double area1 = getArea(5.3, 1.7);
        double area2 = getArea(2.4, 2.7);

        if (area1 > area2) {
            System.out.println("第一个长方形更大");
        } else if (area1 < area2) {
            System.out.println("第二个长方形更大");
        } else {
            System.out.println("两个长方形一样大");
        }
    }

    public static double getArea(double len, double width) {
        double result = len * width;
        return result;
    }
}

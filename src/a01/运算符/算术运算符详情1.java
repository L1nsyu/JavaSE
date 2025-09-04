package a01.运算符;

public class 算术运算符详情1 {
    public static void main(String[] args) {
        System.out.println(3+2);
        System.out.println(5-1);
        System.out.println(7*9);

        /*在代码中,如果有小数参与计算,结果有可能是不精确的*/
        System.out.println(1.1+1.1);//2.2
        System.out.println(1.1+1.01);//2.1100000000000003
    }
}

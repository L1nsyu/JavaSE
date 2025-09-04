package a4.数组;

public class 数组的概述和静态初始化 {
    public static void main(String[] args) {
        //数组:指的是一种容器,可以用来储存 同种数据类型 的多个值
        //数组容器在储存的时候,需要结合隐式转换考虑
        //例如:int类型的数组容器  ✔(byte  short  int )       × (boolen double)
        //double类型的数组容器 ✔(byte short int long float double)
        //建议:数组的类型,和存储的数据类型保持一致

        //数组的初始化:就是在内存中,为数组容器开辟空间,并将数据存入容器中的过程
        //简化格式:数据类型[] 数组名 = {元素1,元素2,元素3....};
        //例子: int[] array = {11,22,33};


        int[] arr1 = new int[]{11,12,13,14};
        int[] arr2 = {11,12,13,14};

        String[] arr3 = new String[]{"11","12","13","14"};
        String[] arr4 = {"11","12","13","14"};

        double[] arr5 = new double[]{11.1,12.1,13.1,14.1};
        double[] arr6 = {11.1,12.1,13.1,14.1};  
    }
}

package a12.面向对象进阶.静态方法和工具类;

public class Test1 {
    public static void main(String[] args) {
        //测试工具类中的两个方法是否正确
        int[] arr1 = {1, 2, 3, 4, 5};
        String str = ArrayUtil.printArr(arr1);
        System.out.println(str);


        double[] arr2 = {1.2, 1.3, 1.4, 1.6, 1.7};
        double avg = ArrayUtil.getAverage(arr2);
        System.out.println(avg);
    }
}

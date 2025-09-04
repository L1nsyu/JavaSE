package a04.数组;

public class 数组练习求最值 {
    public static void main(String[] args) {
        //求最值
        //需求:已知数组元素为{33,5,22,44,55}
        //请找出数组中最大值并打印再控制台

        int[] arr = {33,5,22,44,55};
        //临时认为第一个元素是最大的
        //max的初始化的值一定要是数组中的值
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);

    }
}

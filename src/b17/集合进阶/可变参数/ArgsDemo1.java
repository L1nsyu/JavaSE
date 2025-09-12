package b17.集合进阶.可变参数;

public class ArgsDemo1 {
    public static void main(String[] args) {
        //计算n个数据的和
        //之前的用到的方法
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
    }

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }
        return sum;
    }


}

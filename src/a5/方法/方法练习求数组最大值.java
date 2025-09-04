package a5.方法;

public class 方法练习求数组最大值 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 9, 10, 43};
        int max = getMax(arr);
        System.out.println(max);
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

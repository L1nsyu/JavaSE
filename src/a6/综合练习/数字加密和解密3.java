package a6.综合练习;

public class 数字加密和解密3 {
    public static void main(String[] args) {
        //按照加密1的规则解密
        //比如1983加密之后变成8346,解密之后变成1983

        int[] arr = {8, 3, 4, 6};
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0 && arr[i] <= 4) {
                arr[i] = arr[i] + 10;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] - 5;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }
}

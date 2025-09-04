package a6.综合练习;

public class 数字加密和解密2 {
    public static void main(String[] args) {
        int number = 123456;
        int count = 0;
        int temp = number;

        while (number != 0) {
            number = number / 10;
            count++;
        }
        System.out.println(count);

        int[] arr = new int[count];
        int index = arr.length - 1;

        while (temp != 0) {
            int ge = temp % 10;
            temp = temp / 10;
            arr[index] = ge;
            index--;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}

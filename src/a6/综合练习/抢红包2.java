package a6.综合练习;

import java.util.Random;

public class 抢红包2 {
    public static void main(String[] args) {
        //思路:1.把奖池里面的奖项打乱顺序

        int[] arr = {2, 588, 888, 1000, 10000};
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = random.nextInt(arr.length);
            int temp = arr[randomIndex];
            arr[randomIndex] = arr[i];
            arr[i] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

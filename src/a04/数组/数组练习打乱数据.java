package a04.数组;

import java.util.Random;

public class 数组练习打乱数据 {
    public static void main(String[] args) {
        //定义一个数组,存入1-5,要求打乱数组中所有数据的顺序

//        int[] arr = {1, 2, 3, 4, 5};
//        Random random = new Random();
//        int randomIndex = random.nextInt(arr.length);
//        System.out.println(arr[randomIndex]);

        int[] arr = {1, 2, 3, 4, 5};
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = random.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }


    }
}

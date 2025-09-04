package a4.数组;

import java.util.Random;

public class 数组练习求和并统计个数 {
    public static void main(String[] args) {
        //生成10个 1-100 之间的随机数存入数组
        //1.求出所有数据的和;
        //2.求所有数据的平均数;
        //3.统计有多少个数据比平均值小.

        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int number = random.nextInt(100) + 1;
            arr[i] = number;
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("所有数据的和是:" + sum);

        int avg = sum / arr.length;
        System.out.println("所有数据的平均数是:" + avg);


        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > avg) {
                count++;
            }
        }
        System.out.println("一共有:" + count + "个数据比平均数小");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}

package a6.综合练习;

import java.util.Random;

public class 抢红包1 {
    public static void main(String[] args) {
        //需求:
        //一个大V直播抽奖，奖品是现金红包，
        //分别有{2,588,888,1000,10000}五个奖金。
        //请使用代码模拟抽奖打印出每个奖项，奖项的出现顺序要随机且不重复。

        int[] arr = {2, 588, 888, 1000, 10000};
        int[] newArr = new int[arr.length];

        Random random = new Random();
        for (int i = 0; i < arr.length; ) {
            int randomIndex = random.nextInt(arr.length);
            int prize = arr[randomIndex];
            boolean flag = contains(newArr, prize);
            if (!flag) {
                newArr[i] = prize;
                i++;
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }

    public static boolean contains(int[] arr, int prize) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == prize) {
                return true;
            }
        }
        return false;
    }
}

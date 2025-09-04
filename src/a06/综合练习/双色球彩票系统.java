package a06.综合练习;

import java.util.Random;
import java.util.Scanner;

public class 双色球彩票系统 {
    public static void main(String[] args) {
        //1.生成中奖号码
        int[] createNumber = createNumbers();
        for (int i = 0; i < createNumber.length; i++) {
            System.out.print(createNumber[i] + " ");
        }


        //2.用户输入彩票号码
        int[] userInputNumber = userInputNumber();
/*        for (int i = 0; i < userInputNumber.length; i++) {
            System.out.print(userInputNumber[i] + " ");
        }*/

        //3.判断用户中奖情况
        int redCount = 0;
        int blueCount = 0;

        for (int i = 0; i < userInputNumber.length - 1; i++) {
            int redNumber = userInputNumber[i];
            for (int j = 0; j < createNumber.length - 1; j++) {
                if (redNumber == createNumber[j]) {
                    redCount++;
                    break;
                }
            }
        }

        int blueNumber = userInputNumber[userInputNumber.length - 1];
        if (blueNumber == createNumber[userInputNumber.length - 1]) {
            blueCount++;
        }

        if (redCount == 6 && blueCount == 1) {
            System.out.println("1等奖");
        } else if (redCount == 6 && blueCount == 0) {
            System.out.println("2等奖");
        } else if (redCount == 5 && blueCount == 1) {
            System.out.println("3等奖");
        } else if ((redCount == 5 && blueCount == 0) || (redCount == 4 && blueCount == 1)) {
            System.out.println("4等奖");
        } else if ((redCount == 4 && blueCount == 0) || (redCount == 3 && blueCount == 1)) {
            System.out.println("5等奖");
        } else if ((redCount == 2 && blueCount == 1) || (redCount == 1 && blueCount == 1) || (redCount == 0 && blueCount == 1)) {
            System.out.println("6等奖");
        } else {
            System.out.println("谢谢参与");
        }

        System.out.println("===========================");
        System.out.println(redCount);
        System.out.println(blueCount);
    }

    //用户输出选择的球的数字的方法
    public static int[] userInputNumber() {
        int[] arr = new int[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; ) {
            System.out.println("请你输出第" + (i + 1) + "个红球号码");
            int redNumber = sc.nextInt();
            if (redNumber > 0 && redNumber <= 33) {
                boolean flag = contains(arr, redNumber);
                if (!flag) {
                    arr[i] = redNumber;
                    i++;
                } else {
                    System.out.println("当前红球号码已经存在,请重新输出");
                }
            } else {
                System.out.println("当前红球号码已经超出范围,请重新输出");
            }
        }
        System.out.println("请输入蓝球号码");
        int blueNumber = sc.nextInt();
        if (blueNumber > 0 && blueNumber <= 16) {
            arr[arr.length - 1] = blueNumber;
        } else {
            System.out.println("当前蓝球号码超出范围");
        }
        return arr;
    }

    //生成的球的数字的方法
    public static int[] createNumbers() {
        int[] arr = new int[7];
        Random random = new Random();

        for (int i = 0; i < 6; ) {
            int redNumber = random.nextInt(33) + 1;
            boolean flag = contains(arr, redNumber);
            if (!flag) {
                arr[i] = redNumber;
                i++;
            }
        }

        int blueNumber = random.nextInt(16) + 1;
        arr[arr.length - 1] = blueNumber;
        return arr;
    }

    //判断是否重复的方法
    public static boolean contains(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }
}

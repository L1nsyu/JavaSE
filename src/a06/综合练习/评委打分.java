package a06.综合练习;

import java.util.Scanner;

public class 评委打分 {
    public static void main(String[] args) {
        //需求:
        //在唱歌比赛中，有6名评委给选手打分，分数范围是[0-100]之间的整数。
        //选手的最后得分为:去掉最高分、最低分后的4个评委的平均分，
        //请完成上述过程并计算出选手的得分。

        //1.我要干嘛?   定义一个数组,用来存储6名评委的打分(0-100)
        //2.我需要什么? 都不需要
        //3.干完了这件事情后是否需要返回? 需要返回

        int[] newArr = getScore();
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
        int max = getMax(newArr);
        int min = getMin(newArr);
        int sum = getSum(newArr);
        int avg = (sum - max - min) / (newArr.length - 2);
        System.out.println("选手的最终平均得分为:" + avg);

    }

    public static int[] getScore() {
        int[] scores = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; ) {
            System.out.println("请你输出评委的打分成绩");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100) {
                scores[i] = score;
                i++;
            } else {
                System.out.println("成绩不在范围内,继续录入,当前的录入的成绩为第" + i + "个");
            }
        }
        return scores;
    }


    public static int getMax(int[] newArr) {
        int max = newArr[0];
        for (int i = 1; i < newArr.length; i++) {
            if (max < newArr[i]) {
                max = newArr[i];
            }
        }
        System.out.println(max);
        return max;
    }

    //一键修改 : shift + f6

    public static int getMin(int[] newArr) {
        int min = newArr[0];
        for (int i = 1; i < newArr.length; i++) {
            if (min > newArr[i]) {
                min = newArr[i];
            }
        }
        System.out.println(min);
        return min;
    }

    public static int getSum(int[] newArr) {
        int sum = 0;
        for (int i = 0; i < newArr.length; i++) {
            sum += newArr[i];
        }
        return sum;
    }
}

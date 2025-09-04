package a6.综合练习;

import java.util.Random;

public class 开发验证码 {
    public static void main(String[] args) {
        //定义一个方法实现随机产生一个五位数的验证码
        //验证码格式:1.长度为5, 2.前四位是大写字母或者小写字母, 3.最后一位是数字

        //方法:
        //在以后如果我们要在一堆没有什么规律的数据中随机抽取
        //可以先把这些数据放到数组当中
        //再随机抽取一个索引

        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            //ASCII码表
            //97 -> A
            //65 -> a

            //大写字母
            if (i <= 25) {
                chs[i] = (char) (97 + i);
            } else if (i <= 51 && i >= 26) {
                //小写字母
                chs[i] = (char) (65 + i - 26);
            }
        }

        Random rand = new Random();

        String result = "";
        for (int i = 0; i < 4; i++) {
            int randomIndex = rand.nextInt(chs.length);
            System.out.println(chs[randomIndex]);
            result += chs[randomIndex];
        }
        System.out.println(result);

        int number = rand.nextInt(10);

        System.out.println(result + number);
    }
}

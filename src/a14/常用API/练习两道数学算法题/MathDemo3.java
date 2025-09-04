package a14.常用API.练习两道数学算法题;

public class MathDemo3 {
    public static void main(String[] args) {
        //要求一:有多少个水仙花数
        //水仙花数: 100 ~ 999

        //要求二:判断一下为什么没有两位自幂数
        //要求三:统计一下有多少个四叶玫瑰数 和 五角星数
        int count = 0;


        //得到每一个三位数
        for (int i = 100; i < 1000; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;

            //判断:
            //每一位的三次方之和跟本身进行比较
            double sum = Math.pow(ge, 3) + Math.pow(shi, 3) + Math.pow(bai, 3);
            if (sum == i) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);

    }
}

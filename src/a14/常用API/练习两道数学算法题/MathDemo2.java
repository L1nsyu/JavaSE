package a14.常用API.练习两道数学算法题;

public class MathDemo2 {
    public static void main(String[] args) {
        //判断一个数是否为一个质数
        System.out.println(isPrime(13));
        System.out.println(isPrime(997));

        //997   ---> 2~995次  ---> 30次

    }
    //判断一个数是否为一个质数的方法
    public static boolean isPrime(int number) {
        int count = 0;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            count++;
            if (number % i == 0) {
                return false;
            }
        }
        System.out.println(count);
        return true;
    }
}

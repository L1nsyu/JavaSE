package a14.常用API.三道综合练习;

public class Test3 {
    public static void main(String[] args) {
        //定义一个方法实现toBinaryString方法的效果,将一个十进制整数转成字符串表示的二进制


        System.out.println(toBinaryString(6));

    }

    public static String toBinaryString(int number) {
        //核心逻辑:不断的去除以2 ,得到余数,一直到商为0 就结束
        //还想要把余数倒着(拼接!!)起来

        //定义一个StringBuilder用来拼接余数
        StringBuilder sb = new StringBuilder();

        //利用循环不断的除于2 获取余数
        int remaindar = 0;
        while (true) {
            if (number == 0) {
                break;
            }
            //获取余数 %
            remaindar = number % 2;
            //倒着拼接
            //正确的2进制是 110
            //sb.append(remaindar);//011
            //insert () : 第一个参数0 表示要把第二个参数 插到头部的位置
            sb.insert(0,remaindar);//110

            //除于 2
            number = number / 2;
        }
        return sb.toString();
    }
}

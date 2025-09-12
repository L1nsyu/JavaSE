package b17.集合进阶.可变参数;

public class ArgsDemo3 {
    public static void main(String[] args) {
        //可变参数的小细节:
        //1.在方法的形参中最多只能写一个可变参数
        //可变参数,可以理解为一个大胖子,有多少吃多少
        //方便理解:
        //如果一个方法内有两个可变参数,那么输出的参数是不是都被的一个可变参数吃了
        //就会导致后面的可变参数没有东西吃

        //2.在方法的形参当中,如果除了可变参数以外,还有其他的形参,那么可变参数要写在最后
        getSum(0, 1, 2, 3, 4, 5, 6, 7, 8);
    }

    public static int getSum(int a, int... args) {
        return 0;
    }

}

package a5.方法;

public class 带参数的方法定义和调用1 {
    public static void main(String[] args) {
        //定义格式:
        //单个参数:
        //public static void 方法名(参数){
        //      ......
        // }

        //多个参数:
        //public static void 方法名(参数1,参数2,.....){
        //      ......
        // }


        //调用格式:
        //单个参数:
        //方法名(参数)

        //多个参数
        //方法名(参数1,参数2,.....)

        //注意:方法调用时,参数的数量与类型必须与方法定义中小括号里面的变量一一对应,
        //否则程序将报错.

        getSum(10,20);
        //实参:全称实际参数,方法调用中的参数
    }

    public static void getSum(int num1, int num2) {
        //形参: 全称形式参数,是指方法定义中的参数
        int result = num1 + num2;
        System.out.println(result);
    }
}

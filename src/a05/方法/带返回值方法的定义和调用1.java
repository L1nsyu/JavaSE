package a05.方法;

public class 带返回值方法的定义和调用1 {
    public static void main(String[] args) {
        //定义格式:
        // public static 返回值类型 方法名(参数){
        //        方法体;
        //        return 返回值;
        // }

        //例子:
        // public static int getSum(int a,int b){
        //        int c = a+ b;
        //        return c;
        // }

        //调用格式:
        //1.直接调用:
        //方法名(实参);
        //2.赋值调用:
        //整数类型 变量名 = 方法名(实参);
        //3.输出调用:
        //System.out.println(方法名(实参));

        //--------------------------------------------------------------------------------------
 /*
        //直接调用:
        getSum(10,20,30);

        //赋值调用:
        int sum = getSum(10,20,30);
        System.out.println(sum);

        //输出调用:
        System.out.println(getSum(10,20,30));
 */

        int sum1 = getSum(10, 20, 30);
        int sum2 = getSum(20, 30, 40);
        int sum3 = getSum(30, 40, 50);
        int sum4 = getSum(40, 50, 60);

        int sum = sum1 + sum2 + sum3 + sum4;
        System.out.println("商场总季度的营业额为:" + sum);
    }

    public static int getSum(int num1, int num2, int num3) {
        int result = num1 + num2 + num3;
        return result;
    }
}

package a01.运算符;

public class 逻辑运算符 {
    public static void main(String[] args) {
        //& 并且
        //两边都为真,结果才是真
        System.out.println(true & true);//true
        System.out.println(true & false);//false
        System.out.println(false & true);//false
        System.out.println(false & false);//false


        //| 或者
        //两边都为假,结果才为假
        System.out.println(true | true);//true
        System.out.println(true | false);//true
        System.out.println(false | true);//true
        System.out.println(false | false);//false

        //^ 异或
        //相同为false,不同为true
        System.out.println(true ^ true);//false
        System.out.println(true ^ false);//true
        System.out.println(false ^ true);//true
        System.out.println(false ^ false);//false

        //!逻辑非 取反
        System.out.println(!false);//true
        System.out.println(!true);//false

        //&&
        //运行结果跟单个&是一样的
        //表示两边都为真,结果才是真
        System.out.println(true && true);//true
        System.out.println(true && false);//false
        System.out.println(false && true);//false
        System.out.println(false && false);//false


        //||
        //运行结果跟单个|是一样的
        //表示两边都为假,结果才是真假
        System.out.println(true || true);//true
        System.out.println(true || false);//true
        System.out.println(false || true);//true
        System.out.println(false || false);//false


        //短路逻辑运算符据有短路效果
        //当左边的表达式能确定最终的结果,那么右边就不会参与运行了
        int a = 10;
        int b = 10;
        boolean c = ++a < 5 && ++b < 5;
        System.out.println(c);//false
        System.out.println(a);//11
        System.out.println(b);//10
    }
}

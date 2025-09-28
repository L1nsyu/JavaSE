package b21.异常.o5.异常中的常见方法;

public class ExceptionDemo8 {
    public static void main(String[] args) {
/*      (了解即可,不常用)public String getMessage()          返回此throwable 的详细消息字符串
        (了解即可,不常用)public String toString()            返回此可抛出的简短描述
        ⭐public void printStackTrace()       把异常的错误消息输出在控制台
                                            细节:仅仅是打印信息,不会停止程序运行
        */


        int[] arr ={1,2,3,4,5,6};

        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            //1.⭐
            String message = e.getMessage();
            System.out.println(message);//Index 10 out of bounds for length 6\

            //2.⭐
            String string = e.toString();
            System.out.println(string);//java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 6

/*          //3.⭐
            e.printStackTrace();
            //java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 6
            //	at b21.异常.o5.异常中的常见方法.ExceptionDemo8.main(ExceptionDemo8.java:15)
*/

        }
        System.out.println("看看我执行了吗?");




        //扩展:
        //正常的输出语句
        System.out.println(123);

        //错误的输出语句(用来打印错误的信息)
        System.err.println(123);

    }
}

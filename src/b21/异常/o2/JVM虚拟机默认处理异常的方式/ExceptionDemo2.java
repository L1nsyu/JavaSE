package b21.异常.o2.JVM虚拟机默认处理异常的方式;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        //JVM 默认处理异常的方式:
        //1.把异常的名称,异常原因及异常出现的位置等信息输出在了控制台
        //2.程序停止执行,异常下面的代码不会再执行了

        System.out.println("狂踹瘸子那条好腿1");
        System.out.println("狂踹瘸子那条好腿2");
//        System.out.println(2 / 0);
        System.out.println("狂踹瘸子那条好腿3");
        System.out.println("狂踹瘸子那条好腿4");

        //控制台输出:
        //狂踹瘸子那条好腿1
        //狂踹瘸子那条好腿2
        //Exception in thread "main" java.lang.ArithmeticException: / by zero
        //	at b21.异常.o2.JVM虚拟机默认处理异常的方式.ExceptionDemo2.main(ExceptionDemo2.java:11)


    }
}

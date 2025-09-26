package b21.异常.o1.异常在代码中的两个作用;


public class ExceptionDemo2 {
    public static void main(String[] args) {
        //异常作用2:异常可以作为方法内部的一种特殊返回值,以便通知调用者底层的执行情况

        //1.创建学生对象
        Student s1 = new Student();

        //年龄:(同学) 18~40岁
//        s1.setAge(50); //就知道了50 赋值失败
                        //选择1:自己悄悄处理
                        //选择2:打印在控制台上
    }
}

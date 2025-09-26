package b21.异常.o1.异常在代码中的两个作用;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        //异常作用1: 异常是用来查询bug的关键参考信息  ⭐

        Student[] arr = new Student[3];
        arr[0] = new Student("zhangsan", 21);
        arr[1] = new Student("lisi", 24);
        arr[2] = new Student("wangwu", 25);
        String name = arr[0].getName();
        System.out.println(name);

        //解析: "NullPointerException"
        //因为    Student.getName()" because "arr[0]" is null
        //也就是说 在Student这个数组当中, 没有给数组添加元素 , 所以默认的三个值全是 null
        //就会触发 "NullPointerException" 异常

        //解决方法:
        //给数组加上元素

        //参考作用:⭐
        //异常是用来查询bug的关键参考信息
    }
}

package a12.面向对象进阶.权限修饰符和代码块.代码块demo1;

public class Test1 {
    public static void main(String[] args) {
        //1.局部代码块
        {
            int a = 10;
        }//因为当代码执行到这里时,变量a就从内存中消失了
//        System.out.println(a);
        //报错找不到 变量a


        //2.构造代码块
        //创建对象
        Student s1 = new Student();  //开始创建对象了
                                    //空参构造

        Student s2 = new Student(); //开始创建对象了
                                    //空参构造

        //3.静态代码块
    }
}

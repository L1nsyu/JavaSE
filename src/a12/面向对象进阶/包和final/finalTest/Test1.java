package a12.面向对象进阶.包和final.finalTest;

public class Test1 {
    public static void main(String[] args) {
        //final 修饰基本数据类型 ,记录的值不能发生改变
        //final 修饰引用数据类型 ,记录的地址值不能发生改变 ,内部的属性值还是可以改变的

        //核心:
        //常量记录的数据都是不能发生改变的
        final double PI = 3.14;

        //创建对象
        final Student S = new Student("zhangsan", 15);
        S.setName("lisi");
        S.setAge(18);
        System.out.println(S.getName() + "," + S.getAge());
        //记录的地址值不能发生改变 ,内部的属性值还是可以改变的
//        S = new Student();//报错

        //数组
        final int[] ARR = {1, 2, 3, 4, 5};
        ARR[0] = 10;
        ARR[1] = 20;
        ARR[2] = 30;

        for (int i = 0; i < ARR.length; i++) {
            System.out.println(ARR[i]);
        }
    }
}

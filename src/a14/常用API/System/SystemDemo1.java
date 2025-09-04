package a14.常用API.System;

import a12.面向对象进阶.认识多态.Person;

public class SystemDemo1 {
    public static void main(String[] args) {
        //public static void exit(int status)              终止当前运行的 Java 虚拟机
        //public static long currentTimeMillis()             返回当前系统的时间毫秒值形式
        //public static void arraycopy(数据源数组,起始索引，目的地数组，起始索引，拷贝个数)      数组拷贝
        //细节:
        //1.如果数据源数组和目的地数组都是基本数据类型,那么两者的类型必须保持一致,否则会报错
        //eg: int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //      double[] arr2 = new double[10];

        //2.在拷贝的时候,需要考虑数组的长度,如果超出范围也会报错
        //eg: int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //      int[] arr2 = new int[5];
        //System.arraycopy(arr1, 0, arr2, 0, 10);

        //3.如果数据源数组和目的地数组都是引用数据类型,那么子类类型可以赋值给父类类型
        //Student[] arr1 = {s1,s2,s3};
        //Person[] arr2 = new Person[3];
        //System.arraycopy(arr1, 0, arr2, 0, 3);

/*      //方法的形参:
        //状态码:
        //0: 当前虚拟机是正常停止
        //非0 :表示当前虚拟机是异常停止
        System.exit(0);
        System.out.println("看看我停止了码");
        //以拼图小游戏为例:
        //当我们需要把整个程序结束的时候,就可以调用这个方法
*/

        //表示从计算机出生的日期到 这个代码运行结束 这之间的时间间隔(单位:毫秒)
        long l = System.currentTimeMillis();
        System.out.println(l);//1755977796821 ---->  1755977809265

        //拷贝数组
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = new int[10];
        //把arr1数组中的数据拷贝到arr2当中
        //参数1: 数据源 : 要拷贝的数据从哪个数组而来
        //参数2: 从数据源数组中的第几个索引开始拷贝
        //参数3: 目的地,我要把数据拷贝到哪个数组中
        //参数4: 目的地数组的索引
        //参数5: 拷贝的个数
        System.arraycopy(arr1, 0, arr2, 0, 10);

        //验证
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i] + " ");
        }

        //课堂练习:
        //arr2 :  0 0 0 0 1 2 3 0 0 0
        //System.arraycopy(arr1, 0, arr2, 4, 3);
    }
}

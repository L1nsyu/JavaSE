package a12.面向对象进阶.静态方法和工具类;

import java.util.ArrayList;

public class ArrayUtil {
    //私有化构造方法
    //目的:为了不让外界创建他的对象
    private ArrayUtil() {
    }

    //需要定义为静态的,方便调用
    //工具类方法遍历数组
    public static String printArr(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }


    //工具类方法返回平均分
    public static double getAverage(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

    //工具类方法获取集合中最大学生的年龄
    public static int getMaxAgeOfStudent(ArrayList<Student> list){
        //1.定义一个参照物
        int maxAge = list.get(0).getAge();

        for (int i = 1; i < list.size(); i++) {
            Student stu = list.get(i);
            if (stu.getAge() > maxAge) {
                maxAge = stu.getAge();
            }
        }
        return maxAge;
    }
}

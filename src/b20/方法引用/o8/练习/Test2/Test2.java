package b20.方法引用.o8.练习.Test2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

public class Test2 {
    public static void main(String[] args) {
/*      需求:
            创建集合添加学生对象
            学生对象属性:name, age

        要求:
            获取姓名并放到数组当中
            使用方法引用完成

        方法引用的小技巧:
            1.现在有没有一个方法符合我当前的需求
            2.如果有这样的方法,这个方法是否满足引用的规则

        三种情况:
            1.静态: 类名::方法名
            2.构造方法: 类名::new
            3.成员方法:
                3.1 如果方法是在Student类这种类型的 --> 类名::方法名
                3.2 如果方法是在其他类 --> 对象名::方法名
                3.3 如果方法是在本类 --> this::方法名
                3.4 如果方法是在父类 --> super::方法名


                 */

        //1.创建集合并添加元素
        ArrayList<Student> list = new ArrayList<>();
        //2.添加元素
        list.add(new Student("zhangsan", 23));
        list.add(new Student("lisi", 24));
        list.add(new Student("wangwu", 25));

        //3.获取姓名并放到数组当中

        //两种引用方法:
        //1.对象:: 方法名    形参 返回值  和被引用方法完全一样
        //2.类名:: 方法名    被引用的方法形参是跟抽象方法第二个参数后面的保持一致
        String[] arr2 = list.stream()
                .map(Student::getName)
                .toArray(String[]::new);
        System.out.println(Arrays.toString(arr2));


/*        String[] arr1 = list.stream()
                .map(new Function<Student, String>() {
                    @Override
                    public String apply(Student student) {
                        return student.getName();
                    }
                }).toArray(String[]::new);
        System.out.println(Arrays.toString(arr1));*/


    }
}

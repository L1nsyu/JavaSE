package a15.常见算法.基本查找;

import java.util.ArrayList;
import java.util.List;

public class BasicSearDemo1 {
    public static void main(String[] args) {
        //基本查找
        //核心:
        //从0索引开始挨个往后查找

        //需求:定义一个方法利用基本查找,查询某个元素是否存在
        //数据如下:{131, 127, 147, 81, 103, 23, 7, 79}

        int[] arr = {131, 127, 147, 81, 103, 23, 7, 79,81};
        int number = 81;
        System.out.println(basicSearch(arr, number));
    }

    //参数:
    //1.数组
    //2.要查找的参数

    //返回值:
    //元素是否存在
/*    public static boolean basicSearch(int[] arr, int number) {
        //利用基本查找来查找number在数组中是否存在
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }*/

    public static List<Integer> basicSearch(int[] arr, int number) {
        //定义一个方法利用基本查找,查询某个元素在数组中的索引
        //需要考虑数组元素有重复的可能性
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                list.add(i);
            }
        }
        return list;
    }
}

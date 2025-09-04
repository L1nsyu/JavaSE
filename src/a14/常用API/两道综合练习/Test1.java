package a14.常用API.两道综合练习;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //要求: 键盘录入一些1~100的整数,并添加到集合中
        //直到集合中所有数据和超过200为止.

        //1.创建一个集合用来添加整数
        ArrayList<Integer> list = new ArrayList<>();

        //2.键盘录入数据添加到集合中
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入一个整数");
            String numStr = sc.nextLine();
            int num = Integer.parseInt(numStr);
            //先把异常数据先进行过滤
            if (num < 1 || num > 100) {
                System.out.println("当前数据不在1~100当中,请重新输入");
                continue;
            }

            //添加到集合中
            //细节:
            //num:基本数据类型
            //集合里面的数据是Integer
            //在添加数据的时候触发了自动装箱
            list.add(num);
            //相当于
            //list.add(Integer.valueOf(num));

            //统计集合中所有的数据和
            int sum = getSum(list);
            //对sum进行判断
            if (sum > 200) {
                System.out.println("集合中的数据和已经达到要求");
                break;
            }
        }

    }

    private static int getSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }
}

package b17.集合进阶.综合练习.不重复的随机点名;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        //班级里面有五个学生
        //要求:
        //被点到的学生不会再被点到
        //但是如果班级中所有的学生都被点到了,需要重新开启第二轮点名

        //1.定义集合
        ArrayList<String> list1 = new ArrayList<>();

        //2.添加数据
        Collections.addAll(list1, "林大狗", "李思雨", "疯子", "王土土", "荷兰猪", "爸爸博弈", "磷酸盐", "bell", "qwer", "高小凤");
        //创建一个临时的集合,用来存已经被点到学生的名字
        ArrayList<String> list2 = new ArrayList<>();

        //外循环:表示轮数
        for (int i = 0; i <= 10; i++) {
            System.out.println("==============第" + i + "轮循环开始了=================");
            //3.获取集合的长度
            int size = list1.size();

            //4.随机点名
            Random r = new Random();
        /*
        第一次随机的时候,i = 0 长度 10
        第二次随机的时候,i = 1 长度 9
        第二次随机的时候,i = 2 长度 8
        第二次随机的时候,i = 3 长度 7
        第二次随机的时候,i = 4 长度 6
        第二次随机的时候,i = 5 长度 5     5 < 5 false 循环就会结束
        */
            //内循环:每一轮中随机循环抽取的过程
            for (int j = 0; j < size; j++) {
                int index = r.nextInt(list1.size());
                String removeName = list1.remove(index);
                list2.add(removeName);
                System.out.println(removeName);
            }
            //此时表示第一轮结束
            //list1 空了 list2 10个学生的名字
            list1.addAll(list2);
            list2.clear();
        }
    }
}

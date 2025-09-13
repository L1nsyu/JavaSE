package b17.集合进阶.综合练习.随机点名器的两种实现方式;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        //班级里面有N个学生,学生属性:姓名,年龄,性别.
        //实现随机点名器


        //第一种随机方式:
        //1.定义集合
        ArrayList<String> list = new ArrayList<>();
        //2.添加数据
        Collections.addAll(list, "林大狗", "李思雨", "疯子", "王土土", "爸爸博弈", "我是大妈宝");
        //3.随机点名
        Random r = new Random();
        int index = r.nextInt(list.size());
        String name1 = list.get(index);
        System.out.println(name1);

        //第二种随机方法:
        //打乱思想:
        //我只要把原来的集合打乱,然后再去索引0的数据不就行了
        Collections.shuffle(list);
        String name2 = list.get(0);
        System.out.println(name2);

    }
}

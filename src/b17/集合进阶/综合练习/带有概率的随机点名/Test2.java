package b17.集合进阶.综合练习.带有概率的随机点名;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        //1.创建集合
        ArrayList<Integer> list = new ArrayList<>();

        //2.添加数据
        Collections.addAll(list, 1, 1, 1, 1, 1, 1, 1);
        Collections.addAll(list, 0, 0, 0);

        //3.打乱集合中的数据
        Collections.shuffle(list);

        //4.从list集合中随机抽取0或者1
        Random r = new Random();
        int index = r.nextInt(list.size());
        Integer number = list.get(index);
        System.out.println(number);

        //5.创建两个集合分别存储男生和女生的名字
        ArrayList<String> boyList = new ArrayList<>();
        ArrayList<String> girlList = new ArrayList<>();
        Collections.addAll(boyList, "林大狗", "李思雨", "疯子", "王土土");
        Collections.addAll(girlList, "爸爸博弈", "我是大妈宝");

        //6.判断此时是从boyList还是从girlList里面抽取
        if (number == 1) {
            int boyIndex = r.nextInt(boyList.size());
            System.out.println(boyList.get(boyIndex));
        } else if (number == 0) {
            int girlIndex = r.nextInt(girlList.size());
            System.out.println(girlList.get(girlIndex));
        }
    }
}

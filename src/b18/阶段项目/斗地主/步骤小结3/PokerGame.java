package b18.阶段项目.斗地主.步骤小结3;

import java.util.*;

public class PokerGame {
    //牌盒
    static ArrayList<String> poker = new ArrayList<>();

    //创建一个集合,用来添加牌的价值
    static HashMap<String, Integer> hm = new HashMap<>();

    static {
        //准备牌
        // "♦" , "♣" , "❤" , "♠"
        //"3" , "4" , "5" , "6" , "7" , "8" , "9" , "10" , "J" , "Q" , "K" , "A" , "2"

        String[] colorArr = {"♦", "♣", "❤", "♠"};
        String[] numberArr = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        for (String c : colorArr) {
            //c 依次表示每一种花色
            for (String n : numberArr) {
                //n 依次表示每一个数字
                poker.add(c + n);
            }
        }
        poker.add(" 小王");
        poker.add(" 大王");

        //指定牌的价值
        //牌上的数字到Map集合中判断是否存在
        //存在,获取价值
        //不存在,本身的数字就是价值
        hm.put("J", 11);
        hm.put("Q", 12);
        hm.put("K", 13);
        hm.put("A", 14);
        hm.put("2", 15);
        hm.put("小王", 50);
        hm.put("大王", 100);
    }


    public PokerGame() {
        //洗牌:
        Collections.shuffle(poker);

        //发牌:
        ArrayList<String> lord = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();

        //遍历牌盒得到每一张牌
        for (int i = 0; i < poker.size(); i++) {
            //i:索引
            String pokerCard = poker.get(i);
            if (i <= 2) {
                lord.add(pokerCard);
                continue;
            }

            if (i % 3 == 0) {
                player1.add(pokerCard);
            } else if (i % 3 == 1) {
                player2.add(pokerCard);
            } else {
                player3.add(pokerCard);
            }
        }

        //排序
        order(lord);
        order(player1);
        order(player2);
        order(player3);

        //看牌
        lookPoker("底牌", lord);
        lookPoker("磷酸盐", player1);
        lookPoker("林易车", player2);
        lookPoker("睁开套", player3);

    }

    //利用牌的价值进行排序
    //参数:集合
    public void order(ArrayList<String> list) {
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //o1:表示当前要插入到有序序列的牌
                //o2:表示已经在有序序列中存在的牌

                //负数:o1小 插入到前面
                //正数:o2大 插入到后面
                //0:o1的数字跟o2的数字是一样的,需要按照花色再次排序

                //1.计算o1的花色和价值
                String color1 = o1.substring(0, 1);
                int value1 = getValue(o1);

                //2.计算o2的花色和价值
                String color2 = o2.substring(0, 1);
                int value2 = getValue(o2);

                //3.比较o1和o2的价值
                int i = value1 - value2;

                return i == 0 ? color1.compareTo(color2) : i;
            }
        });
    }


    //计算牌的价值
    //参数:牌
    //返回值:价值
    public int getValue(String poker) {
        //获取牌上的数字
        String number = poker.substring(1);
        //拿着数字到map集合中判断是否存在
        if (hm.containsKey(number)) {
            //存在,获取价值
            return hm.get(number);
        } else {
            //不存在,类型转换
            return Integer.parseInt(number);
        }
    }

    //看牌的方法
    public void lookPoker(String name, ArrayList<String> list) {
        System.out.println(name + ":");
        for (String poker : list) {
            System.out.print(poker + " ");
        }
        System.out.println();

    }

}

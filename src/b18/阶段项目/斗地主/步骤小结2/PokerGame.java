package b18.阶段项目.斗地主.步骤小结2;

import java.util.*;

public class PokerGame {
    //创建集合 那现在我是需要使用HashMap 还是 TreeMap呢?
    //因为现在需要考虑的是 序号和 键值对的 "对应关系" 不需要使用到TreeMap的排序作用
    //所以使用的是HashMap

    //牌盒 Map
    //此时我们只要把牌跟序号产生对应关系就可以了,不需要按照序号进行排序,所以只要HashMap就可以了
    static HashMap<Integer, String> hm = new HashMap<>();

    //创建单列集合 --> 存储序号
    static ArrayList<Integer> list = new ArrayList<>();

    //静态代码块
    //特点:随着类的加载而记载的,而且只执行一次
    static {
        //准备牌
        // "♦" , "♣" , "❤" , "♠"
        //"3" , "4" , "5" , "6" , "7" , "8" , "9" , "10" , "J" , "Q" , "K" , "A" , "2"

        String[] colorArr = {"♦", "♣", "❤", "♠"};
        String[] numberArr = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        /*{1=♦3, 2=♣3, 3=❤3, 4=♠3,
        5=♦4, 6=♣4, 7=❤4, 8=♠4,
        9=♦5, 10=♣5, 11=❤5, 12=♠5,
        13=♦6, 14=♣6, 15=❤6, 16=♠6,
        17=♦7, 18=♣7, 19=❤7, 20=♠7,
        21=♦8, 22=♣8, 23=❤8, 24=♠8,
        25=♦9, 26=♣9, 27=❤9, 28=♠9,
        29=♦10, 30=♣10, 31=❤10, 32=♠10,
        33=♦J, 34=♣J, 35=❤J, 36=♠J,
        37=♦Q, 38=♣Q, 39=❤Q, 40=♠Q,
        41=♦K, 42=♣K, 43=❤K, 44=♠K,
        45=♦A, 46=♣A, 47=❤A, 48=♠A,
        49=♦2, 50=♣2, 51=❤2, 52=♠2,
        53=小王, 54=大王}*/



        //序号
        int serialNumber = 1;
        //细节 : 先遍历数字 再遍历花色 就可以得到想要的排序
        for (String n : numberArr) {
            //依次表示每一个数字
            for (String c : colorArr) {
                //依次表示每一个花色
                hm.put(serialNumber, c + n);
                list.add(serialNumber);
                serialNumber++;
            }
        }
        hm.put(serialNumber, "小王");
        list.add(serialNumber);
        serialNumber++;
        hm.put(serialNumber, "大王");
        list.add(serialNumber);

    }

    public PokerGame() {
        //洗牌
        Collections.shuffle(list);

        //发牌
        TreeSet<Integer> lord = new TreeSet<>();
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();

        for (int i = 0; i < list.size(); i++) {
            if (i <= 2) {
                lord.add(list.get(i));
                continue;
            }

            if (i % 3 == 0) {
                player1.add(list.get(i));
            } else if (i % 3 == 1) {
                player2.add(list.get(i));
            } else {
                player3.add(list.get(i));
            }
        }
        System.out.println("lord:" + lord);
        System.out.println("player1:" + player1);
        System.out.println("player2:" + player2);
        System.out.println("player3:" + player3);

        //看牌
        lookPoker("底牌", lord);
        lookPoker("磷酸盐", player1);
        lookPoker("林易车", player2);
        lookPoker("睁开套", player3);
    }

    //看牌的方法
    public void lookPoker(String name, TreeSet<Integer> ts) {
        //遍历TreeSet集合得到每一个序号,再拿着序号到Map集合中去找真正的牌
        System.out.println(name + ":");
        for (Integer pokerNumber : ts) {
            String pokerCard = hm.get(pokerNumber);
            System.out.print(pokerCard + " ");
        }
        System.out.println();

    }
}

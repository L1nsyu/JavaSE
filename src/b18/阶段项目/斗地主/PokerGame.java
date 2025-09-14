package b18.阶段项目.斗地主;

import java.util.ArrayList;
import java.util.Collections;

public class PokerGame {
    //但是准备牌是不能在构造方法里面的,假设我如果要执行两次PokerGame{},那么我不需要再次加载一副牌
    //我只需要继续使用这副拍就可以了

    //相当于牌盒
    static ArrayList<String> poker = new ArrayList<>();

    //静态代码块
    //特点:随着类的加载而记载的,而且只执行一次
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
        poker.add("小王");
        poker.add("大王");
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

        //看牌:
        lookPoker("底牌", lord);
        lookPoker("磷酸盐", player1);
        lookPoker("林易车", player2);
        lookPoker("睁开套", player3);
    }
    //ArrayList<String> player1 = new ArrayList<>();

    //遍历集合的代码
    //参数1:玩家的名字
    //参数2:每位玩家的牌
    public void lookPoker(String name, ArrayList<String> pokerCard) {
        System.out.print(name + ":");

        for (String card : pokerCard) {
            System.out.print(card + " ");
        }
        System.out.println();
    }
}

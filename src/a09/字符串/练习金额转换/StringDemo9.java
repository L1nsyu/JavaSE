package a09.字符串.练习金额转换;

import java.util.Scanner;

public class StringDemo9 {
    public static void main(String[] args) {
        //1.键盘录入一个金额
        Scanner sc = new Scanner(System.in);
        int money;
        while (true) {
            System.out.println("请输入一个金额");
            money = sc.nextInt();
            if (money > 0 && money < 10000000) {
                break;
            } else {
                System.out.println("金额无效");
            }
        }

        //2.得到money里面的每一位数字
        String moneyStr = "";

        while (true) {
            //从右往左获取数据,因为右侧是数据的个位
            int ge = money % 10;
            String capitalNumber = getCapitalNumber(ge);
            moneyStr = capitalNumber + moneyStr;
            //去掉刚刚获取的数据
            money = money / 10;
            //如果数字上的每一位全部获取到了,那么money记录的就是0,此时循环结束
            if (money == 0) {
                break;
            }
        }
        System.out.println(moneyStr);

        //3.在前面补0,补齐7位
        int count = 7 - moneyStr.length();
        for (int i = 0; i < count; i++) {
            moneyStr = "零" + moneyStr;
        }
        System.out.println(moneyStr);


        //4.插入单位
        //定义一个数组表示单位
        String[] arr = {"佰", "拾", "万", "仟", "佰", "拾", "元"};
        String result = "";
        for (int i = 0; i < moneyStr.length(); i++) {
            char c = moneyStr.charAt(i);
            result = result + c + arr[i];
        }

        System.out.println(result);
    }

    public static String getCapitalNumber(int number) {
        //定义数组,让数字跟大写的中文产生一个对应关系
        String[] arr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        return arr[number];
    }
}

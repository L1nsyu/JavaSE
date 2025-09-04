package a09.字符串.练习罗马数字的两种写法;

import java.util.Scanner;

public class StringDemo20 {
    public static void main(String[] args) {
        //键盘录入一个字符串
        //要求1:长度为小于等于9
        //要求2:只能是数字
        //将内容变成罗马数字
        //下面是阿拉伯数字跟罗马数字的对比关系:
        //1-1、1-2、1-3、IV-4、V-5、V-6、V-7、-8、Ix-9
        //注意点:
        //罗马数字里面是没有0的
        //如果键盘录入的数字包含0，可以变成””(长度为0的字符串)

        //1.键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        String str;
        while (true) {
            System.out.println("请输入一个字符串");
            str = sc.next();

            //2.校验字符串是否满足规则
            boolean flag = cheakStr(str);
            if (flag) {
                break;
            } else {
                System.out.println("当前的字符串不符合规则,请重新输入");
                continue;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int number = c - 48;
            String s = changeLoman(number);
            sb.append(s);
        }
        System.out.println(sb);

    }

    public static boolean cheakStr(String str) {
        //要求1:长度为小于等于9
        if (str.length() >= 9) {
            return false;
        }

        //要求2:只能是数字
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }

    public static String changeLoman(int number) {
        String[] arr = {"", "I ", "II ", "III ", "IV ", "V ", "VI ", "VII ", "VIII ", "IX "};
        return arr[number];
    }
}

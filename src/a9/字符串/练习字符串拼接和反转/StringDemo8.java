package a9.字符串.练习字符串拼接和反转;

public class StringDemo8 {
    public static void main(String[] args) {
        //定义一个方法，实现字符串反转。
        //键盘录入一个字符串，调用该方法后，在控制台输出结果
        //例如，键盘录入 abc，输出结果cba
        String str1 = "abcde";
        String str2 = reverse(str1);
        System.out.println(str2);
    }
    //1.我要干嘛   ---字符串的反转
    //2.我干这件事情需要什么才能完成?     ---需要一个字符串
    //3.我干完了是否要把结果返回给调用处       ---需要结果进行输出
    //如果调用处需要继续使用,那么必须返回
    //如果调用处不需要继续使用,那么可以返回也可以不返回

    public static String reverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            result += c;
        }
        return result;
    }
}

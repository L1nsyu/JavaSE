package a09.字符串.练习调整字符串的内容并比较;

public class StringDemo21 {
    public static void main(String[] args) {
        //给定两个字符串,A 和 B。
        //A 的旋转操作就是将 A最左边的字符移动到最右边，
        // 例如,若 A='abcde'，在移动一次之后结果就是'bcdea'。
        // 如果在若干次调整操作之后，A能变成B，那么返回True，
        // 如果不能匹配成功，则返回false

        //1.定义两个字符串
        String str1 = "abcde";
        String str2 = "cdeab";

        //2.调用方法进行比较
        boolean result = checkEqual(str1, str2);
        System.out.println(result);


    }

    public static String rotate(String str) {
        //套路:如果我们看到要修改字符串的内容
        //可以有两个方法:
        //1.用subString进行截取,把左边的字符截取出来拼接到右侧去
        //2.可以把字符串先变成一个字符数组,然后调整字符数组里面数据,最后再把字符数组变成字符串

        //1.用subString进行截取,把左边的字符截取出来拼接到右侧去
        char first = str.charAt(0);
        String end = str.substring(1);
        return end + first;
    }

    public static boolean checkEqual(String str1, String str2) {
        for (int i = 0; i < str1.length(); i++) {
            str1 = rotate(str1);
            if (str1.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public static String rotate1(String str) {
        //2.可以把字符串先变成一个字符数组,然后调整字符数组里面数据,最后再把字符数组变成字符串
        char[] arr = str.toCharArray();
        //"ABC" --> ['A','B','C']  --->  ['B','C','A']  ---> new String(字符数组)
        char first = arr[0];
        for (int i = 1; i < arr.length - 1; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = first;
        String result = new String(arr);
        return result;
    }
}

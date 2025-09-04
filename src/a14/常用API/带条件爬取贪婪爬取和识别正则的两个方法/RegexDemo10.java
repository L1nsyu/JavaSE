package a14.常用API.带条件爬取贪婪爬取和识别正则的两个方法;

public class RegexDemo10 {
    public static void main(String[] args) {
        //public String replaceAll(String regex,String newStr)      按照正则表达式的规则切割字符串
        //public String[] split(String regex)                       按照正则表达式的规则进行替换

        //有一段字符串:小诗诗dqwefqwfqwfwg12312小丹丹dqwefqwfqwfwg12312小惠惠
        // 要求1:把字符串中三个姓名之间的字母替换为vs
        // 要求2:把字符串中的三个姓名切割出来

        String s = "小诗诗dqwefqwfqwfwg12312小丹丹dqwefqwfqwfwg12312小惠惠";
        //细节:
        //方法在底层跟之前一样,也会创建文本解析器的对象
        //然后从头开始去读取字符串中的内容,只要有满足的,那么就用第二个参数去替换

        String result1 = s.replaceAll("[\\w&&[^_]]+", "vs");
        System.out.println(result1);

        //split也就是按正则表达式的规则,划分为三块,然后把划分后的数据放入数组
        String[] arr = s.split("[\\w&&[^_]]+");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }
}

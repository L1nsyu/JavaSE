package a9.字符串.字符串的比较;

public class StringDemo2 {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = "abc";

        //==号比较
        //基本数据类型:比的是数据值
        //引用数据类型:比的是地址值
        System.out.println(s1 == s2);//false

        //比较字符串对象中的内容是否相同
        boolean result1 = s1.equals(s2);
        System.out.println(result1);//true

        //比较字符串对象中的内容是否相同,忽略大小写
        //1  一   壹  这类不行  忽略大小写只能是英文状态下的a A
        boolean result2 = s1.equalsIgnoreCase(s2);
        System.out.println(result2);//true
    }
}

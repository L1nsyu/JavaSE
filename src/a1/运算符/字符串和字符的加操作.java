package a1.运算符;

public class 字符串和字符的加操作 {
    public static void main(String[] args) {
        char c= 'a';
        System.out.println( c + 0 );//97

        //当字符＋字符 或者 字符＋数字 时,会把字符通过ASCII码表查询到对应的数字再计算

        System.out.println(1 + 'a');//98
        System.out.println('a' + 'b');//195
    }
}

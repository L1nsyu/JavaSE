package a14.常用API.正则表达式;

public class RegexDemo2 {
    public static void main(String[] args) {
        //[abc]             只能是a,b,或c
        //[^abc]            除了a,b，c之外的任何字符
        //[a-zA-Z]          a到z A到Z，包括(范围)
        //[a-d[m-p]]        a到d，或m到p
        //[a-z&&[def]]      a-z和def的交集。为:d,e,f
        //[a-z&&[^bc]]      a-z和非bc的交集。(等同于[ad-z])
        //[a-z&&[^m-p]]     a到z和除了m到p的交集。(等同于[a-lq-z])

        //public boolean matches(String regex):判断是否与正则表达式匹配,匹配返回true

        //[abc]             只能是a,b,或c
        System.out.println("-----------------1------------------");
        System.out.println("a".matches("[abc]"));//true
        System.out.println("z".matches("[abc]"));//false
        System.out.println("ab".matches("[abc]"));//false
        System.out.println("ab".matches("[abc][abc]"));//true

        //[^abc]            除了a,b，c之外的任何字符
        System.out.println("-----------------2------------------");
        System.out.println("a".matches("[^abc]"));//false
        System.out.println("z".matches("[^abc]"));//true
        System.out.println("zz".matches("[^abc]"));//false
        System.out.println("zz".matches("[^abc][^abc]"));//true

        //[a-zA-Z]          a到z A到Z，包括(头尾的范围)
        System.out.println("-----------------3------------------");
        System.out.println("a".matches("[a-zA-Z]"));//true
        System.out.println("z".matches("[a-zA-Z]"));//true
        System.out.println("aa".matches("[a-zA-Z]"));//false
        System.out.println("zz".matches("[a-zA-Z][a-zA-Z]"));//true
        System.out.println("0".matches(" [a-zA-Z]"));//false


        //[a-d[m-p]]        a到d，或m到p
        System.out.println("-----------------4------------------");
        System.out.println("a".matches("[a-d[m-p]]"));//true
        System.out.println("d".matches("[a-d[m-p]]"));//true
        System.out.println("m".matches("[a-d[m-p]]"));//true
        System.out.println("p".matches("[a-d[m-p]]"));//true
        System.out.println("e".matches("[a-d[m-p]]"));//false
        System.out.println("0".matches("[a-d[m-p]]"));//false

        //[a-z&&[def]]      a-z和def的交集。为:d,e,f
        //细节:如果要求两个范围的交集,那么需要写符号&&
        //如果写成了一个& ,那么此时&表示的就不是交集了,而是一个简简单单的&符号
        System.out.println("-----------------5------------------");
        System.out.println("a".matches("[a-z&[def]]"));//true
        System.out.println("&".matches("[a-z&[def]]"));//true

        System.out.println("&".matches("[a-z&&[def]]"));//false
        System.out.println("d".matches("[a-z&&[def]]"));//true
        System.out.println("0".matches("[a-z&&[def]]"));//false


        //[a-z&&[^bc]]      a-z和非bc的交集。(等同于[ad-z])
        System.out.println("-----------------6------------------");
        System.out.println("a".matches("[a-z&&[^bc]]"));//true
        System.out.println("b".matches("[a-z&&[^bc]]"));//false
        System.out.println("0".matches("[a-z&&[^bc]]"));//false


        //[a-z&&[^m-p]]     a到z和除了m到p的交集。(等同于[a-lq-z])
        System.out.println("-----------------7------------------");
        System.out.println("a".matches("[a-z&&[^m-p]]"));//true
        System.out.println("m".matches("[a-z&&[^m-p]]"));//false
        System.out.println("0".matches("[a-z&&[^m-p]]"));//false
    }
}

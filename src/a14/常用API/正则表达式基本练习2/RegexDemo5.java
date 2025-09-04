package a14.常用API.正则表达式基本练习2;

public class RegexDemo5 {
    public static void main(String[] args) {
        //正则表达式练习:
        //需求
        //请编写正则表达式验证用户名是否满足要求。
        // 要求:大小写字母，数字，下划线一共4-16位
        // 请编写正则表达式验证身份证号码是否满足要求。
        //简单要求:18位，前17位任意数字，最后一位可以是数字可以是大写或小写的x
        // 复杂要求:按照身份证号码的格式严格要求。
        //身份证号码:
        //41080119930228457x
        //510801197609022309
        //15040119810705387X
        //130133197204039024
        //430102197606046442

        //用户名要求:大小写字母,数字,下划线一共 4-16位
        String regex1 = "\\w{4,16}";
        System.out.println("zhangsan".matches(regex1));
        System.out.println("lisi".matches(regex1));
        System.out.println("wangwu".matches(regex1));
        System.out.println("$123".matches(regex1));//false

        //身份证号的简单验证
        //18位，前17位任意数字，最后一位可以是数字可以是大写或小写的x
        String regex2 = "[1-9]\\d{16}(\\d|X|x)";
        String regex3 = "[1-9]\\d{16}[\\dXx]";

        System.out.println("41080119930228457x".matches(regex2));
        System.out.println("510801197609022309".matches(regex2));
        System.out.println("15040119810705387X".matches(regex2));
        System.out.println("130133197204039024".matches(regex2));
        System.out.println("430102197606046442".matches(regex2));

        //忽略大小写的书写方法
        //在匹配的时候忽略abc的大小写
        String regex4 = "(?i)abc";
        String regex5 = "a(?i)bc";
        //只忽略b的大小写
        String regex6 = "a((?i)b)c";
        System.out.println("-------------------------------");
        System.out.println("abc".matches(regex6));
        System.out.println("ABC".matches(regex6));
        System.out.println("aBc".matches(regex6));

        //身份证号的严格校验\
        //编写正则的小心得:
        //第一步: 按照正确的数据进行拆分
        //第二步: 找每一部分的规律,并编写正则表达式
        //第三步: 把每一部分的正则拼接在一起,就是最终的结果
        //书写的时候:从左往右去书写.

        //41080119930228457x
        //前面6位 :省份,市区,派出所 等信息, 第一位不是0; 后面5位是任意数字       [1-9]\\d{5}
        //年的前半段 : 18 19 20                  (18|19|20)
        //年的后半段: 任意数字出现两次             \\d{2}
        //月份 : 01~09    10 11 12                (0[1-9]|1[0-2])
        //日期:  01~31                            (0[1-9]|[12]\\d|3[01])
        //后面四位: 任意数字出现3次,最后一位可以是数字也可以是大写X和小写x       \\d{3}[\\dXx]
        System.out.println("-------------------------------");
        String regex7 ="[1-9]\\d{5}(18|19|20)\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12]\\d|3[01])\\d{3}[\\dXx]";
        System.out.println("41080119930228457x".matches(regex7));
        System.out.println("510801197609022309".matches(regex7));
        System.out.println("15040119810705387X".matches(regex7));
        System.out.println("130133197204039024".matches(regex7));
        System.out.println("030102197606046442".matches(regex7));


    }
}

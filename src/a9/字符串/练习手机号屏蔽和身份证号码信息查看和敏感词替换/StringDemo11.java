package a9.字符串.练习手机号屏蔽和身份证号码信息查看和敏感词替换;

public class StringDemo11 {
    public static void main(String[] args) {
        String id = "440513200207281119";

        String year = id.substring(6, 10);
        String mouth = id.substring(10, 12);
        String day = id.substring(12, 14);

        System.out.println("人物信息为:");
        System.out.println("出生年月日:" + year + "年" + mouth + "月" + day + "日");

        char gender = id.charAt(16);
        //利用ASCII码表进行转换
        //'0' ---> 48
        //.......
        //'9' ---> 57
        int num = gender - 48;
        if (num % 2 == 0) {
            System.out.println("性别为:女");
        } else {
            System.out.println("性别为:男");
        }
    }
}

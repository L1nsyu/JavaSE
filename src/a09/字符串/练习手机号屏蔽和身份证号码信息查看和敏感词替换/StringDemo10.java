package a09.字符串.练习手机号屏蔽和身份证号码信息查看和敏感词替换;

public class StringDemo10 {
    public static void main(String[] args) {
        //1.获取一个手机号
        String phoneNumber = "15107541366";

        //2.截取手机号码前面三位
        String start = phoneNumber.substring(0, 3);
        System.out.println(start);

        //3.截取手机号码后面四位
        String end = phoneNumber.substring(7);
        System.out.println(end);

        //4.拼接
        String result = start +"****" +end;
        System.out.println(result);
    }
}

package a14.常用API.正则表达式基本练习1;

public class RegexDemo4 {
    public static void main(String[] args) {
        //需求
        //请编写正则表达式验证用户输入的手机号码是否满足要求。
        //请编写正则表达式验证用户输入的邮箱号是否满足要求。
        //请编写正则表达式验证用户输入的电话号码是否满足要求.

        //验证手机号码       13112345678 13712345667 13945679027 139456790271
        //验证座机电话号码    020-2324242   02122442    027-42424   0712-3242434
        // 验证邮箱号码       3232323@gq.com      zhangsan@itcast.cnn
        //                  dlei0009@163.com        dleieag9@pci.com.cn

        //心得:
        //拿着一个正确的数据从左到右依次去写
        //13112345678

        //验证手机号码       13112345678 13712345667 13945679027 139456790271
        //分成三个部分:
        //第一部分: 1.表示手机号码只能以1开头
        //第二部分: [3-9]表示手机号码第二位只能是 三到九 之间的
        //第三部分: \\d{9} 表示任意数字可以出现9次 ,也只能出现9次
        String regex1 = "1[3-9]\\d{9}";
        System.out.println("13112345678".matches(regex1));//true
        System.out.println("13712345667".matches(regex1));//true
        System.out.println("13945679027".matches(regex1));//true
        System.out.println("139456790271".matches(regex1));//false

        System.out.println("------------------------------------------");

        //座机电话号码
        //验证座机电话号码    020-2324242   02122442    027-42424   0712-3242434
        //思路:
        //在书写座机号正则的时候需要把正确的数据分成三个部分
        //1.区号  0\\d{2,3}
        //        0:表示区号一定是以0开头的
        //        \\d{2,3} :表示区号从第二位开始可以是任意的数字,可以出现2到3次
        //2. -      次数0次或1次    --> ?:表示次数,0次或者1次
        //3.号码      号码的第一位也不能以0开头 ,从第二位开始可以是任意的数字,号码的总长度:5-10位.
        String regex2 = "0\\d{2,3}-?[1-9]\\d{4,9}";
        //[1-9]\\d{4,9} 号码的总长度:5-10位,那为什么是\\d{4,9}? 因为{4-9}表示的是还能出现4到9位,
        //而前面的[1-9]已经是一位了
        System.out.println("020-2324242".matches(regex2));//true
        System.out.println("02122442".matches(regex2));//true
        System.out.println("027-42424".matches(regex2));//true
        System.out.println("0712-3242434".matches(regex2));//true


        //邮箱号码
        //  3232323@gq.com      zhangsan@itcast.cnn
        // dlei0009@163.com        dleieag9@pci.com.cn
        //思路:
        //在书写邮箱号码正则的时候需要把正确的数据分成三部分
        //第一部分:@的左边     \\w+
        //          任意的字母数字下划线,至少出现一次就可以了
        //第二部分:@ 只能出现一次
        //第三部分:
        //3.1      .的左边 [\\w&&[^_]]{2,6}
        //         任意的字母加数字,总共出现2~6次 (此时不能出现下划线)
        //3.2       .  --> \\.
        //3.3       大写字母,小写字母都可以,只能出现2~3次 [a-zA-Z]{2,3}
        //          我们可以把3.2和3.3看成一组,这一组可以出现1次或者2次
        String regex3 = "\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2}";

        System.out.println("3232323@gq.com".matches(regex3));
        System.out.println("zhangsan@itcast.cnn".matches(regex3));
        System.out.println("dlei0009@163.com".matches(regex3));
        System.out.println("dleieag9@pci.com.cn".matches(regex3));


        //在实际开发中,很少会自己写正则表达式
        //百度一个类似的,自己改成公司要求的.

        //24小时的正则表达式
        String regex4 = "([01]\\d|2[0-3])(:[0-5]\\d){2}";
        System.out.println("23:11:11".matches(regex4));//true
        //23:59:59
    }
}

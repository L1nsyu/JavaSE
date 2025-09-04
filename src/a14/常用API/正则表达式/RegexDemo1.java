package a14.常用API.正则表达式;

public class RegexDemo1 {
    public static void main(String[] args) {
        //正则表达式可以校验字符串是否满足一定的规则,并用来校验数据格式的合法性
        //需求:假如现在要求校验一个qq号码是否正确。
        //规则:6位及20位之内，0不能在开头，必须全部是数字.
        //先使用目前所学知识完成校验需求   然后体验一下正则表达式检验。
        String qq = "12345678";
//        boolean b = checkQQ(qq);
//        System.out.println(b);

        //正则表达式:
        System.out.println(qq.matches("[1-9]\\d{5,19}"));
        //校验用户名是否满足规则
        //校验密码是否满足规则
        //校验身份证是否满足规则
        //校验手机是否满足规则
    }

    public static boolean checkQQ(String qq) {
        //规则:6位及20位之内，0不能在开头，必须全部是数字.
        int len = qq.length();

        if (len < 6 || len > 20) {
            return false;
        }

        char firstNum = qq.charAt(0);
        if (firstNum == '0') {
            return false;
        }

        for (int i = 0; i < qq.length(); i++) {
            char c = qq.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
}

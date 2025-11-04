package b23.IO流.o31.综合练习.o3.登录注册;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) throws IOException {
        //需求:写一个登陆小案例.
        //步骤:
        //将正确的用户名和密码手动保存在本地的userinfo.txt文件中.
        //保存格式为:username=zhangsan&password=123
        //让用户键盘录入用户名和密码
        //比较用户录入的和正确的用户名密码是否一致
        //如果一致则打印登陆成功
        //如果不一致则打印登陆失败


        //1.读取正确的用户名和密码
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\lsy\\Desktop\\NewFileTest\\username&password.txt"));
        String line;

        String rightUsername = null;
        String rightPassword = null;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
            //username=zhangsan&password=123

            String[] userInfo = line.split("&");
            rightUsername = userInfo[0].split("=")[1];
            rightPassword = userInfo[1].split("=")[1];
        }
        br.close();


        //2.用户键盘录入用户名和密码
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.nextLine();
        System.out.println("请输入密码");
        String password = sc.nextLine();

        //3.比较
        if (rightUsername.equals(username) && rightPassword.equals(password)) {
            System.out.println("登陆成功");
        } else {
            System.out.println("登陆失败");
        }
    }
}

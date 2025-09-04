package a11.学生管理系统.two;

import a11.学生管理系统.one.StudentSystem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<User>();
        Scanner sc = new Scanner(System.in);
        loop:
        while (true) {
            System.out.println("-------------------欢迎来到学生管理系统-------------------");
            System.out.println("请选择操作: 1.登录 2.注册 3.忘记密码 4.退出");
            String choose = sc.next();
            switch (choose) {
                case "1":
                    login(list);
                    break;
                case "2":
                    register(list);
                    break;
                case "3":
                    forgetPassword(list);
                    break;
                case "4":
                    System.out.println("退出");
                    break loop;
                default:
                    System.out.println("没有这个选项请你重新选择");
                    break;
            }
        }
    }


    //用户注册
    private static void register(ArrayList<User> list) {
        System.out.println("用户注册");
        //用户名,密码,身份证号码,手机号放到用户对象中
        //把用户对象添加到集合中
        //1.键盘录入用户名
        Scanner sc = new Scanner(System.in);
        String username;
        while (true) {
            System.out.println("请输入你要注册的用户名");
            username = sc.next();
            //开发细节:
            //因为在以后所有的数据,都是存在数据库中,如果我们要校验,需要使用到网络资源

            boolean flag1 = checkUsername(username);
            if (!flag1) {
                System.out.println("用户名格式不满足条件,需要重新输入");
                continue;
            }

            boolean flag2 = contains(list, username);
            if (flag2) {
                System.out.println("用户名已存在,请重新输入");
            } else {
                System.out.println("用户名可用");
                break;
            }
        }

        //2.键盘录入密码
        //密码键盘输入两次,两次一致才可以进行注册
        String password;
        while (true) {
            System.out.println("请输入要注册的密码");
            password = sc.next();
            System.out.println("请再次输入要注册的密码");
            String againPassword = sc.next();
            if (password.equals(againPassword)) {
                System.out.println("密码设置完成");
                break;
            } else {
                System.out.println("两次密码不一致,请重新输入");
            }
        }

        //3.键盘录入身份证号码
        String idNumber;
        while (true) {
            System.out.println("请输入身份证号码");
            idNumber = sc.next();
            boolean flag3 = checkIdNumber(idNumber);
            if (flag3) {
                System.out.println("身份证号码满足要求");
                break;
            } else {
                System.out.println("身份证号码格式有误,请重新输入");
            }
        }

        //4.键盘录入手机号码
        String phoneNumber;
        while (true) {
            System.out.println("请输入手机号码");
            phoneNumber = sc.next();
            boolean flag4 = checkPhoneNumber(phoneNumber);
            if (flag4) {
                System.out.println("手机号码格式正确");
                break;
            } else {
                System.out.println("手机号码格式有误,请重新输入");
            }
        }

        //用户名,密码,身份证号码,手机号放到用户对象中
        User u = new User(username, password, idNumber, phoneNumber);
        list.add(u);
        System.out.println("注册成功");

        //遍历集合
        printList(list);

    }


    //用户登录
    private static void login(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名");
            String username = sc.next();
            //判断用户名是否存在
            boolean flag = contains(list, username);
            if (!flag) {
                System.out.println("用户名未注册,请先注册再登录");
                return;
            }


            System.out.println("请输入密码");
            String password = sc.next();

            while (true) {
                String rightCode = getCode();
                System.out.println("当前正确的验证码为:" + rightCode);
                System.out.println("请输入验证码");
                String code = sc.next();
                if (code.equalsIgnoreCase(rightCode)) {
                    System.out.println("验证码正确");
                    break;
                } else {
                    System.out.println("验证码错误,请重新输入");
                    continue;
                }
            }

            //验证用户名和密码是否正确
            //集合中是否包含用户名和密码
            //定义一个方法验证用户名和密码是否正确

            //封装思想的应用:
            //我们以后可以把一些零散的数据,封装成一个对象
            //以后传递参数的时候,只要传递一个整体就可以了,不需要管这些零散的数据
            User useInfo = new User(username, password, null, null);
            boolean result = checkUserInfo(list, useInfo);
            if (result) {
                System.out.println("登录成功,可以开始使用学生管理系统了");


                //创建对象调用方法, 启动学生管理系统
                StudentSystem ss = new StudentSystem();
                ss.startStudentSystem();


                break;
            } else {
                System.out.println("登录失败");
                if (i == 2) {
                    System.out.println("当前账号被锁定");
                    return;
                } else {
                    System.out.println("用户名或者密码错误,还剩下" + (2 - i) + "次机会");
                }
            }
        }
    }


    //忘记密码
    private static void forgetPassword(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.next();
        boolean flag = contains(list, username);
        if (!flag) {
            System.out.println("当前用户不存在");
            return;
        }

        //键盘录入身份证号码和手机号码
        System.out.println("请输入身份证号码");
        String idNumber = sc.next();
        System.out.println("请输入手机号码");
        String phoneNumber = sc.next();

        //需要把用户对象通过索引获出来
        int index = getIndex(list, username);
        User user = list.get(index);
        //比较用户对象的手机号码和身份证号码是否相同
        if (!(user.getPhoneNumber().equals(phoneNumber)) &&
                (user.getIdNumber().equals(idNumber))) {
            System.out.println("身份证号码或手机号码验证有误,不能修改密码");
            return;
        }
        //当代码执行到这里,表示所有的数据全部验证成功,直接修改即可
        String password;
        while (true) {
            System.out.println("请输入新的密码");
            password = sc.next();
            System.out.println("请再次输入新的密码");
            String againPassword = sc.next();
            if (password.equals(againPassword)) {
                System.out.println("两次密码输入一致");
                break;
            } else {
                System.out.println("两次密码输入不一致,请重新输入");
                continue;
            }
        }

        //直接修改即可
        user.setPassword(password);
        System.out.println("密码修改成功");

    }

    //通过用户名获取索引的方法
    public static int getIndex(ArrayList<User> list, String username) {
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            String name = u.getUsername();
            if (name.equals(username)) {
                return i;
            }

        }
        return -1;
    }

    //判断用户名在集合中是否存在
    public static boolean contains(ArrayList<User> list, String username) {
        int index = getIndex(list, username);
        return index >= 0;
    }

    //判断用户名是否满足要求的方法
    public static boolean checkUsername(String username) {
        //用户名长度必须在3~15之间
        int len = username.length();
        if (len <= 3 || len >= 15) {
            return false;
        }
        //当代码执行到这里,表示用户名的长度是符合要求的
        //继续校验:只能是字母加数字的组合
        //循环得到username 里面的每一个字符,如果有一个字符表示字母或者数字,那么就返回false

        //只能是字母加数字的组合, //但不能是纯数字
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))) {
                return false;
            }
        }

        //当代码执行到这里表示什么?
        //用户名满足两个要求: 1.长度满足 2.内容也满足(字母＋数字)
        //但是不能是数字
        //统计在用户名中,有多少字母就可以了
        int count = 0;
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                count++;
                break;
            }
        }
        return count > 0;
    }

    //判断身份证号码是否满足要求
    private static boolean checkIdNumber(String idNumber) {
        //长度为18位
        //不能以0为开头
        //前17位,必须都是数字
        //最后一位可以是数字,也可以是大写 X 或小写 x

        //长度为18位
        if (idNumber.length() != 18) {
            return false;
        }

        //不能以0为开头
//        char c1 = idNumber.charAt(0);
//        if (c1 == '0') {
//            return false;
//        }
        //判断是否开头为 '0' 的命令
        boolean flag = idNumber.startsWith("0");
        if (flag) {
            return false;
        }

        //前17位,必须都是数字
        for (int i = 0; i < idNumber.length() - 1; i++) {
            char c = idNumber.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }

        //最后一位可以是数字,也可以是大写 X 或小写 x
        char endChar = idNumber.charAt(idNumber.length() - 1);
        if ((endChar >= '0' && endChar <= '9') || (endChar == 'x') || (endChar == 'X')) {
            return true;
        } else {
            return false;
        }
    }

    //判断手机号码是否满足要求
    private static boolean checkPhoneNumber(String phoneNumber) {
        //长度为11位
        //不能以0为开头
        //必须都是数字

        //长度为11位
        int len = phoneNumber.length();
        if (len != 11) {
            return false;
        }

        //不能以0为开头
        boolean flag = phoneNumber.startsWith("0");
        if (flag) {
            return false;
        }

        //必须都是数字
        for (int i = 0; i < phoneNumber.length(); i++) {
            char c = phoneNumber.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }
        return true;
    }

    //遍历集合
    private static void printList(ArrayList<User> list) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            System.out.println(user.getUsername() + "," + user.getPassword() + ","
                    + user.getIdNumber() + "," + user.getPhoneNumber());
        }
    }

    //验证码
    public static String getCode() {
        //1.创建一个集合添加所有的大写和小写字母
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char) ('a' + i));
            list.add((char) ('A' + i));
        }

        //2.要随机抽取4个字符
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            int index = random.nextInt(list.size());
            char c = list.get(index);
            sb.append(c);
        }

        //3.把一个随机数字添加到末尾
        int number = random.nextInt(10);
        sb.append(number);

        //4.如果我们要修改字符串中的内容
        //先把字符串变成字符数组,在数组中修改,然后再创建一个新的字符串
        char[] arr = sb.toString().toCharArray();
        int randomIndex = random.nextInt(arr.length);

        char temp = arr[randomIndex];
        arr[randomIndex] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;

        return new String(arr);
    }

    //判断用户名和密码是否正确
    private static boolean checkUserInfo(ArrayList<User> list, User useInfo) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            if (user.getUsername().equals(useInfo.getUsername()) &&
                    user.getPassword().equals(useInfo.getPassword())) {
                return true;
            }
        }
        return false;
    }
}






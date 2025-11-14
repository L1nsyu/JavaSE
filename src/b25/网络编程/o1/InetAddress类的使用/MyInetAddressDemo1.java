package b25.网络编程.o1.InetAddress类的使用;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MyInetAddressDemo1 {
    public static void main(String[] args) throws UnknownHostException {
        /*
         * Static InetAddress getByName(String host)     确定主机名称的IP地址.主机名称可以是机器名称,也可以是IP地址
         * String getHostName()                          获取此IP地址的主机名
         * String getHostAddress()                       返回文本显示中的IP地址字符串
         * */


        //1.获取 InetAddress 的对象
        //IP 的对象 ---> 一台电脑的对象
        InetAddress address = InetAddress.getByName("DESKTOP-37AUTSK");
        System.out.println(address);

        String hostName = address.getHostName();
        System.out.println(hostName);

        String hostAddress = address.getHostAddress();
        System.out.println(hostAddress);
    }
}

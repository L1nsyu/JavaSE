package b25.网络编程.o5.单播_组播_广播;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class SendMessageDemo {
    public static void main(String[] args) throws IOException {
        /*
        * 组播发送端代码
        * */

        //创建MulticastSocket 对象
        MulticastSocket ms = new MulticastSocket();

        //创建DatagramPacket对象
        String s = "你好你好";
        byte[] bytes = s.getBytes();
        //组播
        InetAddress address = InetAddress.getByName("224.0.0.1");
        //如果要换成广播
        //则需要 255.255.255.255 的地址
        int port = 9000;

        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, port);

        //调用 MulticastSocket 发送数据方法发送数据
        ms.send(dp);

        //释放资源
        ms.close();
    }
}

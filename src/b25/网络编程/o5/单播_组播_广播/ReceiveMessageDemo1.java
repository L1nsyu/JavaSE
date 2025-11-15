package b25.网络编程.o5.单播_组播_广播;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class ReceiveMessageDemo1 {
    public static void main(String[] args) throws IOException {
        /*
        * 组播接收端代码
        * */

        //1.创建 MulticastSocket 对象
        MulticastSocket ms = new MulticastSocket(9000);

        //2.将当前本机,添加到 224.0.0.1 的这一组当中
        InetAddress address = InetAddress.getByName("224.0.0.1");
        ms.joinGroup(address);

        //3.创建 DatagramPacket 数据包对象
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

        //4.接收数据
        ms.receive(dp);

        //5.解析数据
        byte[] data = dp.getData();
        int length = dp.getLength();
        String ip = dp.getAddress().getHostAddress();
        String name = dp.getAddress().getHostName();

        System.out.println("IP为:" + ip + "主机名为:" + name + "的人,发送了数据:" + new String(data, 0, length));

        //6.释放资源
        ms.close();
    }
}

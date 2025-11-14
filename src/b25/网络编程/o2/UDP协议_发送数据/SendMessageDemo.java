package b25.网络编程.o2.UDP协议_发送数据;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendMessageDemo {
    public static void main(String[] args) throws IOException {
        //发送数据

        //1.创建DatagramSocket 对象 (快递公司)
        //细节:
        //绑定端口,以后我们就是通过这个端口往外发送
        //空参:所有可用的端口中随机一个进行使用
        //有参:指定端口进行绑定

        /*
        * 第1步：创建 DatagramSocket 对象 (找到一家快递公司)
         *    DatagramSocket ds = new DatagramSocket();
         *  代码作用：创建了一个 DatagramSocket 实例.这个对象是你的程序用来发送（和接收）数据包的“码头”或“端口”.
         *
         *  比喻解释：这行代码相当于你为了寄快递,在你的城市里找到了一个快递网点 (ds).
            new DatagramSocket() (空参)：你没有指定去哪个网点,系统就随机给你分配了一个临时的、空闲的网点.
            这个网点有一个内部编号（就是那个随机分配的端口号）,快递员会从这个网点出发去送货.
            对于一个只管发送的客户端来说,用哪个网点出发都无所谓,所以随机一个就行.

            new DatagramSocket(8888) (有参)：这就好比你指定了必须去“人民路8888号”这个固定的快递网点.
            这通常是接收端（服务器）做的事情,因为它必须有一个固定的地址,别人才知道该把快递寄到哪里.
         * */

        DatagramSocket ds = new DatagramSocket();

        //2.打包数据

        /*
        * 第2步：打包数据 (把要寄的东西和地址写好,装进快递包裹)
            String str = "你好!";
            byte[] bytes = str.getBytes();
            * 代码作用：将你要发送的字符串 "你好!" 转换成字节数组 bytes.
            * 比喻解释：电脑网络传输的不是文字,而是二进制的字节数据.
            这步操作就像你把**“你好!” 这几个字写在一张纸上**.这张纸就是你的货物 (bytes).
        * */
        String str = "你好!";
        byte[] bytes = str.getBytes();


        /*
        *   InetAddress address = InetAddress.getByName("127.0.0.1");
            int port = 9000;
            代码作用：
            InetAddress.getByName("127.0.0.1"): 获取目标IP地址.127.0.0.1 是一个特殊的IP地址,代表“本机”（localhost）.
            int port = 9000: 指定目标端口号.
            比喻解释：
            IP地址 (address)：这就是收件人的家庭住址,比如“幸福小区”.127.0.0.1 就表示收件人也住你自己这台电脑上.
            端口号 (port)：这就是收件人住址的具体门牌号,比如“9000号房间”.光有小区地址不行,你得知道具体送到哪个房间,
            接收端的程序正在这个“9000号房间”等着收快递.
        * */
        InetAddress address = InetAddress.getByName("127.0.0.1");
        int port = 9000;


        /*
        *   DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, port);
        * 代码作用：这是打包的最后一步.它把所有信息整合到一个 DatagramPacket 对象中.
        * 比喻解释：你现在拿到了一个标准的快递包裹 (dp).
            bytes：你把写着“你好!”的纸（货物）放进了包裹里.
            bytes.length：你在包裹上注明了货物的尺寸/重量.
            address, port：你在包裹的快递单上清清楚楚地写上了收件人的地址（幸福小区）和门牌号（9000号房间）.
        至此,一个信息齐全、随时可以发送的快递包裹就准备好了.
        * */
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, port);

        //3.发送数据
        ds.send(dp);

        //4.释放资源
        ds.close();



    }
}

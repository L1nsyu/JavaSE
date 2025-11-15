package b25.网络编程.o6.TCP协议_发送和接收数据;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //TCP协议,接收数据

        //1.创建对象ServerSocket
        ServerSocket ss = new ServerSocket(9000);

        //2.监听客户端的链接
        Socket socket = ss.accept();

        //3.从连接通道中获取输入流获取数据
        InputStream is = socket.getInputStream();
        //原来的"你好你好" 这四个字 会根据UTF-8 转换成 12个字节
        //因为字节流的原因, 无法正确将这四个字转化 , 会将第一个字节直接转化
        //导致每一个字 只有三分之一
        //所以要使用转换流
        InputStreamReader isr = new InputStreamReader(is);
        //为了提高效率可以进一步使用缓冲流
        BufferedReader br = new BufferedReader(isr);

        int b;
        while ((b = br.read()) != -1) {
            System.out.print((char) b);
        }

        //4.释放资源
        socket.close();
        ss.close();

    }
}

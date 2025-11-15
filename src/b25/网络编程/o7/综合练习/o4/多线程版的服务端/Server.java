package b25.网络编程.o7.综合练习.o4.多线程版的服务端;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class Server {
    public static void main(String[] args) throws IOException {
        //客户端:将本地文件上传到服务器,接收服务器的反馈.
        //服务器:接收客户端上传的文件,上传完毕之后给出反馈.

        //1.创建对象并绑定端口
        ServerSocket ss = new ServerSocket(9000);


        while (true) {
            //2.等待客户端来连接
            Socket socket = ss.accept();

            //3.读取数据并保存到本地文件当中
            //有一个弊端,假如我现在有多个用户同时上传文件
            //但是我们原始的代码是单线程的, 得一个一个来
            //所以我们要利用多线程来改造代码

            //开启一条线程
            //一个用户就对应服务端的一条线程
            new Thread(new MyRunnable(socket)).start();
        }
    }
}

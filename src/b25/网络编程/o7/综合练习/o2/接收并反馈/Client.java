package b25.网络编程.o7.综合练习.o2.接收并反馈;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //1.创建Socket对象并连接服务端
        Socket socket = new Socket("127.0.0.1",9000);

        //2.写出数据
        String str = "见到你很高兴!";
        OutputStream os = socket.getOutputStream();
        os.write(str.getBytes());

        //写出一个结束标记
        socket.shutdownOutput();

        //3.接收服务端回写的数据
        InputStream is = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        int b;
        while ((b = br.read()) != -1) {
            System.out.print((char) b);
        }

        is.close();
        os.close();
        socket.close();

    }
}

package b25.网络编程.o7.综合练习.o4.多线程版的服务端;

import b24.多线程_JUC.o2.多线程的第二种实现方式.MyRun;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class MyRunnable implements Runnable {

    Socket socket;

    public MyRunnable(Socket socket) {
        this.socket = socket;
    }


    @Override
    public void run() {
        try {
            BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
            String name = UUID.randomUUID().toString().replace("-", "");
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream
                    ("C:\\Users\\lsy\\Desktop\\NewFileTest\\" + name + ".jpg"));

            int len;
            byte[] bytes = new byte[1024];
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, len);
            }

            //4.回写数据
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            bw.write("上传成功");
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //5.释放资源
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}

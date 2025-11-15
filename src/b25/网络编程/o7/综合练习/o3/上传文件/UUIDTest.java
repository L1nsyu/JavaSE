package b25.网络编程.o7.综合练习.o3.上传文件;

import java.util.UUID;

public class UUIDTest {
    public static void main(String[] args) {
        //解决上传文件 文件名重复的问题
        String str = UUID.randomUUID().toString().replace("-", "");
        System.out.println(str);
    }
}

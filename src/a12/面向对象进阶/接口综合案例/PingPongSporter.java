package a12.面向对象进阶.接口综合案例;

public class PingPongSporter extends Sporter implements English {
    public PingPongSporter() {
    }

    public PingPongSporter(String name, int age) {
        super(name, age);
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球运动员在说英语");
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员在学习打乒乓球");
    }
}

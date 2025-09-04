package a12.面向对象进阶.接口综合案例;

public class PingpongCoach extends Coach implements English{
    @Override
    public void teach() {
        System.out.println("乒乓球教练在教乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球教练在说英语");
    }
}

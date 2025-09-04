package a12.面向对象进阶.接口综合案例;

public class Test1 {
    //乒乓球运动员 : 姓名,年龄 ,学打乒乓球 ,说英语
    //篮球运动员 : 姓名,年龄 ,学打篮球
    //乒乓球教练 : 姓名,年龄 ,教打乒乓球 ,说英语
    //篮球教练 : 姓名,年龄 ,教打篮球
    public static void main(String[] args) {
        //创建对象
        PingPongSporter pps = new PingPongSporter("刘诗雯", 22);
        System.out.println(pps.getName() + "," + pps.getAge());
        pps.study();
        pps.speakEnglish();
    }
}

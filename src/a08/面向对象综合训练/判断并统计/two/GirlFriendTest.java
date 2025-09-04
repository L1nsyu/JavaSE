package a08.面向对象综合训练.判断并统计.two;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend[] arr = new GirlFriend[4];

        GirlFriend gf1 = new GirlFriend("刘亦菲", 18, "萌妹子", "演戏");
        GirlFriend gf2 = new GirlFriend("陶吉吉", 40, "大哥哥", "唱歌");
        GirlFriend gf3 = new GirlFriend("方大同", 35, "大哥哥", "唱歌");
        GirlFriend gf4 = new GirlFriend("王力宏", 40, "大哥哥", "唱歌");

        arr[0] = gf1;
        arr[1] = gf2;
        arr[2] = gf3;
        arr[3] = gf4;

        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend gf = arr[i];
            sum += gf.getAge();
        }

        int avg = sum / (arr.length);

        for (int i = 0; i < arr.length; i++) {
            GirlFriend gf = arr[i];
            if (gf.getAge() < avg) {
                System.out.println(gf.getAge() + "," + gf.getName() + "," + gf.getGender() + "," + gf.getHobby());
                count++;
            }
        }
        System.out.println(count);
    }
}

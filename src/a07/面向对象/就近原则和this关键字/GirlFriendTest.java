package a07.面向对象.就近原则和this关键字;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend gf1 = new GirlFriend();
        gf1.setName("小诗诗");
        gf1.setAge(18);
        gf1.setGender("妹纸");

        //第一种表达方式
        String name = gf1.getName();
        int age = gf1.getAge();
        String gender = gf1.getGender();
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);

        //第二种表达方式
        System.out.println(gf1.getGender());
        System.out.println(gf1.getAge());
        System.out.println(gf1.getGender());

        gf1.eat();
        gf1.sleep();
    }
}

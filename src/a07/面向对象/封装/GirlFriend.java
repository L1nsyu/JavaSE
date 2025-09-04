package a07.面向对象.封装;

public class GirlFriend {
    private String name;
    private int age;
    private String gender;

    // 针对于每一个私有化的成员变量,都要提供get和set方法
    //set方法: 给成员变量赋值
    //get方法: 对外提供成员变量的值

    //name
    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    //age
    public void setAge(int a) {
        if (a >= 18 && a <= 50) {
            age = a;
        } else {
            System.out.println("非法参数");
        }
    }

    public int getAge() {
        return age;
    }

    //gender
    public void setGender(String g) {
        gender = g;
    }

    public String getGender() {
        return gender;
    }

    public void sleep() {
        System.out.println("女朋友在睡觉");
    }

    public void eat() {
        System.out.println("女朋友在吃饭");
    }
}

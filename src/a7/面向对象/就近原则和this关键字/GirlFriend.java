package a7.面向对象.就近原则和this关键字;

public class GirlFriend {
    private String name;
    private int age;
    private String gender;

    // 针对于每一个私有化的成员变量,都要提供get和set方法
    //set方法: 给成员变量赋值
    //get方法: 对外提供成员变量的值

    //name
    public void setName(String name) {
        //局部变量表示测试类中调用方法传递过来的数据
        //等号的左边: 就表示成员位置的name

        //this的作用:可以区别成员变量和局部变量
        //规则:就近原则,谁离我近,我就用谁
        this.name = name;

    }

    public String getName() {
        return name;
    }

    //age
    public void setAge(int age) {
        if (age >= 18 && age <= 50) {
            this.age = age;
        } else {
            System.out.println("非法参数");
        }
    }

    public int getAge() {
        return age;
    }

    //gender
    public void setGender(String gender) {
        this.gender = gender;
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

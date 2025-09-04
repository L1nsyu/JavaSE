package a15.常见算法.五道经典算法题;

public class GirlFriend {
    private int age;
    private String name;
    private double height;


    public GirlFriend() {
    }

    public GirlFriend(int age, String name, double height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return height
     */
    public double getHeight() {
        return height;
    }

    /**
     * 设置
     * @param height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    public String toString() {
        return "GirlFriend{age = " + age + ", name = " + name + ", height = " + height + "}";
    }
}

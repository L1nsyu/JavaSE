package b21.异常.o8.自定义异常;

public class GirlFriend {
    private String name;
    private int age;


    public GirlFriend() {
    }

    public GirlFriend(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name)/*throws RuntimeException*/ {
        int length = name.length();
        if (length < 3 || length > 10) {
            throw new NameFormatException(name + "格式有误,长度应该在3~10");
        }
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) /*throws RuntimeException*/ {
        if (age < 18 || age > 40) {
            throw new AgeOutOfBoundsException(age + "超出了范围");
        }
        this.age = age;
    }

    public String toString() {
        return "GirlFriend{name = " + name + ", age = " + age + "}";
    }
}

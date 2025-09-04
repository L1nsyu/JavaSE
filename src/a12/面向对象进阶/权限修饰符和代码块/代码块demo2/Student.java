package a12.面向对象进阶.权限修饰符和代码块.代码块demo2;

public class Student {
    private String name;
    private int age;

    //静态代码块
    //执行时机:
    //随着类的加载而加载的, 并且只执行一次
    static {
        System.out.println("静态代码块执行了");
    }

    public Student() {
        System.out.println("空参构造");
    }

    public Student(String name, int age) {
        System.out.println("有参构造");
        this.name = name;
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
}

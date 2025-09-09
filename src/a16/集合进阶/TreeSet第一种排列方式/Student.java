package a16.集合进阶.TreeSet第一种排列方式;

public class Student implements Comparable<Student> {
    public Student() {
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    //this: 表示当前要添加的元素
    //o: 表示已经在红黑树存在的元素

    //返回值:
    //负数:表示当前要添加的元素是小的,存在左边
    //正数:表示当前要添加的元素是大的,存在右边
    //0: 表示当前要添加的元素已经存在,舍弃
    public int compareTo(Student o) {
        System.out.println("------------------------");
        System.out.println("this:" + this);
        System.out.println("o:" + o);
        //指定排序的规则
        //只看年龄,我想要按照年龄的升序进行排序
        return this.getAge() - o.getAge();
    }

    private int age;
    private String name;


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
    public void setAge(int age) {
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
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Student{age = " + age + ", name = " + name + "}";
    }
}

package a12.面向对象进阶.认识多态;

public class Test1 {
    public static void main(String[] args) {
        //创建三个对象,并调用register方法

        Student s = new Student();
        s.setName("zhangsan");
        s.setAge(18);

        Teacher t = new Teacher();
        t.setName("lisi");
        t.setAge(23);

        Administrator a = new Administrator();
        a.setName("zhaoliu");
        a.setAge(23);

        register(s);
        register(t);
        register(a);
    }


    //这个方法既能接受老师,又能接收学生,还能接收管理员
    //只能把参数写成这三个类型的父类
    public static void register(Person p) {
        p.show();
    }
}

package a12.面向对象进阶.继承中的构造方法和thissuper关键字.Test;

public class Test1 {
    public static void main(String[] args) {
        //创建学生对象
        Student s1 = new Student(); //父类的无参构造
                                    //子类的无参构造

        Student s2 = new Student("zhangsan", 23);
        System.out.println(s2.name + "," + s2.age);//zhangsan,23
    }
}

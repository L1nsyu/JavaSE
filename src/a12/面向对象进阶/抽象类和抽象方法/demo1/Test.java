package a12.面向对象进阶.抽象类和抽象方法.demo1;

public class Test {
    public static void main(String[] args) {
        //创建对象
        //1.抽象类不能实例化 (创建对象)
//        Person p = new Person(); //baocuo

        Student stu = new Student("<UNK>", 18);

        System.out.println(stu.getName() + "," + stu.getAge());
    }
}

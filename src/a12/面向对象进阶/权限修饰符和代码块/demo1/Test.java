package a12.面向对象进阶.权限修饰符和代码块.demo1;

public class Test {
    public static void main(String[] args) {
        Animal a = new Animal();
        System.out.println(a.name);

        //private 在同一个包的其他类 ×
        //空着不写  在同一个包的其他类  ✔
        //protected 在同一个包的其他类  ✔
        //public 在同一个包的其他类  ✔

    }
}

package a12.面向对象进阶.权限修饰符和代码块.demo2;

import a12.面向对象进阶.权限修饰符和代码块.demo1.Animal;

public class Test {
    public static void main(String[] args) {
        Animal a = new Animal();
        System.out.println(a.name);

        //private  不同包下的无关类 ×
        //空着不写 不同包下的无关类 ×
        //protected 不同包下的无关类 ×
        //public 不同包下的无关类 ✔
    }
}

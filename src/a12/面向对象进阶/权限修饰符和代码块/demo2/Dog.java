package a12.面向对象进阶.权限修饰符和代码块.demo2;

import a12.面向对象进阶.权限修饰符和代码块.demo1.Animal;

public class Dog extends Animal {
    public void show() {
        System.out.println(name);
    }

    //private 不同包下的子类×
    //空着不写  不同包下的子类×
    //protected 不同包下的子类✔
    //public 不同包下的子类 ✔
}

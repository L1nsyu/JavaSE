package a12.面向对象进阶.多态的综合练习;

public class Dog extends Animal {
    //1.定义狗类
    //属性: 年龄 ,颜色
    //行为:
    //eat(String something)(something表示吃的东西)
    //看家lookHome方法(无参数)

    //空参构造
    public Dog() {

    }

    //带全部参数的构造
    public Dog(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.println(getAge() + "岁的" + getColor() + "颜色的狗两只前腿死死的抱住" + something + "猛吃");
    }

    public void lookHome() {
        System.out.println("狗在看家");
    }
}

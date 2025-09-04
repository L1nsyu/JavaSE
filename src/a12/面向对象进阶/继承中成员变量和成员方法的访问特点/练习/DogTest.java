package a12.面向对象进阶.继承中成员变量和成员方法的访问特点.练习;

public class DogTest {
    public static void main(String[] args) {
        Husky h = new Husky();
        h.eat();
        h.drink();
        h.breakHome();
        h.lookHome();


        ChineseDog cd = new ChineseDog();
        cd.eat();
        cd.drink();
        cd.lookHome();

    }
}

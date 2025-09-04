package a12.面向对象进阶.继承中成员变量和成员方法的访问特点.Test;

public class Test2 {
    public static void main(String[] args) {
//        Student stu = new Student();
//        stu.lunch();

        OverseaStuent ov = new OverseaStuent();
        ov.lunch();
    }
}

class Person {
    public void eat() {
        System.out.println("吃米饭,吃菜");
    }

    public void drink() {
        System.out.println("喝开水");
    }
}

class Student extends Person {
    public void lunch() {
        //就近原则,先在本类查看eat和drink方法 ,就会调用子类的, 如果没有,就会
        //从父类中继承下来的eat和drink方法

        eat(); //吃米饭,吃菜     // eat() = this.eat()
        drink();//喝开水    //drink() = this.drink()

        //直接调用父类中的eat和drink方法
        super.eat();//吃米饭,吃菜
        super.drink();//喝开水
    }
}

class OverseaStuent extends Person {
    public void lunch() {
        eat();//吃意大利面
        drink();//喝凉水

        super.eat();//吃米饭,吃菜
        super.drink();//喝开水
    }

    //重写的应用场景:
    //当父类中方法,不能满足子类现在的需求时,我们就需要把这个方法进行重写
    //注意:
    //子类中重写的方法上面需要加上    @Override
    @Override
    public void eat() {
        System.out.println("吃意大利面");
    }

    @Override
    public void drink() {
        System.out.println("喝凉水");
    }
}
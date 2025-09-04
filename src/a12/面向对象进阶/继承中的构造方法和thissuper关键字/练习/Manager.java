package a12.面向对象进阶.继承中的构造方法和thissuper关键字.练习;

public class Manager extends Employee{
    private double bouns;

    //空参构造
    public Manager(){

    }

    //带全部参数的构造
    //父类 + 子类
    public Manager(String id, String name, double salary, double bouns) {
        super(id, name, salary);
        this.bouns = bouns;
    }

    public double getBouns() {
        return bouns;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }

    @Override
    public void work() {
        System.out.println("管理其他人");
    }
}

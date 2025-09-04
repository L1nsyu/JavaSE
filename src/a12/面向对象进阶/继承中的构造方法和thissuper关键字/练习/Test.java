package a12.面向对象进阶.继承中的构造方法和thissuper关键字.练习;

public class Test {
    public static void main(String[] args) {
        //创建对象
        Manager m = new Manager("heima001", "zhangsan", 15000, 8000);
        System.out.println(m.getId() + "," + m.getName() + "," + m.getSalary() + "," + m.getBouns());
        m.work();
        m.eat();

        Cook c = new Cook();
        c.setId("heima002");
        c.setName("李四");
        c.setSalary(8000);
        System.out.println(c.getId() + "," + c.getName() + "," + c.getSalary());
        c.eat();
        c.work();
    }
}

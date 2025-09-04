package a12.面向对象进阶.继承中成员变量和成员方法的访问特点.Test;

public class Test1 {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.ziShow();
    }
}

class Fu {
    String name = "Fu";
}

class Zi extends Fu {
    String name = "Zi";
    public void ziShow() {
        String name = "ziShow";
        System.out.println(name);//ziShow
        System.out.println(this.name);//Zi
        System.out.println(super.name);//Fu
    }
}

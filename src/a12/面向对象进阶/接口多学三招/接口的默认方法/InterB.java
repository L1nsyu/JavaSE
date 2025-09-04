package a12.面向对象进阶.接口多学三招.接口的默认方法;

public interface InterB {
    public default void show(){
        System.out.println("接口B中的默认方法 --- show");
    }
}

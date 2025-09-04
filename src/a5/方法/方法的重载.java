package a5.方法;

public class 方法的重载 {
    public static void main(String[] args) {
        compare(10,20);
    }
    public static void compare(byte b1, byte b2) {
        System.out.println(b1 == b2);
        System.out.println("byte");
    }
    public static void compare(short s1, short s2) {
        System.out.println(s1 == s2);
        System.out.println("short");
    }
    public static void compare(int i1, int i2) {
        System.out.println(i1 == i2);
        System.out.println("int");
    }
    public static void compare(long n1, long n2) {
        System.out.println(n1 == n2);
        System.out.println("long");
    }
}

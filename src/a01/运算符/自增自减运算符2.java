package a01.运算符;

public class 自增自减运算符2 {
    public static void main(String[] args) {
        int x = 10;
        //后++:先用后加;前++:先加后用
        int y = x++;
        int z = ++x;

        System.out.println("x:" + x);//12
        System.out.println("y:" + y);//10
        System.out.println("z:" + z);//12
    }
}

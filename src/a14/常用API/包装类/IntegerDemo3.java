package a14.常用API.包装类;

public class IntegerDemo3 {
    public static void main(String[] args) {
        //在JDK5 的时候提出了一个机制
        //自动装箱:把基本数据类型 会自动的变成其对应的包装类
        //自动拆箱: 把包装类自动的变成其对应的基本数据类型

        //在底层,此时还会去自动调用静态方法Valueof 得到一个Integer对象,只不过这个动作不需要我们直接去操作了
        //自动装箱的动作
        Integer i1 = 10;
        Integer i2 = new Integer(10);

        //自动拆箱的动作
        int i = i2;
        System.out.println(i);

        //在JDK5以后,int和Integer 可以看作是同一个东西,因为在内部可以自动转化

    }
}

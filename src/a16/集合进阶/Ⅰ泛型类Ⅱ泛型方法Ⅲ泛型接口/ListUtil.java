package a16.集合进阶.Ⅰ泛型类Ⅱ泛型方法Ⅲ泛型接口;

import java.util.ArrayList;

public class ListUtil {
    //因为ListUtil是工具类,创建他的对象是没意义的,所以需要私有他的构造方法
    private ListUtil() {
    }

    //类中定义了应该静态方法addAll,用来添加多个集合的元素

    //参数一:集合
    //参数二~最后:要添加的元素

    //这里在类里为什么还要加上static静态方法呢?因为是工具类需要方便调用.
    //也就是 类名ListUtil.addAll就可以直接调用了
    //而非静态方法需要通过对象进行调用

    public static <E> void addAll(ArrayList<E> list, E e1, E e2, E e3, E e4) {
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
    }

    public static <E> void addAll2(ArrayList<E> list, E... e) {
        // E... e :它的底层逻辑就是一个for循环
        //数据类型  变量名 : 集合/数组
        for (E element : e) {
            list.add(element);
        }
    }

    public void show() {
        System.out.println("阿伟");
    }
}

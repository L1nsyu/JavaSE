package a16.集合进阶.Ⅰ泛型类Ⅱ泛型方法Ⅲ泛型接口;

public class GenericsDemo2 {
    public static void main(String[] args) {
        MyArrayList<String> list  =  new MyArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");

        System.out.println(list);
        //[a, b, c, null, null, null, null, null, null, null]


        MyArrayList<Integer> list2 =  new MyArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        System.out.println(list2);
    }
}

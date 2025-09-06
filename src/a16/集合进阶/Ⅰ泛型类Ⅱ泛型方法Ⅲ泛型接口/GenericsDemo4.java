package a16.集合进阶.Ⅰ泛型类Ⅱ泛型方法Ⅲ泛型接口;

public class GenericsDemo4 {
    public static void main(String[] args) {
        //泛式接口的两种使用方式:
        //1.实现类给出具体的类型
        //2.实现类延续泛型,创建实现类对象时再确定类型


        //1.实现类给出具体的类型
        MyArrayList2 list = new MyArrayList2();
        //此时因为实现类里已经定义了泛型String
        //所以后面集合添加的元素只能是String
        list.add("123");
//        list.add(123);//baocuo


        //2.实现类延续泛型,创建实现类对象时再确定类型
        MyArrayList3<String> list2 = new MyArrayList3<>();
        list2.add("123");

        MyArrayList3<Integer> list3 = new MyArrayList3<>();
        list3.add(1);

    }
}

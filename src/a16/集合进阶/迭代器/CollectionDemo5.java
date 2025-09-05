package a16.集合进阶.迭代器;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo5 {
    public static void main(String[] args) {
        //迭代器的细节注意点:
        //1.报错NoSuchElementException
        //2.迭代器遍历完毕，指针不会复位
        //3.循环中只能用一次next方法
        //4.迭代器遍历时，不能用集合的方法进行增加或者删除


        //1.创建集合并添加元素
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");
        coll.add("eee");

        //2.获取迭代器对象
        //迭代器就好比是一个箭头,默认指向集合的0索引处
        Iterator<String> it = coll.iterator();

        //3.利用循环不断的去获取结合中的每一个元素
        while (it.hasNext()) {
            //4.next方法的两件事情:获取元素并移动指针
            String str = it.next();
            if ("bbb".equals(str)){
                //迭代器遍历时，不能用集合的方法进行增加或者删除
                //coll.remove("bbb");
                //需要使用迭代器的方法进行删除
                it.remove();
            }

            /*
            //循环中只能用一次next方法
            System.out.println(it.next());//aaa   ccc     eee
            System.out.println(it.next());//bbb   ddd     NoSuchElementException
            */

        }
    }
}

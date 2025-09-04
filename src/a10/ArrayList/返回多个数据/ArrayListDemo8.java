package a10.ArrayList.返回多个数据;

import java.util.ArrayList;

public class ArrayListDemo8 {
    public static void main(String[] args) {
        //需求:
        //定义Javabean类:Phone
        // Phone属性:品牌，价格。
        // main方法中定义一个集合，存入三个手机对象，
        // 分别为:小米，1000。苹果，8000。锤子2999
        // 定义一个方法，将价格低于3000的手机信息返回

        //1.创建集合对象
        ArrayList<Phone> list = new ArrayList<>();

        //2.创建手机的对象
        Phone phone1 = new Phone("小米", 1000);
        Phone phone2 = new Phone("苹果", 8000);
        Phone phone3 = new Phone("锤子", 2999);

        //3.添加数据
        list.add(phone1);
        list.add(phone2);
        list.add(phone3);

        //4.调用方法
        ArrayList<Phone> checkPhoneList = checkPhone(list);

        //5.遍历集合
        for (int i = 0; i < checkPhoneList.size(); i++) {
            Phone p = checkPhoneList.get(i);
            System.out.println(p.getBrand() + "," + p.getPrice());
        }

    }

    //技巧:
    //如果我们要返回多个数据,可以把这些数据先放到一个容器里面,再把容器返回
    //集合 数组
    public static ArrayList<Phone> checkPhone(ArrayList<Phone> list) {
        //定义一个集合用于存储价格低于3000的手机对象
        ArrayList<Phone> resultList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Phone phone = list.get(i);
            int price = phone.getPrice();
            if (price < 3000) {
                resultList.add(phone);
            }
        }
        return resultList;
    }
}

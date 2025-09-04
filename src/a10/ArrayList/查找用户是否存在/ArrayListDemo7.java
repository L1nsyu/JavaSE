package a10.ArrayList.查找用户是否存在;

import java.util.ArrayList;

public class ArrayListDemo7 {
    public static void main(String[] args) {
        //需求:
        //1:main方法中定义一个集合，存入三个用户对象。用户属性为:id，username，password
        //2:要求:定义一个方法，根据id查找对应的用户信息如果存在，返回true
        //如果不存在，返回false

        //1.创建集合
        ArrayList<User> list = new ArrayList<>();

        //2.创建三个对象
        User u1 = new User("heima001", "zhangsan", "123456");
        User u2 = new User("heima002", "lisi", "123456");
        User u3 = new User("heima003", "wangwu", "123456");

        //3.把用户对象添加到集合当中
        list.add(u1);
        list.add(u2);
        list.add(u3);

        //4.查看id是否存在
        boolean flag = checkMessage(list, "heima001");
        System.out.println(flag);
    }

    public static boolean checkMessage(ArrayList<User> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            if (user.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }
}

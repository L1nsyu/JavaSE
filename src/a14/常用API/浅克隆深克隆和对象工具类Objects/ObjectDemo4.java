package a14.常用API.浅克隆深克隆和对象工具类Objects;

import com.google.gson.Gson;

public class ObjectDemo4 {
    public static void main(String[] args) throws CloneNotSupportedException {
        //protected object clone(int a)         对象克隆

        //1.先克隆一个对象
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 0};
        User u1 = new User(1, "zhangsan", "123456", "girl11", data);

        //2.克隆对象
        //细节:
        //方法在底层会帮我们创建一个对象,并把原对象中的数据拷贝过去
        //书写细节:
        //1.重写Object中的clone方法,
        //2.让javaBean类实现Cloneable接口,
        //3.创建原对象并调用clone就可以了
        User clone = (User)u1.clone();

        //验证一件事情:Object中的克隆是浅克隆
        //如果clone数组的值也更着改变了 就是浅克隆


        //System.out.println(u1);
        //System.out.println(clone);

        //第三方的工具:
        //1.第三方的代码导入到项目中
        //2.编写代码
        Gson gson = new Gson();
        //把对象变成一个字符串
        String s = gson.toJson(u1);
        //需要深克隆的时候再把字符串变回对象就可以了
        User user = gson.fromJson(s, User.class);

        int[] arr = u1.getData();
        arr[0] = 100;

        //打印对象
        System.out.println(user);
    }
}

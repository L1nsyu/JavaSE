package a15.常见算法.五道经典算法题;

import java.util.Arrays;
import java.util.Comparator;

public class Test1 {
    public static void main(String[] args) {
        //定义数组并存储一些女朋友对象，利用Arrays中的sort方法进行排序
        // 要求1:属性有姓名、年龄、身高。
        //要求2:按照年龄的大小进行排序，年龄一样，按照身高排序，身高一样按照姓名的字母进行排序
        // (姓名中不要有中文或特殊字符，会涉及到后面的知识)

        //1.创建三个女朋友的对象
        GirlFriend girlFriend1 = new GirlFriend(18, "xiaoshishi", 1.67);
        GirlFriend girlFriend2 = new GirlFriend(18, "xiaodandan", 1.72);
        GirlFriend girlFriend3 = new GirlFriend(19, "xiaohuihui", 1.78);

        //2.定义数组存储女朋友的信息
        GirlFriend[] arr = {girlFriend1, girlFriend2, girlFriend3};

        //3.利用Arrays中的sort方法进行排序
        //匿名内部类 lambda表达式
        Arrays.sort(arr, (o1, o2) -> {
                //按照年龄的大小进行排序，年龄一样，按照身高排序，身高一样按照姓名的字母进行排序
                double temp = o1.getAge() - o2.getAge();
                temp = temp == 0 ? o1.getHeight() - o2.getHeight() : temp;
                temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;

                // 负数:表示当前要插入的元素是小的，放在前面
                // 正数:表示当前要插入的元素是大的，放在后面
                // 0:表示当前要插入的元素跟现在的元素比是一样的们也会放在后面
                if (temp > 0) {
                    return 1;
                } else if (temp < 0) {
                    return -1;
                } else {
                    return 0;
                }
            }
        );

        //4.展示一下数组中的内容
        System.out.println(Arrays.toString(arr));
    }
}

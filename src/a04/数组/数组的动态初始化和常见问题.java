package a04.数组;

public class 数组的动态初始化和常见问题 {
    public static void main(String[] args) {
        //动态初始化: 初始化时只指定数组长度,由系统为数组分配初始值
        //格式 : 数据类型[] 数组名 = new 数据类型[数组长度];
        //例子: int[] arr = new int[3];

        //定义一个数组,用来存储班级中50个学生的姓名
        //姓名未知,等学生报道过后,再进行添加

/*
        String[] arr = new String[50];
        arr[0] = "zhangsan";
        arr[1] = "lisi";
        System.out.println(arr[0]);//zhangsan
        System.out.println(arr[1]);//lisi
        System.out.println(arr[2]);//null
*/

        //数组默认初始化值的规律
        //整数类型: 0
        //小数类型: 0.0
        //字符类型: '/u0000'(空格)
        //布尔类型: false
        //引用数据类型: null

        //数组常见问题:
/*        int[] arr = {1,2,3,4,5};
        System.out.println(arr[10]);//索引越界异常
        */

        //索引越界异常,原因:访问了不存在的索引;避免:索引的范围
    }
}

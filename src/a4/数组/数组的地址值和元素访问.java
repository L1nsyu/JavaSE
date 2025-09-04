package a4.数组;

public class 数组的地址值和元素访问 {
    public static void main(String[] args) {
/*        int[] arr1 = new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println(arr1);//[I@1b6d3586

        double[] arr2 = new double[]{11.1,12.1,13.1,14.1};
        System.out.println(arr2);//[D@4554617c
        */

        //扩展:
        //解释一下地址值的格式含义 [D@4554617c
        //[ :表示当前是一个数组
        //D :表示当前数组里面的元素都是double类型的
        //@ :表示一个间隔符号.(固定格式)
        //4554617c : 才是数组真正的地址值.(十六进制)
        //平时我们习惯性的会把这个整体叫做数组的地址值.

        //利用索引对数组中的元素进行访问
        //1.获取数组里面的元素
        //格式 : 数组名[索引]
        int[] arr = {1,2,3,4,5};
        //获取数组中的第一个元素
        int number = arr[0];
        System.out.println(number);//1

        //获取数组中1索引对于的数据,并直接打印出来
        System.out.println(arr[1]);//2


        //2.把数据存储到数组当中
        //格式:  数组名[索引] = 具体变量/数据
        //细节:一旦覆盖之后,原来的数据就不存在了.
        arr[0] = 100;
        System.out.println(arr[0]);//100
    }
}

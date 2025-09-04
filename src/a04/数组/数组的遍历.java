package a04.数组;

public class 数组的遍历 {
    public static void main(String[] args) {
        //数组遍历: 将数组中所有的内容取出来,取出来之后可以(打印,求和,判断...)
        //注意 : 遍历指的是取出数据的过程,不要局限的理解为,遍历就是打印.
/*
        int[]arr = {1,2,3,4,5};

        //获取数组里面所有的元素
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        */


        //在java之中,关于数组的一个长度属性,length
        //调用方式: 数组名.length
        //扩展:
        //自动的快速生成数组的遍历方式
        //idea提供的
        //数组名.fori


        //要求1:
        //定义一个数组,存储1,2,3,4,5
        //遍历数组得到每一个元素,求数组里面所有的数据和

/*        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
        */


        //要求2:
        //定义一个数组,存储1,2,3,4,5,6,7,8,9,10
        //遍历数组得到每一个元素,统计数组里面一共有多少个能被3整除的数字
/*
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0 ) {
                count++;
            }
        }
        System.out.println(count);
*/


        //要求3:
        //定义一个数组,存储1,2,3,4,5,6,7,8,9,10,遍历数组得到每一个元素
        //要求:如果是奇数,则将当前数字扩大两倍,如果是偶数,则将当前数字变成二分之一

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = arr[i] / 2;
            } else if (arr[i] % 2 != 0) {
                arr[i] = arr[i] * 2;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

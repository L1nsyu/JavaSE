package a5.方法;

public class 方法练习判断是否存在 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 7, 8, 10, 34, 63, 24};
        int number = 34;

        boolean flag = contains(arr, number);
        System.out.println(flag);
    }

    public static boolean contains(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }

    //return break关键字的区别:
    //return: 其实跟循环没有什么关系,跟方法有关的,表示1结束方法 2返回结果
    //          如果方法执行到了return,那么整个方法全部结束,里面的循环夜会随之结束了

    //break:
    //其实跟方法没有什么关系,结束循环或者switch的.
}

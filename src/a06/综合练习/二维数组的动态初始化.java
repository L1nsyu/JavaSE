package a06.综合练习;

public class 二维数组的动态初始化 {
    public static void main(String[] args) {
        //格式:数据类型[][] 数组名 = new 数据类型[m][n];
        //m: 表示这个二维数组,可以存放多少个一维数组
        //n: 表示每一个一维数组 ,可以存放多少个元素

        //eg:int[][] arr = new int[2][3];
        //该数组可以存放2个 一维数组,每一个一维数组中可以存放3个int 类型元素

        int[][] arr = new int[3][5];
        arr[0][0] = 10;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

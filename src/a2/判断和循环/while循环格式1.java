package a2.判断和循环;

public class while循环格式1 {
    public static void main(String[] args) {
//         int i = 1;
//         while (i <= 100) {
//             System.out.println(i);
//             i++;
//         }

//        for 和 while 的区别:
//        1.for循环中,控制循环的变量,因为归属for循环的语法结构中,在for循环结束后,就不能再次被访问到了.
//        2.while循环中,控制循环的变量,对于while循环来说不归属其语法结构中,在while循环结束后,该变量还可以继续使用.
//        3.for循环中,知道循环次数和循环的范围
//        4.while循环中,不知道循环的次数和范围,只知道循环的结束条件
//        相同点:运行规则都是一样的


        //需求:世界最高山峰是珠穆朗玛峰((8844.43米=8844430毫米)，
        // 假如我有一张足够大的纸，它的厚度是0.1毫米。
        // 请问，我折叠多少次，可以折成珠穆朗玛峰的高度?

        double n = 0.1;
        double height = 8844430;
        int count = 0;
        while (n <= height) {
            n = n * 2;
            count++;
        }
        System.out.println(count);
    }
}

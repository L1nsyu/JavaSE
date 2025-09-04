package a09.字符串.StringBuilder的基本操作;

public class StringDemo13 {
    public static void main(String[] args) {
        //1.创建对象
        StringBuilder sb = new StringBuilder("投币");

        //2.添加元素
        sb.append(1);
        sb.append(2.3);
        sb.append(true);

        //反转
        sb.reverse();
        System.out.println(sb); //eurt3.21币投

        //获取长度
        int len = sb.length();
        System.out.println(len);    //10


//        System.out.println(sb);     //(空)
//        System.out.println(sb);     //投币
//        System.out.println(sb);     //投币12.3true

        //普及:因为StringBuilder是java已经写好的类,
        // java在底层对他做了一些特殊处理,
        // 打印对象不是地址值而是属性值
    }
}

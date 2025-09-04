package a09.字符串.StringBuilder的基本操作;

public class StringDemo14 {
    public static void main(String[] args) {
        //1.创建对象
        StringBuilder sb = new StringBuilder();

        //2.添加字符串
/*        sb.append("aaa");
        sb.append("bbb");
        sb.append("ccc");
        sb.append("ddd");
*/

        sb.append("aaa").append("bbb").append("ccc").append("ddd");



        System.out.println(sb);//aaabbbcccddd
        //此时sb显示的是容器的值,而不是一个字符串

        //3.再把StringBuilder变回字符串
        String str = sb.toString();
        System.out.println(str);//aaabbbcccddd

        System.out.println(sb.toString());//aaabbbcccddd
    }
}

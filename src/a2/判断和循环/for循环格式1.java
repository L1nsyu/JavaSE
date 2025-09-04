package a2.判断和循环;

public class for循环格式1 {
    public static void main(String[] args) {
        //         格式:
        //        for (int i = 1; i <= 10; i++) {
        //            System.out.println("helloworld");
        //              }

//            执行流程:
//        1.执行初始化语句;
//        2.执行条件判断语句,看其结果是true还是false
//            如果是false,循环结束
//            如果是true,执行循环体语句
//        3.执行条件控制语句
//        4.回到2继续执行条件判断语句

/*        for (int i = 1; i <= 5; i++) {
            System.out.println("helloworld");
        }*/


        //需求1:打印1-5
/*        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        //需求2:打印5-1
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }*/


        //在实际开发中，需要重复执行的代码，会选择循环实现，
        //比如:如左图所示。玩游戏的时候，如果网不好那么会经常断线重连那么断线重连这个业务逻辑就需要重复执行，
        //假设现在公司要求，断线重连的业务逻辑最多只写5次。请用代码实现，
        //备注:断线重连的业务逻辑可以用输出语句替代


        for (int i = 1; i <= 5; i++) {
            System.out.println("第" + i + "次执行断线重连的业务逻辑");
        }
    }


}

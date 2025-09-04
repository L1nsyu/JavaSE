package a3.循环高级综合练习;

public class 无限循环和跳转控制语句 {
    public static void main(String[] args) {
        //无限循环:循环一直停不下来
/*        //for格式的无限循环
        for (;;){
            System.out.println("学习");
        }

        //while格式的无限循环
        while(true){
            System.out.println("学习");
        }
        */

        //无限循环的下面不能再写其他代码了,因为循环永远停不下来
        //那么下面的代码永远执行不到

        //1.跳过某一次循环
       /* for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println("小老虎在吃第" + i + "个包子");
        }
        */

        //2.结束整个循环
        /*for (int i = 1; i <= 5; i++) {
            System.out.println("小老虎在吃第" + i + "个包子");
            if (i == 3) {
                break;
            }
            System.out.println("小老虎在吃第" + i + "个包子");//只能显示第一次和第二次,因为break已经结束循环
        }
        */

        //总结:1.continue:跳过本次循环,继续执行下次循环
        //    2.break:结束整个循环
    }
}

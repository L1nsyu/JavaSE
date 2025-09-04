package a5.方法;

public class 最简单的方法定义和调用 {
    public static void main(String[] args) {

        //定义格式:public static void 方法名(){
        //      方法体(就是打包起来的代码)
        // }

        //调用格式:方法名();

        //调用方法
        playGame();
        playGame();
    }


    //定义一个方法
    public static void playGame() {
        System.out.println("选人物");
        System.out.println("准备开局");
        System.out.println("对线");
        System.out.println("崩盘");
        System.out.println("骂队友");
        System.out.println("送人头");
        System.out.println("GG");
    }
}

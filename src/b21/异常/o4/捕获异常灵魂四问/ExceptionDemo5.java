package b21.异常.o4.捕获异常灵魂四问;

public class ExceptionDemo5 {
    public static void main(String[] args) {
/*
        自己处理(捕获异常)灵魂四问:
        灵魂二问:⭐⭐
        如果try中可能会遇到多个问题,怎么执行?
            会写多个catch与之对应
            细节:
                如果我们要捕获多个异常,这些异常中如果存在父子关系的话,那么父类一定要写在下面
                为什么呢? 假设我把catch(Exception e)放在最上面
                那么当第一个try开始往下找catch的时候,他会跟第一个catch匹配
                而父类catch(Exception e) 能匹配所有的try
                下面的其他的try就永远不会被获取到了

            了解性内容:
                在JDK7之后,我们可以在catch中同时捕获多个异常,中间用|进行隔开
                表示如果出现了A异常或者B异常的话,采取同一种处理方法

*/

        int[] arr = {1, 2, 3, 4, 5, 6};

        try {
            String s = null;
            System.out.println(s.equals("abc"));//NullPointerException
            System.out.println(2 / 0);//ArithmeticException
            System.out.println(arr[10]);//ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("索引越界了");
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0");
        } catch (NullPointerException e) {
            System.out.println("空指针异常");
        } catch (Exception e) {
            System.out.println("Exception");
        }
        System.out.println("看看我执行了没?");
    }
}

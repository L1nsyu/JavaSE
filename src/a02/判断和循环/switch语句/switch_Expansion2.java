package a02.判断和循环.switch语句;

public class switch_Expansion2 {
    public static void main(String[] args) {
        int number = 3;
        switch (number) {
            case 1 -> {
                System.out.println("一");
            }
            case 2 -> {
                System.out.println("二");
            }
            case 3 -> {
                System.out.println("三");
            }
            default -> {
                System.out.println("没有这种选项");
            }
        }

    }
}

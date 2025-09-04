package a2.判断和循环;

public class switch语句1 {
    public static void main(String[] args) {
//        switch语句:
//        switch (表达式) {
//            case 值1:
//                语句体1;
//                break;
//            case 值2:
//                语句体1;
//                break;
//            case 值3:
//                语句体1;
//                break;
//            .......
//            default:
//                语句体n+1;
//                break;
//            }
        String noodles = "炸酱面";
        switch (noodles) {
            case "兰州拉面":
                System.out.println("吃兰州拉面");
                break;
            case "炸酱面":
                System.out.println("吃炸酱面");
                break;
            case "武汉热干面":
                System.out.println("吃武汉热干面");
                break;
            case "陕西油泼面":
                System.out.println("吃陕西油泼面");
                break;
            default:
                System.out.println("吃方便面");
                break;
        }

    }
}

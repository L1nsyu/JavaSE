package a08.面向对象综合训练.两个对象数组练习.two;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Car[] carsArr = new Car[3];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < carsArr.length; i++) {
            Car car = new Car();

            System.out.println("请输入汽车的品牌");
            String brand = sc.next();
            car.setBrand(brand);

            System.out.println("请输入汽车的价格");
            int price = sc.nextInt();
            car.setPrice(price);

            System.out.println("请输入汽车的颜色");
            String color = sc.next();
            car.setColor(color);

            carsArr[i] = car;
        }
        for (int i = 0; i < carsArr.length; i++) {
            Car car = carsArr[i];
            System.out.println(car.getBrand() + "," + car.getPrice() + "," + car.getColor());
        }
    }
}

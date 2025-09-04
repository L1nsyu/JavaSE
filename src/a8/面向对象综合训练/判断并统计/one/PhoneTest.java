package a8.面向对象综合训练.判断并统计.one;

public class PhoneTest {
    public static void main(String[] args) {
        Phone[] phoneArr = new Phone[3];

        Phone phone1 = new Phone("小米", "白色", 1999);
        Phone phone2 = new Phone("华为", "黑色", 5999);
        Phone phone3 = new Phone("苹果", "金色", 6999);

        phoneArr[0] = phone1;
        phoneArr[1] = phone2;
        phoneArr[2] = phone3;

        int sum = 0;
        for (int i = 0; i < phoneArr.length; i++) {
            Phone phone = phoneArr[i];
            sum = sum + phone.getPrice();
        }

        int avg = sum / phoneArr.length;
        System.out.println(avg);
    }
}

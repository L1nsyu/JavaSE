package a08.面向对象综合训练.文字版格斗游戏.two;

public class GameTest {
    public static void main(String[] args) {
        Role r1 = new Role("乔峰", 100, '男');
        Role r2 = new Role("鸠摩智", 100, '男');


        r1.showRoleInfo();
        r2.showRoleInfo();

        while (true) {
            //r1开始攻击r2
            r1.attack(r2);
            if (r2.getBlood() == 0) {
                System.out.println(r1.getName() + "KO了" + r2.getName());
                break;
            }

            r2.attack(r1);
            if (r1.getBlood() == 0) {
                System.out.println(r2.getName() + "KO了" + r1.getName());
                break;
            }
        }
    }
}

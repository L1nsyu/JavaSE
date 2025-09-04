package a08.面向对象综合训练.文字版格斗游戏.one;

import java.util.Random;

public class Role {
    private String name;
    private int blood;

    public Role() {
    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    //定义一个方法用于攻击别人
    //Role r1 = new Role();
    //Role r2 = new Role();
    //r1.攻击(r2)
    //方法的调用者去攻击参数

    public void attack(Role role) {
        Random random = new Random();
        int hurt = random.nextInt(20) + 1;
        int remainBlood = role.getBlood() - hurt;
        remainBlood = remainBlood < 0 ? 0 : remainBlood;
        role.setBlood(remainBlood);

        System.out.println(this.getName() + "举起了拳头,打了" + role.getName() +
                "一下,造成了" + hurt + "点伤害," + role.getName() + "还剩下了" + remainBlood + "点血");
    }
}

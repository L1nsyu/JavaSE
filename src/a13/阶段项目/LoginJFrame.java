package a13.阶段项目;

import javax.swing.*;

public class LoginJFrame extends JFrame {
    //LoginJFrame 表示登录界面
    //以后跟登录相关的代码,都写在这里

    //目的: 用来(初始化!!!) LoginJFrame 创建的对象
    //这也是构造方法的具体应用场景
    //构造方法
    public LoginJFrame(){
        //在创建登录界面的时候,同时给这个界面去设置一些信息
        //比如, 宽高, 和 直接展示

        this.setSize(488,430);

        //设置界面的标题
        this.setTitle("拼图登录");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置游戏的关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //是否展示JFrame,让界面展示出来,建议写在最后
        this.setVisible(true);
    }
}

package a13.阶段项目.Test.Things;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyL extends JFrame implements KeyListener {

    public KeyL() {
        //设置界面的宽高
        this.setSize(603, 680);
        //设置界面的标题
        this.setTitle("拼图单机版 v1.0");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置游戏的关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消默认的居中放置,只有取消了才会按照XY轴的形式添加组件
        this.setLayout(null);

        //给整个窗体添加键盘监听
        //调用者this:本类对象,当前的界面对象,表示我要给整个界面添加监听
        //addKeyListener : 表示我要给本界面添加键盘监听
        //参数this: 当事件被触发之后,会执行本类中的对应代码
        this.addKeyListener(this);


        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //不管 了解即可
    }


    //细节一:
    //如果我们按住不松开,那么会重复的去调用keyPressed方法
    //细节二:
    //键盘里面那么多按键,如何进行区分?
    //每一个按键都有一个编号与之对应
    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("按下不松");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("松开按键");
        //获取键盘上每一个按键的编号
        int code = e.getKeyCode();
        System.out.println(code);
    }
}

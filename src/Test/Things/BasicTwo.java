package Test.Things;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class BasicTwo extends JFrame implements ActionListener {
    //创建一个按钮对象
    JButton button1 = new JButton("点我啊");
    //创建第二个按钮对象
    JButton button2 = new JButton("在点我啊");

    public BasicTwo() {
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

        //给按钮设置位置和宽高
        button1.setBounds(0,0,100,50);
        //给按钮添加事件
        button1.addActionListener(this);//this 表示本类对象 当事件被触发时会触发本类 actionPerformed();

        //给按钮设置位置和宽高
        button2.setBounds(100,0,100,50);
        //给按钮添加事件
        button2.addActionListener(this);

        //把按钮添加到整个界面当中
        this.getContentPane().add(button1);
        this.getContentPane().add(button2);

        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        //对当前的按钮进行判断

        //获取当前被操作的那个按钮的对象
        Object source = e.getSource();
        if (source == button1) {
            button1.setSize(200, 200);
        } else if (source == button2) {
            Random r = new Random();
            button2.setLocation(r.nextInt(500), r.nextInt(500));
        }
    }
}

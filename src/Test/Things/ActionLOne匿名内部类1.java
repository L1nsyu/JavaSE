package Test.Things;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionLOne匿名内部类1 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        //设置界面的宽高
        jFrame.setSize(603, 680);  //这里数字单位代表像素的意思
        //设置界面的标题
        jFrame.setTitle("事件演示");
        //设置界面置顶
        jFrame.setAlwaysOnTop(true);
        //设置界面居中
        jFrame.setLocationRelativeTo(null);
        //设置游戏的关闭模式
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消默认的居中放置,只有取消了才会按照XY轴的形式添加组件
        jFrame.setLayout(null);

        //创建一个按钮对象
        JButton button = new JButton("点我啊");
        //设置宽高
        button.setBounds(0, 0, 100, 100);
        //给按钮添加动作监听
/*        button:组件对象,表示你要给哪个组件添加事件
        addActionListener: 表示我要给组件添加哪个事件监听 (动作监听 1.鼠标左键点击, 2.空格)
        ActionListener 是一个接口 要创建相应的对象 需要先创建一个实现类
        MyActionListener 是我创建的关于ActionListener 接口的实现类
        addActionListener(new MyActionListener()) 后面的参数部分表示事件被执行之后要执行的代码
        button.addActionListener(new MyActionListener());
 */
        //使用匿名内部类解决
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("大咩~不要点我哦~");
            }
        });
        //把按钮添加到界面当中
        jFrame.getContentPane().add(button);

        jFrame.setVisible(true);
    }
}

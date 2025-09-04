package a14.常用API.Runtime;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class MyJFrame extends JFrame implements ActionListener {

    JButton button1 = new JButton("帅爆了");
    JButton button2 = new JButton("一般般吧");
    JButton button3 = new JButton("不帅,有点磕碜");
    JButton button4 = new JButton("饶了我吧!!!");

    //决定了上方的按钮是否展示
    //true:展示
    //false:不展示
    boolean flag = false;


    public MyJFrame() {
        initJFrame();

        initView();

        //显示
        this.setVisible(true);
    }

    public void initView() {
        //清空原本已经出现的所有图片
        this.getContentPane().removeAll();

        if (flag) {
            //展示按钮
            button4.setBounds(50, 20, 100, 30);
            button4.addActionListener(this);
            this.getContentPane().add(button4);
        }

        JLabel text = new JLabel("你觉得自己帅吗?");
        Font font = new Font("微软雅黑", 0, 30);
        text.setFont(font);
        text.setBounds(120, 150, 300, 50);

        button1.setBounds(200, 250, 100, 30);
        button2.setBounds(200, 325, 100, 30);
        button3.setBounds(160, 400, 180, 30);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);

        this.getContentPane().add(text);
        this.getContentPane().add(button1);
        this.getContentPane().add(button2);
        this.getContentPane().add(button3);

        //刷新一下界面
        this.getContentPane().repaint();

    }

    //初始化界面
    public void initJFrame() {
        //设置宽高
        this.setSize(500, 600);
        //设置标题
        this.setTitle("恶搞好基友");
        //设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //置顶
        this.setAlwaysOnTop(true);
        //居中
        this.setLocationRelativeTo(null);
        //取消内部默认布局
        this.setLayout(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == button1) {
            //给好基友一个弹框
            showJDialog("xxx,你太自信了,给你一点小惩罚");
            try {
                Runtime.getRuntime().exec("shutdown -s -t 3600");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            flag = true;
            initView();

        } else if (source == button2) {
            showJDialog("xxx,你还是太自信了,给你一点小惩罚");
            try {
                Runtime.getRuntime().exec("shutdown -s -t 7200");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            flag = true;
            initView();

        } else if (source == button3) {
            showJDialog("xxx,你还是有点自知之明的,也要给你一点小惩罚");
            try {
                Runtime.getRuntime().exec("shutdown -s -t 18000");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            flag = true;
            initView();

        } else if (source == button4) {
            showJDialog("xxx,这次饶了你");
            try {
                Runtime.getRuntime().exec("shutdown -a");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }

    //创建弹窗方法
    public void showJDialog(String content) {
        //创建一个弹窗对象
        JDialog jDialog = new JDialog();
        //给弹框设置大小
        jDialog.setSize(200, 150);
        //让弹框置顶
        jDialog.setAlwaysOnTop(true);
        //让弹框再来居中
        jDialog.setLocationRelativeTo(null);
        //弹框不关闭则无法操作下面的界面
        jDialog.setModal(true);

        //创建一个管理图片的容器对象JLabel
        JLabel warning = new JLabel(content);
        warning.setBounds(0, 0, 200, 150);
        //把图片添加到弹框当中
        jDialog.getContentPane().add(warning);

        //让弹框显示出来
        jDialog.setVisible(true);
    }

}

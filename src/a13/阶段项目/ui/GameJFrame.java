package a13.阶段项目.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

//JFrame 代表界面 窗体
//子类呢? 也表示界面 窗体
//规定: GameJFrame 这个界面表示的就是游戏的主界面
//以后跟游戏相关的所有逻辑都写再这个类中
public class GameJFrame extends JFrame implements KeyListener, ActionListener {

    //创建二维数组
    int[][] data = new int[4][4];

    //记录空白方块在数组中的位置
    int x = 0;
    int y = 0;

    //定义一个变量,记录当前展示图片的路径
    String path = "yunsuanfu\\image\\girl\\girl7\\";

    //定义一个二维数组,存储正确的数据
    int[][] win = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0},
    };

    //定义变量用来统计步数
    int step = 0;

    //创建选项下面的条目对象
    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem reLoginItem = new JMenuItem("重新登录");
    JMenuItem closeItem = new JMenuItem("关闭游戏");

    JMenuItem accountItem = new JMenuItem("公众号");

    public GameJFrame() {
        //初始化界面                    tips: // crtl + alt + m 创建快捷方法
        initJFrame();

        //初始化菜单
        initJMenuBar();

        //初始化数据(打乱)
        initData();

        //初始化图片
        initImage();

        //是否展示JFrame,让界面展示出来,建议写在最后
        this.setVisible(true);
    }

    //判断data数组中的数据是否跟win数组中相同的方法 ;如果全部相同,返回true,否则返回false
    public boolean victory() {
        for (int i = 0; i < data.length; i++) {
            //i:依次表示二维数组 data 里面的索引
            //data[i] : 依次表示每一个一维数组
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] != win[i][j]) {
                    //只要有一个数据不一样,则返回false
                    return false;
                }
            }
        }
        //循环结束表示数组遍历比较完毕,全部一样返回true
        return true;
    }

    //初始化数据(打乱)
    private void initData() {
        //需求: 把一个一维数组中的数据: 0~15 ;打乱数据后,再按照四个一组的方式添加到二维数组中

        //1.定义一个一维数组
        int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        //2.打乱数组中数据的顺序
        Random random = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            int index = random.nextInt(tempArr.length);
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }
        //3.给二维数组添加数据
        for (int i = 0; i < tempArr.length; i++) {
            if (tempArr[i] == 0) {
                x = i / 4;
                y = i % 4;
            }
            data[i / 4][i % 4] = tempArr[i];
        }
    }

    //初始化菜单
    private void initJMenuBar() {
        //创建整个的菜单对象
        JMenuBar jMenuBar = new JMenuBar();

        //创建菜单上面的两个选项的对象 (功能   关于我们)
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");

        //将每一个选项下面的条目添加到选项当中
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(accountItem);

        //给条目绑定事件
        replayItem.addActionListener(this);
        reLoginItem.addActionListener(this);
        closeItem.addActionListener(this);
        accountItem.addActionListener(this);

        //将菜单里面的两个选项添加到菜单当中
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        //给整个界面设置菜单
        this.setJMenuBar(jMenuBar);
    }

    //初始化图片
    //添加图片的时候就得按照二维数组中管理的数据添加图片
    private void initImage() {
/*      //创建一个图片ImageIcon的对象
        ImageIcon icon1 = new ImageIcon("D:\\javacode\\heima_Java_basic\\yunsuanfu\\image\\girl\\girl1\\1.jpg");
        //创建一个JLabel的对象(管理容器)
        JLabel jLabel1 = new JLabel(icon1);
*/
        //清空原本已经出现的所有图片
        this.getContentPane().removeAll();

        if (victory()) {
            //显示胜利的图标
            ImageIcon winIcon = new ImageIcon("yunsuanfu\\image\\win.png");
            JLabel winJLabel = new JLabel(winIcon);
            winJLabel.setBounds(203, 283, 197, 73);
            this.getContentPane().add(winJLabel);
        }

        JLabel stepCount = new JLabel("步数" + step);
        stepCount.setBounds(50, 30, 100, 20);
        this.getContentPane().add(stepCount);

/*      //路径分两种:
        //绝对路径:一定是从盘符开始的. < C:\ >
        //相对路径:不是从盘符开始的  < aaa\\bbb  >
        //相对路径相对当前项目而言的.
        //在当前项目下,去找aaa文件夹 ,里面再找bbb文件夹.
*/

        //外循环 --- 把内循环重复执行了4次.
        for (int i = 0; i < 4; i++) {
            //内循环 --- 表示在一行添加四张图片.
            for (int j = 0; j < 4; j++) {
                //获取当前要加载图片的序号
                int number = data[i][j];
                JLabel jLabel = new JLabel(new ImageIcon(path + number + ".jpg"));

                //指定图片位置
                jLabel.setBounds(105 * j + 83, 105 * i + 134, 105, 105);

                //给图片添加边框
                jLabel.setBorder(new BevelBorder(1));  //0:表示让图片凸起来; 1:表示让图片凹下去
                //把管理容器添加到界面中
/*              //this.add(jLabel1);
                //getContentPane()是JFrame的隐藏容器,这个隐藏容器不需要我们创建,
                它在创建界面对象的时候会自动生成
*/
                this.getContentPane().add(jLabel);
            }
        }

        //添加背景图片
        ImageIcon bg = new ImageIcon("yunsuanfu\\image\\background.png");
        JLabel background = new JLabel(bg);
        background.setBounds(40, 40, 508, 560);
        //把背景图片添加到界面当中
        this.getContentPane().add(background);

        //刷新一下界面
        this.getContentPane().repaint();
    }

    //初始化界面
    private void initJFrame() {
        //设置界面的宽高
        this.setSize(603, 680);  //这里数字单位代表像素的意思
        //设置界面的标题
        this.setTitle("拼图单机版 v1.0");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置游戏的关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
/* 也可以写
this.setDefaultCloseOperation(3);
小拓展:  this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE); =2
        3的 意思是只要关闭一个界面程序就停止  ; 2的意思是关闭最后一个界面 程序才停止
*/
        //取消默认的居中放置,只有取消了才会按照XY轴的形式添加组件
        this.setLayout(null);

        //给整个键盘界面添加键盘监听事件   ⭐⭐⭐⭐⭐
        this.addKeyListener(this);
    }


    @Override
    public void keyTyped(KeyEvent e) {
    }

    //按下不松时会调用这个方法
    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == 65) {
            //把界面中所有的图片全部删除
            this.getContentPane().removeAll();
            //加载第一张完整的图片
            JLabel all = new JLabel(new ImageIcon(path + "all.jpg"));
            all.setBounds(83, 134, 420, 420);
            this.getContentPane().add(all);

            //添加背景图片
            ImageIcon bg = new ImageIcon("yunsuanfu\\image\\background.png");
            JLabel background = new JLabel(bg);
            background.setBounds(40, 40, 508, 560);

            //把背景图片添加到界面当中
            this.getContentPane().add(background);
            //刷新一下界面
            this.getContentPane().repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //判断游戏是否胜利, 如果胜利, 此方法需要直接结束,不能再执行下面的移动代码了
        if (victory()) {
            //结束方法
            return;
        }

        //对上下左右进行判断
        //左:37  上:38  右:39  下:40
        int code = e.getKeyCode();
        if (code == 37) {
            System.out.println("向左");
            if (y == 3) {
                return;
            }
            data[x][y] = data[x][y + 1];
            data[x][y + 1] = 0;
            y++;
            //每移动一次,计数器就自增一次
            step++;
            //调用方法按照最新的数字加载图片
            initImage();
        } else if (code == 38) {
            System.out.println("向上");
            if (x == 3) {
                return;
            }
            //逻辑:
            //把空白方块下面的数字往上移动
            //x,y 表示空白方块
            //x+1, y 表示空白方块下面的数字
            //把空白方块下面的数字赋值给空白方块
            data[x][y] = data[x + 1][y];
            data[x + 1][y] = 0;
            x++;
            //每移动一次,计数器就自增一次
            step++;
            //调用方法按照最新的数字加载图片
            initImage();
        } else if (code == 39) {
            System.out.println("向右");
            if (y == 0) {
                return;
            }
            data[x][y] = data[x][y - 1];
            data[x][y - 1] = 0;
            y--;
            //每移动一次,计数器就自增一次
            step++;
            //调用方法按照最新的数字加载图片
            initImage();
        } else if (code == 40) {
            System.out.println("向下");
            if (x == 0) {
                return;
            }
            data[x][y] = data[x - 1][y];
            data[x - 1][y] = 0;
            x--;
            //每移动一次,计数器就自增一次
            step++;
            //调用方法按照最新的数字加载图片
            initImage();
        } else if (code == 65) {
            //调用方法按照最新的数字加载图片
            initImage();
        } else if (code == 87) {
            //直接new 一个二维数组 赋值给二维数组data
            data = new int[][]{
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 0},
            };
            //调用方法按照最新的数字加载图片
            initImage();
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        //获取当前被点击的条目对象
        Object o = e.getSource();
        if (o == replayItem) {
            System.out.println("重新游戏");
            //计步器清零
            step = 0;
            //再次打乱二维数组中的数据
            initData();
            //重新加载图片
            initImage();

        } else if (o == reLoginItem) {
            System.out.println("重新登录");
            //关闭当前的游戏界面
            this.setVisible(false);
            //打开登录界面
            new LoginJFrame();
        } else if (o == closeItem) {
            System.out.println("关闭游戏");
            //直接关闭虚拟机即可
            System.exit(0);
        } else if (o == accountItem) {
            System.out.println("公众号");
            //创建一个弹窗对象
            JDialog jDialog = new JDialog();
            //创建一个管理图片的容器对象JLabel
            JLabel jLabel = new JLabel(new ImageIcon("yunsuanfu\\image\\about.png"));
            jLabel.setBounds(0, 0, 258, 258);
            //把图片添加到弹框当中
            jDialog.getContentPane().add(jLabel);
            //给弹框设置大小
            jDialog.setSize(344, 344);
            //让弹框置顶
            jDialog.setAlwaysOnTop(true);
            //让弹框再来居中
            jDialog.setLocationRelativeTo(null);
            //弹框不关闭则无法操作下面的界面
            jDialog.setModal(true);
            //让弹框显示出来
            jDialog.setVisible(true);
        }
    }

}

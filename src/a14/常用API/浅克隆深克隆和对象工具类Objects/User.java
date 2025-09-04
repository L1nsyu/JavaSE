package a14.常用API.浅克隆深克隆和对象工具类Objects;

import java.util.StringJoiner;

//Cloneable
//如果一个接口类名没有抽象方法
//表示当前的接口是一个标记性接口
//现在Cloneable表示一旦被实现,那么当前的对象就可以被克隆
//如果没有实现,当前类的对象就不能克隆
public class User implements Cloneable {
    private int id;//游戏角色
    private String username;//用户名
    private String password;//密码
    private String path;//游戏图片
    private int[] data;//游戏进度


    public User() {
    }

    public User(int id, String username, String password, String path, int[] data) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.path = path;
        this.data = data;
    }

    /**
     * 获取
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     *
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     *
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     *
     * @return path
     */
    public String getPath() {
        return path;
    }

    /**
     * 设置
     *
     * @param path
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 获取
     *
     * @return data
     */
    public int[] getData() {
        return data;
    }

    /**
     * 设置
     *
     * @param data
     */
    public void setData(int[] data) {
        this.data = data;
    }

    public String toString() {
        return "[id = " + id + ", username = " + username + ", password = " + password + ", 游戏图片: = " + path + ", 进度 = " + arrToString() + "]";
    }

    public String arrToString() {
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        for (int i = 0; i < data.length; i++) {
            sj.add(data[i] + "");
        }
        return sj.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //因为不能直接调用 (protected)
        //所以需要重写来调用父类的clone方法
        //相当于让java帮我们克隆一个对象,并把克隆之后的对象返回出去.

        //先把被克隆的对象中的数组获取出来
        int[] arr = this.data;
        //创建新的数组
        int[] newData = new int[data.length];
        //拷贝数组中的数据
        for (int i = 0; i < data.length; i++) {
            newData[i] = arr[i];
        }
        //调用父类中通过的方法克隆对象
        User clone = (User) super.clone();
        //因为父类中的克隆方法是浅克隆,替换克隆出来对象中的数组地址值
        clone.data = newData;
        return clone;


    }
}

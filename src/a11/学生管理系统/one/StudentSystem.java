package a11.学生管理系统.one;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void startStudentSystem() {
        ArrayList<Student> list = new ArrayList<>();
        loop:
        while (true) {
            System.out.println("--------------欢迎来到黑马学生管理系统-----------------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查询学生");
            System.out.println("5.退出学生");
            System.out.println("请输入你的选择");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose) {
                case "1":
                    addStudent(list);
                    break;
                case "2":
                    deleteStudent(list);
                    break;
                case "3":
                    updateStudent(list);
                    break;
                case "4":
                    queryStudent(list);
                    break;
                case "5":
                    System.out.println("退出");
                    break loop;
//                    System.exit(0);//停止虚拟机运行
                default:
                    System.out.println("没有这个选项");
                    break;
            }
        }

    }

    //添加学生
    public static void addStudent(ArrayList<Student> list) {
        System.out.println("添加学生");

        Student stu = new Student();
        Scanner sc = new Scanner(System.in);
        String id = null;
        while (true) {
            System.out.println("请输入学生的id");
            id = sc.next();
            boolean flag = contains(list, id);
            if (flag) {
                System.out.println("此id已存在请重新输入");
            } else {
                stu.setId(id);
                break;
            }
        }
        System.out.println();


        System.out.println("请输入学生的姓名");
        String name = sc.next();
        stu.setName(name);


        System.out.println("请输入学生的年龄");
        int age = sc.nextInt();
        stu.setAge(age);

        System.out.println("请输入学生的家庭住址");
        String address = sc.next();
        stu.setAddress(address);

        list.add(stu);
        System.out.println("学生信息添加成功");
    }

    //删除学生
    public static void deleteStudent(ArrayList<Student> list) {
        System.out.println("删除学生");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的id");
        String id = sc.next();
        //查询id在集合中的索引
        int index = getIndex(list, id);
        //对index进行判断
        //如果-1,就表示不存在,结束方法,回到初始菜单
        if (index >= 0) {
            list.remove(index);
            System.out.println("删除成功");
        } else {
            System.out.println("id不存在,删除失败");
        }
    }

    //修改学生
    public static void updateStudent(ArrayList<Student> list)   {
        System.out.println("修改学生");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改学生的id");
        String id = sc.next();

        int index = getIndex(list, id);
        if (index == -1) {
            System.out.println("id不存在,请重新输入");
            return;
        }

        //当代码执行到这里,表示什么? 表示id是存在的
        Student stu = list.get(index);

        System.out.println("请输入你要修改的学生名字");
        String newName = sc.next();
        stu.setName(newName);
        System.out.println("请输入你要修改的学生年龄");
        int newAge = sc.nextInt();
        stu.setAge(newAge);
        System.out.println("请输入你要修改的学生家庭住址");
        String newAddress = sc.next();
        stu.setAddress(newAddress);

        System.out.println("学生信息修改成功");
    }

    //查询学生
    public static void queryStudent(ArrayList<Student> list) {
        System.out.println("查询学生");

        if (list.size() == 0) {
            System.out.println("当前无学生信息,请添加后再查询");
            return;
        }

        //当代码执行到这里,表示集合中是有数据的
        System.out.println("id\t姓名\t年龄\t家庭住址");
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getAddress());
        }
    }

    //判断id在集合中是否存在
    public static boolean contains(ArrayList<Student> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            String sid = stu.getId();
            if (sid.equals(id)) {
                return true;
            }
        }
        return false;

        //提高代码复用性
        //注释掉该方法的代码
        //替代为
//        return getIndex(list, id) > 0;
    }

    //通过id获取索引的方法
    public static int getIndex(ArrayList<Student> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            //得到每一个学生对象
            Student stu = list.get(i);
            //得到每一个学生对象的id
            String sid = stu.getId();
            //拿着集合中的学生id跟要查询的id进行比较
            if (sid.equals(id)) {
                return i;
            }
        }
        //当循环结束之后还没有找到,就表示不存在,返回-1
        return -1;
    }
}

package a10.ArrayList.练习添加学习对象并遍历;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo6 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Student stu = new Student();
            System.out.println("请输入学生的名字");
            String name = sc.next();
            System.out.println("请输入学生的年龄");
            int age = sc.nextInt();

            stu.setName(name);
            stu.setAge(age);

            list.add(stu);
        }
        putArrayList(list);
    }

    public static void putArrayList(ArrayList<Student> list) {
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.print("[");
            System.out.print(stu.getName() + " , " + stu.getAge());
            System.out.println("]");
        }
    }
}

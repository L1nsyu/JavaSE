package b23.IO流.o31.综合练习.o2.带权重的随机算法;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test2 {
    public static void main(String[] args) throws IOException {
        //1.把文件中所有的学生信息读取到内存中
        ArrayList<Student> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\lsy\\Desktop\\NewFileTest\\pachong.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            String[] arr = line.split("-");
            Student stu = new Student(arr[0], arr[1], Integer.parseInt(arr[2]), Double.parseDouble(arr[3]));
            list.add(stu);
        }
        br.close();

        //2.计算权重的总和
        double weight = 0;
        for (Student stu : list) {
            weight = weight + stu.getWeight();
        }


        //3.计算每一个人的实际占比
        ArrayList<Double> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            double d = list.get(i).getWeight() / weight;
            list1.add(d);
        }


        //4.计算每一个人的权重占比范围
        //[0.05, 0.05, 0.05, 0.05, 0.05, 0.05, 0.05, 0.05, 0.05, 0.05, 0.05, 0.05, 0.05, 0.05, 0.05, 0.05, 0.05, 0.05, 0.05, 0.05]
        for (int i = 1; i < list1.size(); i++) {
            double weightValue = list1.get(i) + list1.get(i - 1);
            list1.set(i, weightValue);
        }

        //[0.05, 0.1, 0.15000000000000002, 0.2, 0.25, 0.3, 0.35, 0.39999999999999997, 0.44999999999999996, 0.49999999999999994,
        // 0.5499999999999999, 0.6, 0.65, 0.7000000000000001, 0.7500000000000001, 0.8000000000000002, 0.8500000000000002,
        // 0.9000000000000002, 0.9500000000000003, 1.0000000000000002]

        //5.随机抽取
        //获取一个0.0 ~ 1.0 之间的随机数
        double number = Math.random();
        System.out.println(number);
        //判断number在arr中的位置:

        //二分查找法
        //方法会返回: -插入点 -1
        int ii = Collections.binarySearch(list1, number);
        System.out.println(ii);
        // ---> -插入点 -1 = -3
        // -插入点 -1 = 结果   --->  -插入点 = 结果 +1   --->  插入点 = -结果 -1

        //获取number这个数据在数组当中的插入点位置
        int result = -Collections.binarySearch(list1, number) - 1;
        System.out.println(result);

        //获取到的学生信息
        Student stu = list.get(result);
        System.out.println(stu);

        //6.修改当前学生的权重
        double w = stu.getWeight() / 2;
        stu.setWeight(w);

        System.out.println(list);

        //7.把集合中的数据再次写到文件中
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\lsy\\Desktop\\NewFileTest\\pachong.txt"));
        for (Student s : list) {
            bw.write(s.toString());
            bw.newLine();
        }
        bw.close();


    }
}

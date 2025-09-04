package a8.面向对象综合训练.添加和遍历;

public class StudentTest {
    public static void main(String[] args) {
        /*定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号，姓名各不相同。
            学生的属性:学号，姓名，年龄。
            要求1:再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
            要求2:添加完毕之后，遍历所有学生信息。
            要求3:通过id删除学生信息
            如果存在，则删除，如果不存在，则提示删除失败。
            要求4:删除完毕之后，遍历所有学生信息。
            要求5:查询数组id为“2”的学生，如果存在，则将他的年龄+1岁*/

        //1.定义一个长度为3的数组
        Student[] stus = new Student[3];
        //2.创建学生对象
        Student stu1 = new Student(1, "taoze", 50);
        Student stu2 = new Student(2, "fangdatong", 30);
        Student stu3 = new Student(3, "wanglihong", 40);

        //3.把对象添加到数组当中
        stus[0] = stu1;
        stus[1] = stu2;
        stus[2] = stu3;

/*
        //4.再次创建一个学生对象
        Student stu4 = new Student(4, "jay chou", 45);

        //5.唯一性判断
        //5.1 已存在 ---- 提示重复
        //5.2 不存在 ---- 添加学生对象
        boolean flag = contains(stus, stu4.getId());
        if (flag) {
            System.out.println("当前id重复,请修改id后再进行添加");
        } else {
            int count = getCount(stus);
            if (count == stus.length) {
                //老数组已经存满
                Student[] newArr = createNewArr(stus);
                newArr[count] = stu4;
                printArr(newArr);
            } else {
                //老数组没有存满
                stus[count] = stu4;
                printArr(stus);
            }
        }

        //6.添加学生对象
        //6.1 老数组已经存满
        //6.2 老数组没有存满
*/


/*        int index = getIndex(stus, 2);
        if (index >= 0) {
            stus[index] = null;
            printArr(stus);
        } else {
            System.out.println("当前id不存在,删除失败");
        }*/


        int index = getIndex(stus, 2);
        if (index >= 0) {
            Student stu = stus[index];
            int newAge = stu.getAge() + 1;
            stu.setAge(newAge);
            printArr(stus);
        } else {
            System.out.println("当前id不存在,修改失败");
        }
    }

    //判断是否包含存在
    public static boolean contains(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null) {
                int sid = stu.getId();
                if (sid == id) {
                    return true;
                }
            }
        }
        return false;
    }

    //判断老数组里面有多少个元素
    public static int getCount(Student[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;
            }
        }
        return count;
    }

    //建立新的数组
    public static Student[] createNewArr(Student[] arr) {
        Student[] newArr = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    //遍历数组的方法
    public static void printArr(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null) {
                System.out.println(stu.getAge() + "," + stu.getId() + "," + stu.getName());
            }
        }
    }

    //找到id在数组中对应的索引
    public static int getIndex(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null) {
                int sid = stu.getId();
                if (sid == id) {
                    return i;
                }
            }
        }
        return -1;
    }
}

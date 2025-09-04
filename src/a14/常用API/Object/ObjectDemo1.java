package a14.常用API.Object;

public class ObjectDemo1 {
    public static void main(String[] args) {
        //public string tostring()              返回对象的字符串表示形式
        //public boolean equals(object obj)     比较两个对象是否相等
        //protected object clone(int a)         对象克隆

        //1.toString  返回对象的字符串表示形式
        Object obj = new Object();
        String str1 = obj.toString();
        System.out.println(str1); //java.lang.Object@b4c966a

        Student stu =  new Student("zhangsan",21);
        String str2 = stu.toString();
        System.out.println(str2);//a14.常用API.Object.Student@4e50df2e

        //细节:
        //System : 类名
        //out : 静态变量
        //System.out() : 获取打印的对象
        //println(): 方法
        //参数: 表示打印的内容
        //核心逻辑:
        //当我们打印一个对象的时候,底层会调用对象的toString 方法,吧对象变成字符串.
        //然后再打印在控制台上,打印完毕换行处理.

        //思考:默认情况下,因为object类中的toString方法返回的是地址值
        //所以,默认情况下,打印一个对象打印的就是地址值
        //但是地址值对于我们是没有什么意义的?
        //我想要看到对象内部的属性值?我们该怎么办?
        //处理方案:重写父类object类中的toString方法

        System.out.println(stu);//a14.常用API.Object.Student@4e50df2e

        //toString方法的结论:
        //如果我们打印一个对象,想要看到属性值的话,那么就重写toString方法就可以了
        //在重写的方法中,把对象的属性值进行拼接,
    }
}

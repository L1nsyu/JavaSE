package a09.字符串.练习手机号屏蔽和身份证号码信息查看和敏感词替换;

public class StringDemo12 {
    public static void main(String[] args) {
        //1.获取说到的话
        String talk = "你玩的真好,以后不要再玩了,TMD";

        //2.定义一个敏感词库
        String[] arr = {"TMD", "CNM", "SB", "MLGB"};

        //3.循环得到数组中的每一个敏感词,依次进行替换
        for (int i = 0; i < arr.length; i++) {
            talk = talk.replace(arr[i], "****");
        }
        System.out.println(talk);
    }
}

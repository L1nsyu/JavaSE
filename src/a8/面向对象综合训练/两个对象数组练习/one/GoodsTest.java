package a8.面向对象综合训练.两个对象数组练习.one;

public class GoodsTest {
    public static void main(String[] args) {
        //定义数组存储三个商品对象
        //商品的属性: 商品的id , 名字 , 价格 , 库存
        //创建三个商品对象,并把商品对象存入到数组当中

        Goods[] arr = new Goods[3];

        Goods goods1 = new Goods("001", "小米13", 2399, 100);
        Goods goods2 = new Goods("002", "放置江湖月卡", 30, 2000);
        Goods goods3 = new Goods("003", "落月山庄收徒", 30, 20);

        arr[0] = goods1;
        arr[1] = goods2;
        arr[2] = goods3;

        for (int i = 0; i < arr.length; i++) {
            Goods goods = arr[i];
            System.out.println(goods.getId() + "," + goods.getName() + "," + goods.getPrice() + "," + goods.getCount());
        }

    }
}

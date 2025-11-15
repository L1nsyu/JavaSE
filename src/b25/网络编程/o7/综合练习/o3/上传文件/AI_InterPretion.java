package b25.网络编程.o7.综合练习.o3.上传文件;

public class AI_InterPretion {
    //此类用于AI对应该练习的讲解 及 IO流汇总的分析

    //核心概念：IO流的“包装”与“分工”
    //你可以把Java的IO流想象成一个多层管道系统.

    //1.
    //基础管道 (节点流 - Node Streams)：这是最底层的管道,它直接连接到数据源（如文件、网络连接）.
    //FileInputStream: 连接到本地文件的字节输入管道.
    //FileOutputStream: 连接到本地文件的字节输出管道.
    //socket.getInputStream(): 连接到网络的字节输入管道.
    //socket.getOutputStream(): 连接到网络的字节输出管道.
    //特点：它们能干活,但是效率很低,就像用勺子一勺一勺地舀水.

    //2.
    //加速管道 (处理流/缓冲流 - Processing Streams)：这是一些可以套在基础管道外面的“增强设备”.
    //BufferedInputStream / BufferedOutputStream: 它们就像在管道上加装了一个**“蓄水池”和“水泵”.
    //它们不是一勺一勺地舀水,而是一桶一桶地装卸,大大提高了效率.这是处理IO时必定要加**的性能优化层.

    //3.
    //翻译管道 (处理流/转换流 - Processing Streams)：这也是一种“增强设备”,但它的功能是**“翻译”**.
    //InputStreamReader: 把流入的字节(byte)数据,按照指定编码（如UTF-8）翻译成人类能读懂的字符(char).
    //OutputStreamWriter: 把要流出的字符(char)数据,翻译成计算机能传输的字节(byte).
    //使用场景：只有在你需要处理纯文本时,才需要这个“翻译”层.

    //4.
    //高级管道 (处理流 - Processing Streams)：套在“翻译管道”外面的更方便的工具.
    //BufferedReader / BufferedWriter: 它们在“翻译管道”的基础上,又加装了**“蓄水池”**（提高了文本处理效率）,
    //并且提供了一些更方便的方法,比如 readLine() (一次读取一行文本) 和 newLine() (写入一个换行符).
}

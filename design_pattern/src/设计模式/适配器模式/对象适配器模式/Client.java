package 设计模式.适配器模式.对象适配器模式;

/**
 * @Author: 赵静超
 * @Date: 2020/7/19 11:40
 * @Description: 客户端
 */
public class Client {
    public static void main(String[] args) {

        //适配器获取被适配者，适配完后给目标接口调用
        Target target = new Adapter(new Adapted());
        target.request();
    }
}

package 设计模式.适配器模式.类适配器模式;

/**
 * @Author: 赵静超
 * @Date: 2020/7/19 11:07
 * @Description: 客户端
 * 适配者接口经过适配器适配才可以被目标接口直接访问
 */
public class Client {

    public static void main(String[] args) {
        //适配者接口经过适配器适配才可以被目标接口直接访问
        Target adapter = new ClassAdapter();
        adapter.request();
    }
}

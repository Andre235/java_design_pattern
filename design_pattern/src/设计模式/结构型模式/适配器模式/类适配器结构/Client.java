package 设计模式.结构型模式.适配器模式.类适配器结构;


/**
 * @Author: geek
 * @Date: 2020/9/29 22:03
 * @Description: 通过适配器对象可以实现目标接口直接访问适配者接口业务
 */
public class Client {
    public static void main(String[] args) {
        Target adapter = new ClassAdapter();
        adapter.request();
    }
}

package 设计模式.结构型模式.适配器模式.对象适配器结构;

/**
 * @Author: geek
 * @Date: 2020/9/29 22:11
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        Target target = new ObjectAdapter(new Adaptee());
        target.request();
    }
}

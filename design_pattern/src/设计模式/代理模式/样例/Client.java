package 设计模式.代理模式.样例;

/**
 * @Author: 赵静超
 * @Date: 2020/7/19 10:05
 * @Description: 客户端
 * 动态代理模式作用：实现对真实主题功能的访问、控制、扩展
 */
public class Client {

    public static void main(String[] args) {
        //客户端不能直接访问真实主题类，必须通过代理类进行访问
        Proxy proxy = new Proxy();
        proxy.request();
    }
}

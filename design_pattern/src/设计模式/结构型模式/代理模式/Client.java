package 设计模式.结构型模式.代理模式;

/**
 * @Author: geek
 * @Date: 2020/9/28 22:05
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.request();
    }
}

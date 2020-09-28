package 设计模式.结构型模式.代理模式;

/**
 * @Author: geek
 * @Date: 2020/9/28 21:59
 * @Description: 抽象主题, 内部声明真实主题/代理所要实现的业务方法
 */
public interface Subject {
    void request();
}

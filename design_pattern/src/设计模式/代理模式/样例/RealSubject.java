package 设计模式.代理模式.样例;

/**
 * @Author: 赵静超
 * @Date: 2020/7/19 10:05
 * @Description: 真实主题类
 */
public class RealSubject implements Subject{

    @Override
    public void request() {
        System.out.println("访问真实主题方法...");
    }
}

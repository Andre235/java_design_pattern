package 设计模式.结构型模式.代理模式;

/**
 * @Author: geek
 * @Date: 2020/9/28 22:02
 * @Description:
 */
public class RealSubject implements Subject{

    @Override
    public void request() {
        System.out.println("访问真实主题方法...");
    }
}

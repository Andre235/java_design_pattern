package 设计模式.结构型模式.适配器模式.对象适配器结构;

/**
 * @Author: geek
 * @Date: 2020/9/29 22:11
 * @Description:
 */
public class ObjectAdapter implements Target{

    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specialRequest();
    }
}

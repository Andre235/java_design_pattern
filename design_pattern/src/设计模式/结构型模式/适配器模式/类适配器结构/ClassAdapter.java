package 设计模式.结构型模式.适配器模式.类适配器结构;

/**
 * @Author: geek
 * @Date: 2020/9/29 22:02
 * @Description:
 */
public class ClassAdapter extends Adaptee implements Target {

    @Override
    public void request() {
        specialRequest();
    }
}

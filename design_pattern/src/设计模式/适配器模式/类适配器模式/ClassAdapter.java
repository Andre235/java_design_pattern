package 设计模式.适配器模式.类适配器模式;

/**
 * @Author: 赵静超
 * @Date: 2020/7/19 11:06
 * @Description: 类适配器
 */
public class ClassAdapter extends Adapteree implements Target {

    @Override
    public void request() {
        super.specificRequest();
    }
}

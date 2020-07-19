package 设计模式.适配器模式.对象适配器模式;

import 设计模式.适配器模式.类适配器模式.Adapteree;

/**
 * @Author: 赵静超
 * @Date: 2020/7/19 11:40
 * @Description: 对象适配器
 */
public class Adapter implements Target{

    private Adapted adapted;

    /**
     * 获取被适配者
     */
    public Adapter(Adapted adapted) {
        this.adapted = adapted;
    }

    @Override
    public void request() {
        adapted.specificRequest();
    }
}

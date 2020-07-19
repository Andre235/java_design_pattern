package 设计模式.适配器模式.类适配器模式;

/**
 * @Author: 赵静超
 * @Date: 2020/7/19 11:02
 * @Description: 适配器接口(可以理解为已有组件库中与当前系统不兼容的接口，即不能直接进行调用，需要通过适配器进行适配)
 */
public class Adapteree {

    public void specificRequest() {
        System.out.println("适配者中的业务代码被调用...");
    }
}

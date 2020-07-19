package 设计模式.适配器模式.对象适配器模式;

/**
 * @Author: 赵静超
 * @Date: 2020/7/19 11:40
 * @Description: 被适配者接口
 */
public class Adapted {

    public void specificRequest() {
        System.out.println("适配者中的业务代码被调用...");
    }
}

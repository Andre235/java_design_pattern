package 设计模式.结构型模式.适配器模式.对象适配器结构;

/**
 * @Author: geek
 * @Date: 2020/9/29 22:00
 * @Description: 适配者类
 */
public class Adaptee {

    public void specialRequest(){
        System.out.println("适配者中的业务代码被调用...");
    }
}
